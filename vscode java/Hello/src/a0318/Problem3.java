package a0318;

public class Problem3 {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7};
        System.out.println(sumArray(numbers));
    }

    public static int sumArray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}
