package bank_test;

import java.util.Scanner;

public class InputReader {
    private final Scanner scanner = new Scanner(System.in);

    public String readLine() {
        System.out.print("입력 > ");
        return scanner.nextLine().trim();
    }
}
