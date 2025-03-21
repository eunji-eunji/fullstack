package a0314;

import java.util.Scanner;

public class SamHang {
    public static void main(String[] args) {
        int age = 20;
        String status;
        // if(age>=20)
        // status="성인";
        // else
        // status="미성년자";

        status = (age >= 20) ? "성인" : "미성년자";
        System.out.println("age = " + age + " status = " + status);

        int distance;
        Scanner scan = new Scanner(System.in);
        System.out.println("distance: ");
        distance = scan.nextInt();

        if (distance <= 1)
            System.out.println("도보를 이용하세요.");
        else if (distance > 1 && distance <= 10)
            System.out.println("자전거를 이용하세요.");
        else if (distance > 10 && distance <= 100)
            System.out.println("자동차를 이용하세요.");
        else
            System.out.println("비행기를 이용하세요.");
    }
}
