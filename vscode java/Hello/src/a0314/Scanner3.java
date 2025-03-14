package a0314;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("실수: ");

        float a=scan.nextFloat();
        System.out.printf("%.2f", a);
        scan.close();
    }
}
