package a0331.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // 앞에서부터 해당 원소가 위치할 곳을 탐색하고 해당 위치에 삽입
        // i 이전을 순회하며 이전 값보다 i값이 작은 위치에 대입

        int[] array = { 7, 1, 4, 2, 6, 5, 3 };
        InsertionSort1(array);
        System.out.println(Arrays.toString(array));
    }

    private static void InsertionSort1(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i]; // key=1(array[1])
            int j = i - 1; // j=0
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1]=key;
        }
    }
}
