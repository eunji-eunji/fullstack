package a0314;

import java.util.Scanner;

public class if3 {
    public static void main(String[] args) {
        // int price = 10000;
        // int age = 10;
        int discount = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("가격을 입력하세요.");
        int price = scan.nextInt();
        System.out.println("나이를 입력하세요.");
        int age = scan.nextInt();
        
        if(price>=10000){
            discount+=1000;
            System.out.println("10,000원 이상 구매, 1,000원 할인");
        }
        if(age<=10){
            discount+=1000;
            System.out.println("10살 이하, 1,000원 할인");
        }
        System.out.printf("총 할인 금액: %d원\n", discount);
        System.out.printf("결제금액은 %d입니다.", price-discount);
    }
}
