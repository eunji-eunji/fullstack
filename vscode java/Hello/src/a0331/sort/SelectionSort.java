package a0331.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // 끝까지 비교하여 for(j)로 가장 작은 인덱스 번호 구하고 for(i)에 minIndex 번호의 값을 대입

        int[] array = { 7, 1, 4, 2, 6, 5, 3 };
        SelectionSort1(array);
        System.out.println(Arrays.toString(array));
    }

    private static void SelectionSort1(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = 0; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }
    }
}
