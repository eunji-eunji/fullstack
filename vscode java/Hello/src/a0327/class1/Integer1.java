package a0327.class1;

public class Integer1 {
    public static void main(String[] args) {
        int a=10;   //기본형
        // Wrapper 클래스

        Integer num1=new Integer(10);   //참조형
        Integer num2=new Integer(20);
        Integer num3=new Integer(20);

        System.out.println(num1<num2);  //true
        System.out.println(num2==num3); //false
        System.out.println(num2.equals(num3));  //true
    }
}
