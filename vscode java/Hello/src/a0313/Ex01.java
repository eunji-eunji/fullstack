package a0313;

public class Ex01 {
    public static void main(String[] args) {
        // 세 자리 정수의 각 자릿수 총합을 출력하시오.
        int num = 374;
        int hundred, ten, one;
        one = num % 10;
        ten = (num / 10) % 10;
        hundred = num / 100;
        int result = hundred + ten + one;
        System.out.printf("%d, %d, %d\n", hundred, ten, one);
        System.out.printf("정수 %d의 각 자릿수의 총합 : %d", num, result);
    }

}
