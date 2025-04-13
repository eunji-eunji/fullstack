package bank_test;

// 관리자 메뉴 - 계좌 삭제, 수정
public class AdminService {
    private final BankService bankService;

    // 생성자
    public AdminService(BankService bankService) {
        this.bankService = bankService;
    }

    // 계좌 삭제
    public boolean delete(String accNum) {
        return bankService.deleteAccount(accNum);
    }

    // 계좌 정보 수정
    public boolean update(String accNum, String name, String birth, String pw) {
        Account a = bankService.findAccount(accNum); // 맵에서 계좌번호(key) 검색해서 Account(value) 반환
        if (a == null)  // 없는 계좌일 경우 false
            return false;
        a.updateInfo(name, birth, pw);
        return true;
    }
}
