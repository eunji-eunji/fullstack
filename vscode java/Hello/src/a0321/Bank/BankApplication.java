package a0321.Bank;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    // 모든 계좌 정보를 저장할 수 있음 - 하나의 배열에 저장. 공용 배열이기 때문에 static 씀
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;

        while (flag) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.이체 | 6.종료");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택> ");
            int choice = Integer.parseInt(scan.nextLine());

            if (choice == 1) {
                createAccount();
            } else if (choice == 2) {
                accountList();
            } else if (choice == 3) {
                deposit();
            } else if (choice == 4) {
                withdraw();
            } else if (choice == 5) {
                transfer();
            } else if (choice == 6) {
                flag = false;
            }
        }
        System.out.println("프로그램 종료");

    }

    private static void createAccount() {
        System.out.println("------------");
        System.out.println("계좌생성");
        System.out.println("------------");
        System.out.print("계좌번호: ");
        String ano = scan.nextLine();
        System.out.print("계좌주: ");
        String owner = scan.nextLine();
        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(scan.nextLine());

        Account newAccount = new Account(ano, owner, balance);
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
        // accountArray[0] = newAccount("110-110", "gildong", 10000)
        // accountArray[1] = newAccount("110-111", "sunja", 20000)
    }

    private static void accountList() {
        System.out.println("------------");
        System.out.println("계좌목록");
        System.out.println("------------");
        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];
            if (account == null)
                break;
            System.out.printf("%s   %s   %d\n", account.getAno(), account.getOwner(),
                    account.getBalance());
        }
    }

    private static void deposit() {
        System.out.println("------------");
        System.out.println("예금");
        System.out.println("------------");
        System.out.print("계좌번호: ");
        String ano = scan.nextLine();
        System.out.print("예금액: ");
        int balance = Integer.parseInt(scan.nextLine());

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() + balance);

    }

    // Account 객체를 반환해야 하므로 Account 객체 타입 함수 작성
    private static Account findAccount(String ano) {
        Account account = null;
        // 비어있는 객체를 생성. 이 객체에 계좌번호가 같은 객체를 저장해야 하므로.
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                String dbAno = accountArray[i].getAno();
                if (ano.equals(dbAno)) {
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
        // 계좌번호가 같은 객체를 반환

    }


    private static void withdraw() {
        System.out.println("------------");
        System.out.println("출금");
        System.out.println("------------");
        System.out.print("계좌번호: ");
        String ano = scan.nextLine();
        System.out.print("출금액: ");
        int balance = Integer.parseInt(scan.nextLine());

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() - balance);
    }

    private static void transfer(){
        System.out.println("------------");
        System.out.println("이체");
        System.out.println("------------");
        System.out.print("보내는 계좌번호: ");
        String ano1 = scan.nextLine();
        System.out.print("받는 계좌번호: ");
        String ano2 = scan.nextLine();
        System.out.print("출금액: ");
        int balance = Integer.parseInt(scan.nextLine());

        Account account1 = findAccount(ano1);
        Account account2 = findAccount(ano2);
        if (account1 == null) {
            System.out.println("결과: 보내는 계좌가 없습니다.");
            return;
        }
        if (account2 == null) {
            System.out.println("결과: 받는 계좌가 없습니다.");
            return;
        }
        account1.setBalance(account1.getBalance() - balance);
        account2.setBalance(account2.getBalance() + balance);
    }
}
