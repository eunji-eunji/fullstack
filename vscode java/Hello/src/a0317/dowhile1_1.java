public class dowhile1_1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endnum = 10;
        do {
            sum += i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        } while (i <= endnum);
    }
}
