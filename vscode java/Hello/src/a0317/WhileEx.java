import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = 0;
        boolean flag = true;

        while (flag) {
            System.out.println("================================");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("================================");
            System.out.print("선택> ");
            int a = scan.nextInt();

            while (a == 1) { // 이중 while문.
                System.out.println("예금액>");
                int b = scan.nextInt();
                money += b;
                break;
            }
            while (a == 2) {
                System.out.println("출금액>");
                int c = scan.nextInt();
                money -= c;
                break;
            }
            while (a == 3) {
                System.out.println("잔고>" + money);
                break;
            }

            while (a == 4) {
                System.out.println("프로그램 종료");
                flag = false;
                break;
            }

            // switch
            switch (a) {
                case 1:
                    System.out.println("예금액>");
                    int b = scan.nextInt();
                    money += b;
                    break;
                case 2:
                    System.out.println("출금액>");
                    int c = scan.nextInt();
                    money -= c;
                    break;
                case 3:
                    System.out.println("잔고>" + money);
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    flag = false;
                    break;
            }

        }
        scan.close();
    }
}
