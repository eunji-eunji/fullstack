package a0318;

public class xxxx {
    public static void main(String[] args) {
        int x=5;
        System.out.println("x= "+x);
        print(x);   
        System.out.println(("x= "+x));  // 5
    }
    public static void print(int x){
        System.out.println("x = "+x);
        x=x+10;
        System.out.println("x = "+x); // 함수 안에서만 적용
    }
}
