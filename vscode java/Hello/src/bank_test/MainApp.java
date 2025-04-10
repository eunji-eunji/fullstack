package bank_test;

import gpt_bank.MainMenu;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("은행 관리 프로그램 시작");
        InputReader inputReader = new InputReader();
        BankService bankService = new BankService();
        AdminService adminService = new AdminService(bankService);
        Menu menu = new MainMenu(bankService, adminService, inputReader);

        while(menu != null){
            menu.print();
            menu = menu.next();
        }

        System.out.println("프로그램 종료");
    }
}
