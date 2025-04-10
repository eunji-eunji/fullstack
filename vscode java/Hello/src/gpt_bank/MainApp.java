package gpt_bank;

import bank_test.InputReader;
import bank_test.Menu;

public class MainApp {
      public static void main(String[] args) {
        System.out.println("\uD83D\uDCB3 은행 관리 프로그램 시작");

        InputReader inputReader = new InputReader();
        BankService bankService = new BankService();
        AdminService adminService = new AdminService(bankService);
        Menu menu = new MainMenu(bankService, adminService, inputReader);

        while (menu != null) {
            menu.print();
            menu = menu.next();
        }

        System.out.println("\uD83D\uDC4B 프로그램 종료");
    }
}
