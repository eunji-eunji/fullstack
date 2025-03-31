package a0331.sort.hag1;

public class Compare1 {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";
        System.out.println(str1.compareTo(str2));
        // 'a' 아스키코드 97, 'b'=98, a < b -> 음수
        System.out.println(str1.compareTo(str3));
        // 같으면 0
        System.out.println(str2.compareTo(str1));
        // b=98, a=97 -> 양수 (98-97=1)
        System.out.println(str3.compareTo(str2));
    }
}
