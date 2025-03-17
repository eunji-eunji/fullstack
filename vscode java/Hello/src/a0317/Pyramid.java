public class Pyramid {
    public static void main(String[] args) {
        // 피라미드 그리기
        int num = 5;
        int a = 0;
        for (int i = 0; i < num; i++) { // 5줄
            for(int t=0;t<num-i;t++){
                System.out.print(" ");
            }
            for (int j = 0; j <= a; j++) {
                System.out.print("*");
            }
            a += 2;
            System.out.println();
        }
    }
}
