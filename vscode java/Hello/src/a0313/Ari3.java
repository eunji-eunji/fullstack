package a0313;

public class Ari3 {
    public static void main(String[] args) {
        String strSeven="7";
        String strPi="3.14";
        int a=Integer.parseInt(strSeven);   //문자를 정수로 변환
        double d=Double.parseDouble(strPi);

        double c=a+d;
        System.out.printf("%d + %.2f = %.2f\n", a,d,c);
        System.out.println(a+d);

        int x=5;
        int y=2;
        double z=x/y;
        System.out.println(z);  //2.0

        int s=10;
        s +=5;  //15
        s%=3;   //0
        System.out.println(s);  //0
    }
}
