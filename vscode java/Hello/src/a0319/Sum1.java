package a0319;

public class Sum1 {
    public static void main(String[] args) {
        int sum=0;
        float average=0f;
        int score[] = {100,88,100,100,90};

        for(int i=0;i<score.length;i++){
            sum=sum+score[i];
        }
        average=(float)sum/score.length;
        System.out.printf("총합: %d, 평균: %.2f", sum, average);
    }
}
