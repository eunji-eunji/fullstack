package a0314;

import java.util.Scanner;

public class if4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("등급을 입력하세요.");
        int grade = scan.nextInt();
        int coupon;
        if(grade==1){
            coupon=1000;
        }else if(grade==2)
        coupon=2000;
        else if(grade==3)
        coupon=3000;
        else
        coupon=500;

        System.out.printf("발급받은 쿠폰 %d", coupon);
    }
}
