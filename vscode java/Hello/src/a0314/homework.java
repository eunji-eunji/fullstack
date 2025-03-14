package a0314;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자 세 개 입력하세요.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max;
        if(a>b && a>c){
            max=a;
        }else if(b>c){
            max=b;
        }else{
            max=c;
        }
        System.out.printf("가장 큰 수는 %d입니다.",max);
    }
}
