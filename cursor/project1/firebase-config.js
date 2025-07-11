// Firebase 설정
const firebaseConfig = {
    // apiKey: "YOUR_API_KEY",
    // authDomain: "YOUR_PROJECT_ID.firebaseapp.com",
    // projectId: "YOUR_PROJECT_ID",
    // storageBucket: "YOUR_PROJECT_ID.appspot.com",
    // messagingSenderId: "YOUR_SENDER_ID",
    // appId: "YOUR_APP_ID"
    apiKey: "AIzaSyCWnF-HAVsF2wjVAdcZ1qolo5wYll1bZp4",
    authDomain: "project-ca59b.firebaseapp.com",
    projectId: "project-ca59b",
    storageBucket: "project-ca59b.firebasestorage.app",
    messagingSenderId: "1068672293172",
    appId: "1:1068672293172:web:5fcb63dd24e7f152bded61",
    measurementId: "G-Z5WFDNN1YF"
};

// Firebase 초기화
firebase.initializeApp(firebaseConfig);
const db = firebase.firestore();

// 수강 신청 데이터를 Firestore에 저장하는 함수
async function saveEnrollmentData(enrollmentData) {
    try {
        const docRef = await db.collection('enrollments').add({
            name: enrollmentData.name,
            email: enrollmentData.email,
            phone: enrollmentData.phone,
            motivation: enrollmentData.motivation,
            course: enrollmentData.course,
            timestamp: firebase.firestore.FieldValue.serverTimestamp(),
            status: 'pending'
        });
        console.log('수강 신청이 성공적으로 저장되었습니다. ID:', docRef.id);
        return docRef.id;
    } catch (error) {
        console.error('수강 신청 저장 중 오류 발생:', error);
        throw error;
    }
}

// 모든 수강 신청 데이터를 가져오는 함수
async function getAllEnrollments() {
    try {
        const snapshot = await db.collection('enrollments')
            .orderBy('timestamp', 'desc')
            .get();
        
        const enrollments = [];
        snapshot.forEach(doc => {
            enrollments.push({
                id: doc.id,
                ...doc.data()
            });
        });
        return enrollments;
    } catch (error) {
        console.error('수강 신청 데이터 조회 중 오류 발생:', error);
        throw error;
    }
}

// 수강 신청 상태를 업데이트하는 함수
async function updateEnrollmentStatus(enrollmentId, status) {
    try {
        await db.collection('enrollments').doc(enrollmentId).update({
            status: status,
            updatedAt: firebase.firestore.FieldValue.serverTimestamp()
        });
        console.log('상태가 성공적으로 업데이트되었습니다.');
    } catch (error) {
        console.error('상태 업데이트 중 오류 발생:', error);
        throw error;
    }
}

// 수강 신청을 삭제하는 함수
async function deleteEnrollment(enrollmentId) {
    try {
        await db.collection('enrollments').doc(enrollmentId).delete();
        console.log('수강 신청이 성공적으로 삭제되었습니다.');
    } catch (error) {
        console.error('수강 신청 삭제 중 오류 발생:', error);
        throw error;
    }
} 