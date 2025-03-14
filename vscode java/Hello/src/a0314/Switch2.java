package a0314;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("등급을 입력하세요.");
        int grade = scan.nextInt();
        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2: //2도 3000
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }

        scan.close();
        System.out.printf("발급받은 쿠폰 %d", coupon);
    }
}
