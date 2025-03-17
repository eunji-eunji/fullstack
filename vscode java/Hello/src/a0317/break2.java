public class break2 {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        for(;;){    //for문 무한루프
            sum+=i;
            if(sum>10){
                System.out.printf("i=%d sum=%d", i ,sum);
                break;
            }
            i++;
        }

        int sum2=0;
        for(int j=1;;j++){  //for문 무한루프
            sum2+=j;
            if(sum2>10){
                System.out.printf("j=%d sum2=%d", j ,sum2);
                break;
            }
        }
    }
}
