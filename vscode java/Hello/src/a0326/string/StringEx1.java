package a0326.string;

public class StringEx1 {
    public static void main(String[] args) {
        String str = new String("java");
        System.out.println("원본문자열: " + str);
        // 주소로 안 나오고 값으로 출력됨

        String str2 = "java2";
        System.out.println("원본문자열: " + str2);

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " "); // charAt : 한 문자 추출 -> j a v a
        }
        System.out.println();

        for (int i = 0; i < str2.length(); i++) {
            System.out.print(str2.charAt(i) + " "); // charAt : 한 문자 추출 -> j a v a 2
        }
    }
}
