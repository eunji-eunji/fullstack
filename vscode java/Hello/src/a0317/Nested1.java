public class Nested1 {
    public static void main(String[] args) {
        // 중첩 반복문
        int count=1;
        for(count=1;count<11;count++){
            System.out.println(count);
        }

        count=1;
        while(count<11){
            System.out.println(count);
            count++;
        }

        System.out.print("곱 ");
        for(int i=1;i<10;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int j=1;j<10;j++){
            System.out.print(j+" ");
            for(int t=1;t<10;t++){
                System.out.print(j*t+" ");
            }
            System.out.println();
        }
    }
}
