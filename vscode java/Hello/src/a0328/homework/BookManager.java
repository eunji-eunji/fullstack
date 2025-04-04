package a0328.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    Scanner scan = new Scanner(System.in);
    ArrayList<Book> list;
    BookFile file = new BookFile("book", "books");

    public BookManager() {
        list = new ArrayList<Book>();
        list.add(new Book("자바의 정석", "남궁성", "12345", 32000));
        list.add(new Book("Effective Java", "Joshua Bloch", "54321", 45000));
        list.add(new Book("Clean Code", "Robert C. Martin", "67890", 38000));
        list.add(new Book("스프링 부트와 AWS", "이동욱", "98765", 28000));
        list.add(new Book("코틀린 인 액션", "Dmitry Jemerov", "13579", 40000));
    }

    // 1번 도서 추가
    public void addBook() {
        System.out.println("<도서 추가>");
        System.out.print("책 제목: ");
        String name = scan.nextLine();
        System.out.print("저자: ");
        String author = scan.nextLine();
        System.out.print("ISBN: ");
        String isbn = scan.nextLine();
        System.out.print("가격: ");
        double price;
        if (scan.hasNextDouble()) {
            price = scan.nextDouble();
            Book newBook = new Book(name, author, isbn, price);
            list.add(newBook);
            System.out.println("도서 추가 완료!");
        } else {
            System.out.println("유효한 가격을 입력하세요.");
        }
    }

    // 2번 도서 삭제
    public void deleteBook() {
        // ISBN으로 책 찾아서 인덱스 번호를 반환하여 리스트에서 인덱스 번호 삭제
        int index = findBook();
        if (index == -1) {
            System.out.println("책이 없습니다.");
        } else {
            list.remove(index);
        }
    }

    // 3번 도서 검색
    public void searchBook() {
        System.out.println("<도서 검색>");
        int index = findBook();
        if (index == -1) {
            System.out.println("찾는 책이 없습니다.");
        } else {
            System.out.println(list.get(index).toString());
        }
    }

    // 4번 도서 정보 수정
    public void updateBook() {
        System.out.println("<도서 가격 수정>");
        int index = findBook();
        System.out.print("수정할 가격 입력: ");
        double price = scan.nextDouble();
        if (price < 0) {
            System.out.println("유효한 가격을 입력하세요.");
        } else {
            list.get(index).setPrice(price);
            System.out.println("가격이 수정되었습니다.");
        }
    }

    // 5번 도서 목록
    public void listBook() {
        System.out.println("<도서 목록 보기>");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    // 6번 도서 목록 파일로 저장
    public void fileSave() throws Exception{
        file.create();
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str += list.get(i).toString() + "\n";
        }
        file.write(str);
    }

    // 7번 파일 불러오기
    public void fileLoad() throws Exception{
        try {
            file.read();
        } catch (Exception e) {
            System.out.println("읽을 파일이 없습니다.");
        }
    }

    // 책 찾기
    private int findBook() {
        System.out.print("찾을 책의 ISBN 입력: ");
        String isbn = scan.nextLine();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIsbn().equals(isbn)) {
                index = i;
            }
        }
        return index;
    }

}
