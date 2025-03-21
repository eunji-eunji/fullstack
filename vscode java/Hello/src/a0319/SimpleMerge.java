package a0319;

import java.util.Arrays;

public class SimpleMerge {
    public static void main(String[] args) {
        int[] evens = { 0, 2, 4, 6, 8 };
        int[] odds = { 1, 3, 5, 7, 9 };
        int[] result = simpleMerge(evens, odds);
        System.out.println(Arrays.toString(result));
    }

    private static int[] simpleMerge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                result[i] = a[i / 2];
            } else {
                result[i] = b[i / 2];
            }
        }
        return result;
    }
}
