package a0321.Book;

import java.util.Scanner;

public class BookApplication {
    private static Book[] bookArray = new Book[100];
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("--------------------------------------------------------");
            System.out.println("1.책 추가 | 2.책 목록 조회 | 3.대출 | 4.반납 | 5.종료");
            System.out.println("--------------------------------------------------------");
            System.out.print("선택> ");
            int choice = Integer.parseInt(scan.nextLine());

            if (choice == 1) {
                addBook();
            } else if (choice == 2) {
                listBooks();
            } else if (choice == 3) {
                borrowBook();
            } else if (choice == 4) {
                returnBook();
            } else if (choice == 5) {
                flag = false;
                break;
            }
        }
        System.out.println("프로그램 종료");
    }

    // 책 추가
    private static void addBook() {
        System.out.print("책 제목: ");
        String title = scan.nextLine();
        System.out.print("저자: ");
        String author = scan.nextLine();
        Book newBook = new Book(title, author, "available");
        if(findBook(title) != null){
            System.out.println("이미 있는 책입니다.");
            return;
        }
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                bookArray[i] = newBook;
                break;
            }
        }
        System.out.println("책이 추가되었습니다!");
    }

    // 책 목록 조회
    private static void listBooks() {
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                break;
            }
            System.out.printf("책 제목: %s | 저자: %s | 상태: %s\n", bookArray[i].getTitle(), bookArray[i].getAuthor(),
                    bookArray[i].getStatus());
        }
    }

    // 책 대출
    private static void borrowBook() {
        System.out.print("대출할 책 제목: ");
        String title = scan.nextLine();

        Book newBook = findBook(title);
        if (newBook == null) { // 책이 없을 때
            System.out.println("책이 없습니다.");
            return;
        }
        if (newBook.getStatus().equals("available")) {
            newBook.setStatus("borrowed");
            System.out.println("책을 대출했습니다!");
        } else {
            System.out.println("이미 대출 중입니다.");
        }

    }

    // 책 반납
    private static void returnBook() {
        System.out.print("반납할 책 제목: ");
        String title = scan.nextLine();

        Book newBook = findBook(title);
        if (newBook == null) { // 책이 없을 때
            System.out.println("책이 없습니다.");
            return;
        }
        if (newBook.getStatus().equals("borrowed")) {
            newBook.setStatus("available");
            System.out.println("책을 반납했습니다!");
        } else {
            System.out.println("이미 반납했습니다.");
        }
    }

    private static Book findBook(String title) {
        Book newBook = null;
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] != null) {
                if (title.equals(bookArray[i].getTitle())) {
                    newBook = bookArray[i];
                    break;
                }
            }
        }
        return newBook;
    }

}
