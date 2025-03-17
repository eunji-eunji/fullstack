public class Continue1 {
    public static void main(String[] args) {
        // 1부터 5까지 숫자를 출력할 때 3은 건너뛰고 출력함.
        int i=1;
        while(i<=5){
            if (i==3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
