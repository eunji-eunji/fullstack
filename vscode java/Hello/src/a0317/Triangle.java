public class Triangle {
    public static void main(String[] args) {
        // 삼각형 그리기
        int rows=5;
        String pyramid="";  //스트링에 추가하는 방법
        for(int i=0;i<rows;i++){
            pyramid=pyramid+"*";
            System.out.println(pyramid);
        }
        System.out.println();
        
        for(int i=0;i<rows;i++){    //이중 for문
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
