package a0319;

public class StringArr {
    public static void main(String[] args) {
        // String[][] str = { { "서울", "부산", "인천", "대전", "대구" }, { "599", "51", "46", "43", "27" } };
        // for (int i = 0; i < str[0].length; i++) {
        //     for (int j = 0; j < str[1].length; j++) {
        //         System.out.print(str[i][j] + ": ");
        //         System.out.println(str[i + 1][j] + "명");
        //     }
        // }

        String[] str2 = { "서울", "부산", "인천", "대전", "대구" };
        int[] arr = { 599, 51, 46, 43, 27 };
        for (int i = 0; i < str2.length; i++) {
            System.out.printf("%s: %d명\n", str2[i], arr[i]);
        }
    }
}
