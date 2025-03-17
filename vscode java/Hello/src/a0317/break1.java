public class break1 {
    public static void main(String[] args) {
        // 1부터 숫자를 계속 누적해서 더하다가 합계가 10보다 처음으로 크면 멈추기
        int sum=0;
        int i=1;

        while(true){
            sum+=i;
            if(sum>10){
                System.out.printf("합이  10보다 크면 종료: i=%d sum=%d\n", i, sum);
                break;                
            }
            i++;
        }

        // boolean 이용
        int sum2=0;
        int j=1;
        boolean flag=true;
        while(flag){
            sum2+=j;
            if(sum2>10){
                System.out.printf("합이  10보다 크면 종료: i=%d sum=%d\n", j, sum2);
                flag=false;                
            }
            j++;
        }
    }
}
