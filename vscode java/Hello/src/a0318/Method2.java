package a0318;

public class Method2 {
    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println(sum1);

        int sum2 = add(10, 20);
        System.out.println(sum2);

        int sub = subtract(10, 5);
        System.out.println(sub);

        int mul = multiply(5, 2);
        System.out.println(mul);
        
        double div = divide(6, 3);
        System.out.println(div);
    }

    public static int add(int i, int j) {
        System.out.print(i + " + " + j + " = ");
        int sum = i + j;
        return sum;
    }
    // add, subtract, multiply, divide

    public static int subtract(int i, int j) {
        System.out.print(i + " - " + j + " = ");
        int result = i - j;
        return result;
    }

    public static int multiply(int i, int j) {
        System.out.print(i + " x " + j + " = ");
        int result = i * j;
        return result;
    }

    public static double divide(int i, int j) {
        if (j == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        System.out.print(i + " / " + j + " = ");
        double result = i / j;
        return result;
    }
}
