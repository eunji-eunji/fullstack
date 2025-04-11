package bank_test;

import java.util.Random;

public class AccountNumberGenerate {
    private static final Random random = new Random();

    public static String generate() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(random.nextInt((10))); // 10자리 숫자
        }
        return format(sb.toString()); // 숫자를 문자로 변경
    }

    private static String format(String raw) {
        return raw.substring(0, 4) + "-" +
                raw.substring(4, 4) + "-" + raw.substring(8);
    }
}
