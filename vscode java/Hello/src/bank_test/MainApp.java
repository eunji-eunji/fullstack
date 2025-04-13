package bank_test;

// 메인 프로그램
public class MainApp {  
    public static void main(String[] args) {
        System.out.println("계좌 관리 프로그램 시작");
        InputReader inputReader = new InputReader();    // scanner
        BankService bankService = new BankService();    // 계좌 정보
        AdminService adminService = new AdminService(bankService);  // 계좌 삭제, 수정
        Menu menu = new MainMenu(bankService, adminService, inputReader);
        // ↑ menu에 MainMenu 객체를 생성해서 넣어줌. 처음엔 menu는 null이 아니라 MainMenu 인스턴스를 가리키고 있음.

        while(menu != null){
            menu.print();   // 관리자 메뉴 or 은행 메인 메뉴
            menu = menu.next(); // 현재 메뉴 출력
        }

        System.out.println("프로그램 종료");
    }
}
