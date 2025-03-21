package a0319;

import java.util.Arrays;

public class Lotto1 {
    public static void main(String[] args) {
        int ball[] = new int[45];

        // 1 ~ 45 숫자 넣기
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }
        System.out.println(Arrays.toString(ball));

        // 배열 전체 섞기
        // for (int i = 0; i < 1000; i++) {
        // int n = (int) (Math.random() * 45);
        // int temp = ball[0];
        // ball[0] = ball[n];
        // ball[n] = temp;
        // }
        // System.out.println(Arrays.toString(ball));

        // 앞의 6개 숫자 가져오기
        // for(int i=0;i<6;i++){
        // System.out.printf("ball[%d]=%d\n", i, ball[i]);
        // }

        // 간소화 방법. 앞의 6개 자리에만 랜덤 숫자 넣기
        for (int i = 0; i < 6; i++) {
            int n = (int) (Math.random() * 45);
            int temp = ball[i];
            ball[i] = ball[n];
            ball[n] = temp;
        }
        System.out.println(Arrays.toString(ball));

    }
}
