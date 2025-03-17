public class multiple {
    public static void main(String[] args) {
        // 곱셈
        int mul=0;
        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
               mul=i*j; 
                System.out.printf("%d * %d = %d\n", i, j, mul);
            }
        }
    }
}
