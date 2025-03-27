package a0327.exception1;

public class ExceptionEx02 {
    public static void main(String[] args) throws Exception{
        divide(10, 0);
    }

    private static void divide(int i, int j) throws ArithmeticException {
        if(j==0){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }else{
            System.out.println("결과: "+(i/j));
        }
    }
}
