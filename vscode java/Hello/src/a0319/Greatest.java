package a0319;

public class Greatest {
    public static void main(String[] args) {
        String[] str={"Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Sam"};
        int[] arr={65,74,23,75,68,96,88,98,54};

        int grate=0;
        int maxIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>grate){
                grate=arr[i];
                maxIndex=i;
            }
        }
        System.out.printf("1등: %s(%d점)",str[maxIndex], grate);
    }
}
