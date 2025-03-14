package a0314;

import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("등급을 입력하세요.");
        int grade = scan.nextInt();
        // int coupon;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        scan.close();
        System.out.printf("발급받은 쿠폰 %d", coupon);
    }
}
