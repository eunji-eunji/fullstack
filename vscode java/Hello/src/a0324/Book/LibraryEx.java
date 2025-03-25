package a0324.Book;

import a0318.problem1;

public class LibraryEx {
    public static void main(String[] args) {
        EBook ebook = new EBook("이것이 자바다", "신용권", "2023-1113", 5.6, "PDF");
        PrintBook printbook = new PrintBook("첨만나리액트", "이인제", "2019-0124", 0.8, 464);

        System.out.println("Ebbok Information: ");
        ebook.displayInfo();
        System.out.println();
        System.out.println("Print Book information: ");
        printbook.displayInfo();
    }
}
