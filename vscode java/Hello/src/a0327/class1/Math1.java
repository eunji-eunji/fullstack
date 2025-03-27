package a0327.class1;

public class Math1 {
    public static void main(String[] args) {
        System.out.println(Math.ceil(10.0)); // 올림
        System.out.println(Math.ceil(10.1));

        System.out.println(Math.floor(10.9)); // 버림
        System.out.println(Math.floor(10.1));

        System.out.println(Math.round(10.1)); // 반올림
        System.out.println(Math.round(10.5));

        System.out.println(Math.max(3.14, 3.14159));
        System.out.println(Math.min(3.14, 3.14159));
        System.out.println();

        System.out.println(Math.max(-10, -11));
        System.out.println(Math.min(-10, -11));
        System.out.println((int) (Math.random() * 100));

    }
}
