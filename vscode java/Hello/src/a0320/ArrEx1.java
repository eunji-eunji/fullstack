package a0320;

public class ArrEx1 {
    public static void main(String[] args) {
        int ko = 0, eng = 0, math = 0;
        int[][] score = {
                { 100, 95, 46 },
                { 20, 20, 20 },
                { 30, 30, 30 },
                { 40, 40, 40 }
        };

        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            float avg = 0.0f;

            // 과목별 총점
            ko += score[i][0]; // 국어 총점
            eng += score[i][1]; // 영어 총점
            math += score[i][2]; // 수학 총점
            System.out.printf("  %d ", i + 1);

            for (int j = 0; j < score[i].length; j++) {
                // 가로 합계
                sum += score[i][j];

                // 과목별 점수 출력
                System.out.printf(" %3d", score[i][j]);
            }
            avg = sum / (float) score[i].length;
            // 평균, 가로 합계 출력
            System.out.printf("  %d  %.2f\n", sum, avg);
        }
        System.out.printf("총점: %3d %3d %3d", ko, eng, math);
    }
}
