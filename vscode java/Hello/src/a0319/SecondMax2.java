package a0319;

public class SecondMax2 {
    public static void main(String[] args) {
        int[] arr={65,74,23,75,68,96,88,98,54};
        int max=0;
        int secondMax=0;
        max=max(arr);
        secondMax=secondMax(arr);

        System.out.printf("두 번째로 큰 수는 %d", secondMax);
    }

    private static int max(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    private static int secondMax(int[] arr){
        int max=max(arr);
        int secondMax=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max) continue;
            if(arr[i]>secondMax){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
}
