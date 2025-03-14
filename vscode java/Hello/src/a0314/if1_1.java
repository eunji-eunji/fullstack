package a0314;

import java.util.Scanner; //main의 scanner에서 Alt+Shift+O 누르면 이거 나옴.
// import java.util.*;   scanner 뿐만 아니라 모든 것을 다 불러옴.

public class if1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력하세요.");
        int age = scanner.nextInt(); // 정수를 입력받음

        // int age=20;
        if (age >= 20)
            System.out.println("당신은 성인입니다.");
        else
            System.out.println("당신은 미성년자입니다.");

        scanner.close();
    }
}
