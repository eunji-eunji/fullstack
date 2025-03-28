package a0328.file2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws Exception {
        StudentDAO test = new StudentDAO();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1. 학생정보 입력");
            System.out.println("2. 학생정보 삭제");
            System.out.println("3. 학생정보 검색");
            System.out.println("4. 학생정보 수정");
            System.out.println("5. 학생 목록 보기");
            System.out.println("6. 파일로 저장하기");
            System.out.println("7. 학생정보 파일 불러오기");
            System.out.println("0. 종료");
            System.out.print(">> ");
            int choice;

            try {
                choice = scan.nextInt();
            } catch (Exception e) {
                // InputMismatchException : 특수문자 넣었을 때 발생하는 예외
                choice = -1;
            }
            if (choice == 1) {
                // 학생 정보 추가
                test.userInsert();
            } else if (choice == 2) {
                test.userDelete();
            } else if (choice == 3) {
                test.userSelect();
            } else if (choice == 4) {
                test.userUpdate();
            } else if (choice == 5) {
                test.printAll();
            } else if (choice == 6) {
                try {
                    test.dataSave();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (choice == 7) {
                test.dataLoad();
            } else if (choice == 0) {
                System.out.println("종료합니다.");
                scan.close();
                System.exit(0);
            } else {
                System.out.println("잘못 입력했습니다.");
                scan.nextLine();
            }
        }

    }
}
