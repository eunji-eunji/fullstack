package Lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class ShowMemberMenu {
    public int balance = 0;
    private List<LotteryNumbers> numbers;
    
    
    // 로또 번호를 저장하는 클래스
    class LotteryNumbers {
        private List<Integer> numbers;  // 로또 번호 저장 리스트
        private String purchaseDate;    // 구매일자 (왜 필요한지?)

        public LotteryNumbers(List<Integer> numbers) {
            this.numbers = numbers;
            this.purchaseDate = new Date().toString();
        }

        public List<Integer> getNumbers() {
            return numbers;
        }

        public String getPurchaseDate() {
            return purchaseDate;
        }
    }

    // 복권 번호 자동 생성
    public List<Integer> generateAutoNumbers() {
        Set<Integer> numberSet = new HashSet<>();
        Random random = new Random();

        while (numberSet.size() < 6) {
            numberSet.add(random.nextInt(45) + 1);
        }

        List<Integer> numbers = new ArrayList<>(numberSet);
        Collections.sort(numbers);
        return numbers;
    }

    // 복권 구매 메소드
    public void buyLottery(boolean isAuto) {
        if (balance >= 1000) {
            List<Integer> numbers1;
            if (isAuto) {
                numbers1 = generateAutoNumbers();
            } else {
                numbers1 = inputManualNumbers();
            }

            balance -= 1000;
            numbers.add(new LotteryNumbers(numbers1));
            System.out.println("구매한 번호: " + numbers1);
            System.out.println("복권 구매가 완료되었습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    // 수동 번호 입력
    private List<Integer> inputManualNumbers() {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numberSet = new HashSet<>();

        System.out.println("1부터 45까지의 숫자 6개를 입력하세요:");
        while (numberSet.size() < 6) {
            int num = scanner.nextInt();
            if (num >= 1 && num <= 45) {
                numberSet.add(num);
            } else {
                System.out.println("1-45 사이의 숫자를 입력하세요.");
            }
        }

        List<Integer> numbers = new ArrayList<>(numberSet);
        Collections.sort(numbers);
        return numbers;
    }

    // 당첨 확인 메소드
    public void checkWinning(List<Integer> winningNumbers) {
        for (LotteryNumbers lottery : numbers) {
            List<Integer> myNumbers = lottery.getNumbers();
            int matchCount = 0;

            for (int num : myNumbers) {
                if (winningNumbers.contains(num)) {
                    matchCount++;
                }
            }

            System.out.println("\n구매일자: " + lottery.getPurchaseDate());
            System.out.println("내 번호: " + myNumbers);
            System.out.println("당첨 번호: " + winningNumbers);
            System.out.println("일치하는 번호 개수: " + matchCount);

            // 당첨금 지급
            switch (matchCount) {
                case 6:
                    balance += 1000000000; // 1등
                    System.out.println("1등 당첨! (10억원)");
                    break;
                case 5:
                    balance += 50000000; // 2등
                    System.out.println("2등 당첨! (5천만원)");
                    break;
                case 4:
                    balance += 1000000; // 3등
                    System.out.println("3등 당첨! (100만원)");
                    break;
                case 3:
                    balance += 5000; // 4등
                    System.out.println("4등 당첨! (5천원)");
                    break;
                default:
                    System.out.println("아쉽게도 당첨되지 않았습니다.");
            }
        }
    }

    public void addBalance(double amount) {
        this.balance += amount;
    }
}

// // 메인 클래스 수정
// public class LotterySystem {
//     private static Admin admin;
//     // private static List<Member> members;
//     private static Scanner scanner;

//     // public static void main(String[] args) {
//     //     initialize();
//     //     showMainMenu();
//     //     saveData();
//     // }

//     // private static void initialize() {
//     //     admin = FileManager.loadAdmin();
//     //     members = FileManager.loadMembers();
//     //     scanner = new Scanner(System.in);
//     // }

//     private static void saveData() {
//         FileManager.saveAdmin(admin);
//         FileManager.saveMembers(members);
//     }

//     // 회원 메뉴
//     private static void showMemberMenu(Membership member) {
//         while (true) {
//             System.out.println("\n=== 회원 메뉴 ===");
//             System.out.println("1. 복권 구매 (자동)");
//             System.out.println("2. 복권 구매 (수동)");
//             System.out.println("3. 당첨 확인");
//             System.out.println("4. 잔액 충전");
//             System.out.println("5. 로그아웃");

//             int choice = scanner.nextInt();

//             switch (choice) {
//                 case 1:
//                     member.buyLottery(true);
//                     break;
//                 case 2:
//                     member.buyLottery(false);
//                     break;
//                 case 3:
//                     List<Integer> winningNumbers = admin.generateWinningNumbers();
//                     member.checkWinning(winningNumbers);
//                     break;
//                 case 4:
//                     System.out.print("충전할 금액: ");
//                     double amount = scanner.nextDouble();
//                     member.addBalance(amount);
//                     break;
//                 case 5:
//                     return;
//             }

//             saveData(); // 변경사항 저장
//         }
//     }
// }
