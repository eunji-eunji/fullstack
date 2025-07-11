# AI Academy - 수강 신청 시스템

AI 강의 사이트의 수강 신청 시스템입니다. Firebase Firestore를 사용하여 데이터를 관리하고, 관리자 대시보드에서 신청 현황을 확인할 수 있습니다.

## 🚀 주요 기능

### 사용자 기능
- AI 강의 소개 및 미리보기
- 수강 신청 폼 (이름, 이메일, 휴대폰, 강의 선택, 신청동기)
- 실시간 Firebase 데이터 저장

### 관리자 기능
- 수강 신청 현황 대시보드
- 신청 상태 관리 (대기중/승인됨/거절됨)
- 신청자 정보 조회 및 삭제
- 통계 정보 확인

## 📁 파일 구조

```
project1/
├── index.html          # 메인 페이지
├── admin.html          # 관리자 대시보드
├── firebase-config.js  # Firebase 설정 및 데이터 처리
├── admin-dashboard.js  # 관리자 대시보드 기능
└── README.md          # 프로젝트 설명서
```

## ⚙️ 설정 방법

### 1. Firebase 프로젝트 생성

1. [Firebase Console](https://console.firebase.google.com/)에 접속
2. 새 프로젝트 생성
3. Firestore Database 활성화
4. 보안 규칙 설정 (테스트 모드로 시작)

### 2. Firebase 설정 업데이트

`firebase-config.js` 파일에서 Firebase 설정을 업데이트하세요:

```javascript
const firebaseConfig = {
    apiKey: "YOUR_API_KEY",
    authDomain: "YOUR_PROJECT_ID.firebaseapp.com",
    projectId: "YOUR_PROJECT_ID",
    storageBucket: "YOUR_PROJECT_ID.appspot.com",
    messagingSenderId: "YOUR_SENDER_ID",
    appId: "YOUR_APP_ID"
};
```

### 3. Firestore 보안 규칙 설정

Firestore Database > 규칙에서 다음 규칙을 설정하세요:

```javascript
rules_version = '2';
service cloud.firestore {
  match /databases/{database}/documents {
    match /enrollments/{document} {
      allow read, write: if true;  // 테스트용 (실제 운영 시 인증 추가 필요)
    }
  }
}
```

## 🎯 사용 방법

### 메인 페이지 (index.html)
1. 웹 브라우저에서 `index.html` 열기
2. 원하는 강의의 "수강 신청하기" 버튼 클릭
3. 수강 신청 폼 작성 및 제출
4. 오른쪽 상단 "관리자" 버튼으로 대시보드 접근

### 관리자 대시보드 (admin.html)
1. 메인 페이지의 "관리자" 버튼 클릭 또는 직접 `admin.html` 접근
2. 수강 신청 현황 확인
3. 신청 상태 변경 (대기중/승인됨/거절됨)
4. 신청자 정보 삭제
5. 신청동기 전체 내용 확인

## 📊 데이터 구조

Firestore의 `enrollments` 컬렉션에 저장되는 데이터 구조:

```javascript
{
    name: "신청자 이름",
    email: "이메일 주소",
    phone: "휴대폰 번호",
    course: "신청 강의명",
    motivation: "신청 동기",
    timestamp: "신청 일시",
    status: "pending" // pending, approved, rejected
}
```

## 🎨 디자인 특징

- 반응형 디자인 (모바일, 태블릿, PC 지원)
- 현대적이고 아름다운 UI/UX
- 부드러운 애니메이션 효과
- 직관적인 사용자 인터페이스

## 🔧 기술 스택

- **Frontend**: HTML5, CSS3, JavaScript (ES6+)
- **Database**: Firebase Firestore
- **Hosting**: Firebase Hosting (권장)

## 🚀 배포 방법

### Firebase Hosting 사용 (권장)

1. Firebase CLI 설치:
```bash
npm install -g firebase-tools
```

2. Firebase 로그인:
```bash
firebase login
```

3. 프로젝트 초기화:
```bash
firebase init hosting
```

4. 배포:
```bash
firebase deploy
```

### 일반 웹 서버

모든 파일을 웹 서버에 업로드하면 됩니다. Firebase 설정이 올바르게 되어 있다면 바로 사용 가능합니다.

## 🔒 보안 고려사항

현재 버전은 테스트용으로 모든 사용자가 데이터를 읽고 쓸 수 있도록 설정되어 있습니다. 실제 운영 시에는 다음 사항을 고려하세요:

1. Firebase Authentication 추가
2. Firestore 보안 규칙 강화
3. 관리자 인증 시스템 구현
4. 데이터 암호화 고려

## 📝 라이선스

이 프로젝트는 MIT 라이선스 하에 배포됩니다.

## 🤝 기여하기

버그 리포트나 기능 제안은 언제든 환영합니다!

---

**주의**: 실제 운영 전에 Firebase 설정과 보안 규칙을 반드시 확인하세요. 