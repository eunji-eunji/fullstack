package a0326.grade;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeManager {

    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);
    private static int idcount = 1;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== 성적 관리 프로그램 ===");
            System.out.println("1. 성적 추가");
            System.out.println("2. 성적 조회");
            System.out.println("3. 성적 수정");
            System.out.println("4. 성적 삭제");
            System.out.println("5. 종료");
            System.out.print("선택: ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    System.exit(0);
                    // return;
                default:
                    System.out.println("잘못 입력하셨");
                    break;
            }
        }
    }

    private static void removeStudent() {
        System.out.print("삭제할 학생 ID 입력: ");
        int id = scan.nextInt();
        scan.nextLine();
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("삭제되었습니다.");
                return;
            }
        }
        System.out.println("해당 ID가 없습니다.");
    }

    private static void updateStudent() {
        System.out.print("수정할 학생 ID 입력: ");
        int id = scan.nextInt();
        scan.nextLine();
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.print("새로운 점수 입력: ");
                int newScore = scan.nextInt();
                s.setScore(newScore);
                System.out.println("점수가 수정되었습니다.");
                return;
                // 수정된 후 빠져나감.
            }
        }
        System.out.println("해당 ID를 찾을 수 없습니다.");
        // 끝까지 돌아도 같은 ID가 없음
    }

    private static void viewStudent() {
        if (students.isEmpty()) {
            System.out.println("등록된 성적이 없습니다.");
        } else {
            System.out.println("-----성적목록-----");
            for (Student s : students) {
                s.display(); // 직접 만든 출력 메소드
                // System.out.println(s.toString()); // toString을 이용
            }
        }
    }

    private static void addStudent() {
        System.out.print("학생 이름: ");
        String name = scan.nextLine();
        System.out.print("점수 입력: ");
        int score = scan.nextInt();
        scan.nextLine();
        // Student student=new Student();
        // student.setId(idcount++);
        // student.setName(name);
        // student.setScore(score);
        Student student = new Student(idcount++, name, score);
        students.add(student);
        System.out.println("성적이 추가되었습니다.");
    }
}
