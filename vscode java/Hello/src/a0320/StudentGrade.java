package a0320;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean flag = true;
        int student = 0;
        int[] scores = new int[0];

        while (flag) {
            System.out.println("======================================================");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("======================================================");
            System.out.print("선택> ");
            int choice = scan.nextInt(); // 선택

            switch (choice) {
                case 1: {
                    System.out.print("학생수> ");
                    student = scan.nextInt();
                    scores = new int[student];
                    break;
                }
                case 2: {
                    // System.out.println(student);
                    for (int i = 0; i < student; i++) {
                        System.out.printf("scores[%d]> ", i);
                        scores[i] = scan.nextInt();
                    }
                    break;
                }
                case 3:
                    for (int i = 0; i < student; i++) {
                        System.out.printf("scores[%d]: %d\n", i, scores[i]);
                    }
                    break;
                case 4:
                    int max = 0, sum = 0;
                    double avg = 0;
                    for (int i = 0; i < student; i++) {
                        if (scores[i] > max) {
                            max = scores[i];
                        }
                        sum += scores[i];
                    }
                    avg = (double) sum / student;
                    System.out.printf("최고 점수: %d\n평균 점수: %.1f\n", max, avg);
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    flag = false;
                    break;
            }
        }
    }
}
