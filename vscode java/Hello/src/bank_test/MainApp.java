package bank_test;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("은행 관리 프로그램 시작");
        InputReader inputReader = new InputReader();    // scanner 함수
        BankService bankService = new BankService();    // 계좌 
        AdminService adminService = new AdminService(bankService);  // 계좌 삭제, 수정 함수
        Menu menu = new MainMenu(bankService, adminService, inputReader);

        while(menu != null){
            menu.print();   // 현재 메뉴 출력
            menu = menu.next(); // 
        }

        System.out.println("프로그램 종료");
    }
}
