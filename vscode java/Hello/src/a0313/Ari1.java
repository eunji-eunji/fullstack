package a0313;

public class Ari1 {
    public static void main(String[] args) {
        byte v1 = 10; // 1byte
        byte v2 = 4;
        int v3 = 5; // 4byte
        long v4 = 10L; // 8byte

        int result1 = v1 + v2; // 모든 피연산자는 int 타입으로 자동 변환
        System.out.println(result1);

        double result2 = v1 / v2; // 소수점 안 나옴.
        System.out.println(result2);

        double result3 = v1 / (double) v2; // double 로 강제 타입 변환. 소수점까지 나옴.
        System.out.println(result3);

        double result5 = 10 / 4;
        System.out.println(result5);

        double result6 = 10 / (double) 4;
        System.out.println(result6);

        double result7 = 10 / 4.0;
        System.out.println(result7);

    }
}
