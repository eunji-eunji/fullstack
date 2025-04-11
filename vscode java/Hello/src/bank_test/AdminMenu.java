package bank_test;

public class AdminMenu extends AbstractMenu {
    private final AdminService adminService;
    private final InputReader input;

    public AdminMenu(AdminService adminService, InputReader input) {
        super("관리자 메뉴");
        this.adminService = adminService;
        this.input = input;
    }

    // 추상클래스 AbstractMenu가 implements한 Menu interface의 next() 함수 구현
    @Override
    public Menu next() {
        System.out.println("1. 계좌 삭제\n2. 계좌 정보 수정\n0. 메인으로");
        String ch = input.readLine("선택 > ");

        switch (ch) {
            case "1" -> {
                String accNum = input.readLine("삭제할 계좌번호: ");
                if (adminService.delete(accNum)) {
                    System.out.println("삭제 완료");
                } else {
                    System.out.println("계좌를 찾을 수 없습니다.");
                }
            }
            case "2" -> {
                String accNum = input.readLine("수정할 계좌번호: ");
                String name = input.readLine("새 이름: ");
                String birth = input.readLine("새 생년월일: ");
                String pw = input.readLine("새 비밀번호: ");
                if (adminService.update(accNum, name, birth, pw)) {
                    System.out.println("정보 수정 완료");
                } else {
                    System.out.println("계좌 수정 실패");
                }
            }
            case "0" -> {
                return null;
            }
            default -> System.out.println("잘못 입력하셨습니다.");
        }
        return this;
    }
}
