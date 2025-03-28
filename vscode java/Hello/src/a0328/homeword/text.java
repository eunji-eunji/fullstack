package a0328.homeword;

import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("정수");
        if(scan.hasNextInt()){
            int price=scan.nextInt();
            System.out.println(price);
        }else{
            System.out.println("XX");
        }
    }
}
