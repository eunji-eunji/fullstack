// 관리자 대시보드 관련 함수들

// 대시보드 데이터를 렌더링하는 함수
async function renderDashboard() {
    try {
        const enrollments = await getAllEnrollments();
        const dashboardContainer = document.getElementById('dashboardContent');
        
        if (enrollments.length === 0) {
            dashboardContainer.innerHTML = '<div class="no-data">아직 수강 신청이 없습니다.</div>';
            return;
        }

        let dashboardHTML = `
            <div class="dashboard-header">
                <h2>수강 신청 관리 대시보드</h2>
                <div class="stats">
                    <div class="stat-item">
                        <span class="stat-number">${enrollments.length}</span>
                        <span class="stat-label">총 신청</span>
                    </div>
                    <div class="stat-item">
                        <span class="stat-number">${enrollments.filter(e => e.status === 'pending').length}</span>
                        <span class="stat-label">대기중</span>
                    </div>
                    <div class="stat-item">
                        <span class="stat-number">${enrollments.filter(e => e.status === 'approved').length}</span>
                        <span class="stat-label">승인됨</span>
                    </div>
                </div>
            </div>
            <div class="enrollments-table">
                <table>
                    <thead>
                        <tr>
                            <th>신청일시</th>
                            <th>이름</th>
                            <th>이메일</th>
                            <th>휴대폰</th>
                            <th>강의</th>
                            <th>신청동기</th>
                            <th>상태</th>
                            <th>액션</th>
                        </tr>
                    </thead>
                    <tbody>
        `;

        enrollments.forEach(enrollment => {
            const date = enrollment.timestamp ? new Date(enrollment.timestamp.toDate()).toLocaleString('ko-KR') : '날짜 없음';
            const statusClass = getStatusClass(enrollment.status);
            const statusText = getStatusText(enrollment.status);
            
            dashboardHTML += `
                <tr data-id="${enrollment.id}">
                    <td>${date}</td>
                    <td>${enrollment.name}</td>
                    <td>${enrollment.email}</td>
                    <td>${enrollment.phone}</td>
                    <td>${enrollment.course || '미지정'}</td>
                    <td>
                        <div class="motivation-preview" onclick="showMotivation('${enrollment.motivation}')">
                            ${enrollment.motivation.length > 30 ? enrollment.motivation.substring(0, 30) + '...' : enrollment.motivation}
                        </div>
                    </td>
                    <td>
                        <select class="status-select ${statusClass}" onchange="updateStatus('${enrollment.id}', this.value)">
                            <option value="pending" ${enrollment.status === 'pending' ? 'selected' : ''}>대기중</option>
                            <option value="approved" ${enrollment.status === 'approved' ? 'selected' : ''}>승인됨</option>
                            <option value="rejected" ${enrollment.status === 'rejected' ? 'selected' : ''}>거절됨</option>
                        </select>
                    </td>
                    <td>
                        <button class="action-btn delete-btn" onclick="deleteEnrollmentItem('${enrollment.id}')">삭제</button>
                    </td>
                </tr>
            `;
        });

        dashboardHTML += `
                    </tbody>
                </table>
            </div>
        `;

        dashboardContainer.innerHTML = dashboardHTML;
    } catch (error) {
        console.error('대시보드 렌더링 중 오류 발생:', error);
        document.getElementById('dashboardContent').innerHTML = '<div class="error">데이터를 불러오는 중 오류가 발생했습니다.</div>';
    }
}

// 상태에 따른 CSS 클래스 반환
function getStatusClass(status) {
    switch (status) {
        case 'pending': return 'status-pending';
        case 'approved': return 'status-approved';
        case 'rejected': return 'status-rejected';
        default: return 'status-pending';
    }
}

// 상태에 따른 텍스트 반환
function getStatusText(status) {
    switch (status) {
        case 'pending': return '대기중';
        case 'approved': return '승인됨';
        case 'rejected': return '거절됨';
        default: return '대기중';
    }
}

// 상태 업데이트 함수
async function updateStatus(enrollmentId, newStatus) {
    try {
        await updateEnrollmentStatus(enrollmentId, newStatus);
        showNotification('상태가 성공적으로 업데이트되었습니다.', 'success');
        renderDashboard(); // 대시보드 새로고침
    } catch (error) {
        showNotification('상태 업데이트 중 오류가 발생했습니다.', 'error');
    }
}

// 수강 신청 삭제 함수
async function deleteEnrollmentItem(enrollmentId) {
    if (confirm('정말로 이 수강 신청을 삭제하시겠습니까?')) {
        try {
            await deleteEnrollment(enrollmentId);
            showNotification('수강 신청이 성공적으로 삭제되었습니다.', 'success');
            renderDashboard(); // 대시보드 새로고침
        } catch (error) {
            showNotification('삭제 중 오류가 발생했습니다.', 'error');
        }
    }
}

// 신청동기 전체 보기 함수
function showMotivation(motivation) {
    const modal = document.createElement('div');
    modal.className = 'motivation-modal';
    modal.innerHTML = `
        <div class="motivation-content">
            <div class="motivation-header">
                <h3>신청 동기</h3>
                <span class="close" onclick="this.parentElement.parentElement.parentElement.remove()">&times;</span>
            </div>
            <div class="motivation-body">
                <p>${motivation}</p>
            </div>
        </div>
    `;
    document.body.appendChild(modal);
}

// 알림 표시 함수
function showNotification(message, type = 'info') {
    const notification = document.createElement('div');
    notification.className = `notification notification-${type}`;
    notification.textContent = message;
    
    document.body.appendChild(notification);
    
    // 3초 후 자동 제거
    setTimeout(() => {
        notification.remove();
    }, 3000);
}

// 대시보드 새로고침 함수
function refreshDashboard() {
    renderDashboard();
}

// 페이지 로드 시 대시보드 렌더링
document.addEventListener('DOMContentLoaded', function() {
    // 관리자 페이지인 경우에만 대시보드 렌더링
    if (document.getElementById('dashboardContent')) {
        renderDashboard();
    }
}); 