package a0328.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        BookManager manager = new BookManager();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("===== 도서 관리 시스템 =====");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 삭제");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 수정");
            System.out.println("5. 도서 목록 보기");
            System.out.println("6. 파일로 저장");
            System.out.println("7. 파일에서 불러오기");
            System.out.println("0. 종료");
            System.out.print(">> ");
            int choice;

            // 예외
            try {
                choice = scan.nextInt();
                scan.nextLine();
            } catch (Exception e) {
                choice = -1;
            }

            if (choice == 1) {
                manager.addBook();
            } else if (choice == 2) {
                manager.deleteBook();
            } else if (choice == 3) {
                manager.searchBook();
            } else if (choice == 4) {
                manager.updateBook();
            } else if (choice == 5) {
                manager.listBook();
            } else if (choice == 6) {
                manager.fileSave();
            } else if (choice == 7) {
                manager.fileLoad();
            } else if (choice == 0) {
                System.out.println("프로그램 종료");
                scan.close();
                System.exit(0);
            } else {
                System.out.println("잘못 입력했습니다.");
                scan.nextLine();
            }

        }
    }
}
