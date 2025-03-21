package a0318;

public class Square2 {
    public static void main(String[] args) {
        int n=3;
        int result=meth(n);
        System.out.printf("한 변의 길이가 %d인 정육면체의 부피: %d", n, result);
    }
    private static int meth(int n){
        int result=n*n*n;
        return result;
    }
}
