package a0318;

public class Method4 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 5;
        Calculator1.add(num1, num2);
        System.out.println("뺄셈: " + Calculator1.subtract(num1, num2));
        System.out.println("곱셈: " + Calculator1.multiply(num1, num2));
        System.out.println("나눗셈: " + Calculator1.divide(num1, num2));
    }
}

class Calculator1 {
    public static void add(int a, int b) {
        // static: 객체 생성 없이 함수 부를 때 사용
        // 리턴값 없을 경우 type 대신 void 사용
        System.out.println("덧셈: "+(a+b));
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return (double) a / b;
    }
}