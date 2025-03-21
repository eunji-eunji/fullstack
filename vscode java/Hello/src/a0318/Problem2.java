package a0318;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(6));

    }
    public static String evenOrOdd(int num){
        if(num%2 == 0){
            return "짝수";
        }else{
            return "홀수";
        }
    }
}
