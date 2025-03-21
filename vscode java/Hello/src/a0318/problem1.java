package a0318;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println(max(a,b));
    }
    public static int max(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
