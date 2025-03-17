public class Inverted_triangle {
    public static void main(String[] args) {
        // 역삼각형 그리기
        int rows=5;
        String pyramid="";
        for(int i=0;i<rows;i++){
            pyramid=pyramid+"*";
            System.out.println(pyramid);
        }
        System.out.println();
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        for(int i=rows;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
