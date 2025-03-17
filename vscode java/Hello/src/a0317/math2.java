import java.util.Scanner;

public class math2 {
    public static void main(String[] args) {
        // 계산기
        Scanner scan = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("================================");
            System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.종료");
            System.out.println("================================");
            System.out.print("선택> ");
            int a = scan.nextInt();

            if (a == 5) {
                System.out.println("프로그램 종료");
                flag = false;
                break;
            }

            System.out.print("첫 번째 숫자> ");
            int n1 = scan.nextInt();
            System.out.print("두 번째 숫자> ");
            int n2 = scan.nextInt();
            int result;
            
            switch (a) {
                case 1:
                    result = n1 + n2;
                    System.out.printf("결과: %d+%d=%d\n", n1, n2, result);
                    break;
                case 2:
                    result = n1 - n2;
                    System.out.printf("결과: %d-%d=%d\n", n1, n2, result);
                    break;
                case 3:
                    result = n1 * n2;
                    System.out.printf("결과: %d*%d=%d\n", n1, n2, result);
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다."); // <- 예외 처리
                    } else {
                        result = n1 / n2;
                        System.out.printf("결과: %d/%d=%d\n", n1, n2, result);
                    }
                    break;
            }
        }
        scan.close();
    }
}
