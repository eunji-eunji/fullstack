package a0313;

public class Operadd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        b = ++a;
        System.out.println("a = " + a + ", b = " + b);
        //a=2, b=2

        a = 1;
        b = 0;
        b = a++;
        System.out.println("a = " + a + ", b = " + b);
        // a=2, b=1
    }
}
