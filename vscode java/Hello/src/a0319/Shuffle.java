package a0319;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] numArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // for(int i=0;i<numArr.length;i++){
        // System.out.printf("%d, ",numArr[i]);
        // }

        // for(int num:numArr)
        // System.out.print(num);

        System.out.println(Arrays.toString(numArr)); // 배열 출력

        int temp;
        for (int i = 0; i < 100; i++) {
            int ran = (int) (Math.random() * 10);
            temp = numArr[0];
            numArr[0] = numArr[ran];
            numArr[ran] = temp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}
