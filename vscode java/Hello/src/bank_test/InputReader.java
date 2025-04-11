package bank_test;

import java.util.Scanner;

// scanner 함수를 따로 만듦
public class InputReader {
    private final Scanner scanner = new Scanner(System.in);

    // 텍스트 입력 함수
    public String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim(); // 공백 제거
    }

    // 숫자 입력 함수
    public int readInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
            }
        }
    }
}
