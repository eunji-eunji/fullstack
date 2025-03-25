package a0324.Doseo1;

import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Library> librarys;    //전체 책 목록
    private ArrayList<Library> bookLocation;    //대출한 도서 목록

    public LibraryManager() {
        librarys = new ArrayList<>();
        bookLocation = new ArrayList<>();
        librarys.add(new Library("This is Java", "Shin", "SectionA", "979-11-691-229-8"));
        librarys.add(new Library("First Encounter with React", "Lee", "SectionB", "979-11-6921-169-7"));
        librarys.add(new Library("The Principles of Web Standards", "Ko", "SectionC", "979-11-6303-622-7"));
        // 더미데이터 3개
    }

    public void allLibrary() {
        System.out.println("대출 가능한 도서보기");
        for (Library library : librarys) {
            if (library.isAvailable()) {
                System.out.println(library);
            }
        }
    }

    public boolean booklocations(String libraryName) {
        for (Library library : librarys) {
            if (library.getTitile().equalsIgnoreCase(libraryName) && library.isAvailable()) {
                // equalsIgnoreCase : 소문자로 바꿔서 비교
                library.book(); //대출이 실행되면 available에 false 넣어줌
                bookLocation.add(library);
                return true;
            } 
        }
        return false;
    }

    public void booklocation() {
        for(Library library : bookLocation){
            System.out.println(library);
        }
    }

    public void addLibrary(String addtitle, String addauthor, String addlocation, String addisbn) {
        // Library addli=new Library(addtitle, addauthor, addlocation, addisbn);
        // librarys.add(addli);
        // 위의 두 줄을 아래 한 줄로 축약
        librarys.add(new Library(addtitle, addauthor, addlocation, addisbn));
    }
}
