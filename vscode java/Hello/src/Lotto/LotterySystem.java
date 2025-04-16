package Lotto;

import java.util.List;
import java.util.Scanner;

public class LotterySystem {
    private static List<Member> members;
    private static Scanner scanner = new Scanner(System.in);

    private static void saveData() {
        FileManager.saveMembers(members);
    }

    // 회원 메뉴
    private static void showMemberMenu(Membership member) {
        while (true) {
            System.out.println("\n=== 회원 메뉴 ===");
            System.out.println("1. 복권 구매 (자동)");
            System.out.println("2. 복권 구매 (수동)");
            System.out.println("3. 당첨 확인");
            System.out.println("4. 잔액 충전");
            System.out.println("5. 로그아웃");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    member.buyLottery(true);
                    break;
                case 2:
                    member.buyLottery(false);
                    break;
                case 3:
                    List<Integer> winningNumbers = generateWinningNumbers();
                    member.checkWinning(winningNumbers);
                    break;
                case 4:
                    System.out.print("충전할 금액: ");
                    double amount = scanner.nextDouble();
                    member.addBalance(amount);
                    break;
                case 5:
                    return;
            }

            saveData(); // 변경사항 저장
        }
    }
}
