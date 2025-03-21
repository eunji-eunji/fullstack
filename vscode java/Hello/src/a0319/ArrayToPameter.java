package a0319;

public class ArrayToPameter {
    public static void main(String[] args) {
        int[] evens = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19 };
        int evenSum = sum(evens);
        int primeSum = sum(primes);
        System.out.printf("%d %d", evenSum, primeSum);
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
