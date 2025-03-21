package a0318;

public class Pig {
    public static void main(String[] args) {
        int n = 3;
        kal(n);
    }

    private static void kal(int n) {
        double result = (double) n * 180 * 5.179;
        System.out.printf("삼겹살 %d인분의 칼로리: %.2f", n, result);
    }
}
