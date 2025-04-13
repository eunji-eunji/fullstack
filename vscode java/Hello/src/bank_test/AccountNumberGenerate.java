package bank_test;

import java.util.Random;

// 계좌 생성 함수
public class AccountNumberGenerate {
    private static final Random random = new Random();

    public static String generate() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(random.nextInt((10))); // 10자리 숫자
            // sb.append((int)(Math.random() * 10));
        }
        return format(sb.toString()); // StringBuilder 타입을 String 타입으로 변경
    }

    // ####-####-## 문자열
    private static String format(String str) {
        return str.substring(0, 4) + "-" +
                str.substring(4, 8) + "-" + str.substring(8);
    }
}
