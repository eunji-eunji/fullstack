package a0314;

import java.util.Scanner;

public class Switch4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String grade = scan.next();
        switch (grade) {
            case "A":
                System.out.println("\"A\": \"탁월한 성과입니다!\"");
                break;
            case "B":
                System.out.println("\"B\": \"좋은 성과입니다!\"");
                break;
            case "C":
                System.out.println("\"C\": \"준수한 성과입니다!\"");
                break;
            case "D":
                System.out.println("\"D\": \"향상이 필요합니다!\"");
                break;
            case "F":
                System.out.println("\"F\": \"불합격입니다!\"");
                break;
            default:
                System.out.println("\"나머지\": \"잘못된 학점입니다!\"");
                break;
        }
        scan.close();
    }
}
