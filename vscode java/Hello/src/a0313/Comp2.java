package a0313;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열1";
        // System.out.println(str1==str2);

        boolean result1 = "hello".equals("hello");
        System.out.println(result1);

        boolean result2 = str1.equals(str2);
        System.out.println(result2);

        String str3 = "abc";
        String str4 = new String("abc");
        System.out.println(str3 == str4);   //false. 각각 생성되었으므로 주소가 다름. '=='은 주소를 비교.
        System.out.println(str3.equals(str4));  //true. equals: 내용을 비교하는 메소드
    }
}
