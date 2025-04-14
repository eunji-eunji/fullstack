package bank_test;

// AbstractMenu 추상클래스 상속
public class MainMenu extends AbstractMenu {
    private final BankService bankService;
    private final AdminService adminService;
    private final InputReader input;

    public MainMenu(BankService bs, AdminService as, InputReader in) {
        super("은행 메인 메뉴");    // AbstractMenu("은행 메인 메뉴")
        this.bankService = bs;
        this.adminService = as;
        this.input = in;
    }

    // AbstractMenu가 상속한 메뉴 인터페이스의 next() 함수 구현
    @Override
    public Menu next() {
        System.out.println("1. 계좌 생성\n2. 입금\n3. 출금\n4. 잔고조회\n5. 계좌이체\n6. 관리자 메뉴\n0. 종료");
        String ch = input.readLine("선택 > ");

        switch (ch) {
            case "1" -> {   // 계좌 생성
                String name = input.readLine("이름: ");
                String birth = input.readLine("생년월일(YYYYMMDD): ");
                String pw = input.readLine("비밀번호: ");
                int money = input.readInt("초기 입금액(1000원 이상): ");
                Account acc = bankService.createAccount(name, birth, pw, money);
                if (acc != null) {
                    System.out.println("계좌 생성 완료: " + acc.getAccountNumber());
                } else {
                    System.out.println("1000원 이상 입금해야 계좌 생성이 가능합니다.");
                }
            }
            case "2" -> {   // 입금
                String num = input.readLine("계좌번호(-포함): ");
                int credit = input.readInt("입금액: ");
                Account acc = bankService.findAccount(num);
                if (acc != null) {
                    acc.deposit(credit);
                    System.out.println("입금 완료, 현재 잔고: " + acc.getBalance());
                } else {
                    System.out.println("계좌를 찾을 수 없습니다.");
                }
            }
            case "3" -> {   // 출금
                String num = input.readLine("계좌번호(-포함): ");
                String pw = input.readLine("비밀번호: ");
                int withdraw = input.readInt("출금액: ");
                Account acc = bankService.findAccount(num);
                if (acc != null && acc.checkPassword(pw) && acc.withdraw(withdraw)) {
                    System.out.println("출금 완료, 현재 잔고: " + acc.getBalance());
                } else {
                    System.out.println("출금 실패 (계좌 또는 비밀번호 확인 / 잔액 부족)");
                }
            }
            case "4" -> {   // 잔고 조회
                String num = input.readLine("계좌번호(-포함): ");
                String pw = input.readLine("비밀번호: ");
                Account acc = bankService.findAccount(num);
                if (acc != null && acc.checkPassword(pw)) {
                    System.out.println("현재 잔고: " + acc.getBalance());
                } else {
                    System.out.println("계좌번호 또는 비밀번호 오류");
                }
            }
            case "5" -> {   // 계좌 이체
                String from = input.readLine("보내는 계좌(-포함): ");
                String pw = input.readLine("비밀번호: ");
                String to = input.readLine("받는 계좌(-포함): ");
                int money = input.readInt("금액: ");
                if (bankService.transfer(from, to, pw, money)) {
                    System.out.println("이체 완료");
                } else {
                    System.out.println("이체 실패 (계좌 또는 비밀번호 확인 / 잔액 부족)");
                }
            }
            case "6" -> {   // 관리자 메뉴(비밀번호: admin123)
                String adminPw = input.readLine("관리자 비밀번호 입력: ");
                if (!"admin123".equals(adminPw)) {
                    System.out.println("비밀번호 오류");
                    return this;
                }
                return new AdminMenu(bankService, adminService, input);
            }
            case "0" -> {   // 프로그램 종료
                return null;
            }
            default ->
                System.out.println("잘못 입력하셨습니다.");
        }
        return this;
    }
}
