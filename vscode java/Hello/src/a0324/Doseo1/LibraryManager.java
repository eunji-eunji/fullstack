package a0324.Doseo1;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    private ArrayList<Library> librarys; // 전체 책 목록
    private ArrayList<Library> bookLocation; // 대출한 도서 목록

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
                library.book(); // 대출이 실행되면 available에 false 넣어줌
                bookLocation.add(library);
                return true;
            }
        }
        return false;
    }

    public void booklocation() {
        for (Library library : bookLocation) {
            System.out.println(library);
        }
    }

    public void addLibrary(String addtitle, String addauthor, String addlocation, String addisbn) {
        // Library addli=new Library(addtitle, addauthor, addlocation, addisbn);
        // librarys.add(addli);
        // 위의 두 줄을 아래 한 줄로 축약
        librarys.add(new Library(addtitle, addauthor, addlocation, addisbn));
    }

    // 5.도서 삭제하기
    public void delLibrary(String dname) {
        boolean result = false;
        for (Library li : librarys) {
            if (li.getTitile().equalsIgnoreCase(dname)) {
                if (li.isAvailable()) {
                    librarys.remove(li);
                    result = true;
                    break;
                } else {
                    result = false;
                    break;
                }
            }
        }
        if (result) {
            System.out.println("삭제가 완료되었습니다.");
        } else {
            System.out.println("삭제할 수 없습니다.");
        }
    }

    // 6번 도서 정보 수정하기
    public void updateLibrary(String uname) {
        int i = 0;
        int index = -1;
        int menu = -1;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        Library newA = new Library(); // 빈 라이브러리 객체
        for (Library a : librarys) {
            i++;
            if (a.getTitile().equalsIgnoreCase(uname)) {
                index = i - 1; // index = 0 같은 이름 객체의 인덱스 번호
                newA = a;
            }
            // System.out.println(a.getTitile().equalsIgnoreCase(uname) + " " +
            // a.getTitile() + " " + uname);
        }
        if (index != -1) {
            System.out.print("수정할 사항\n 1.도서 이름 \t 2.도서 저자 \t 3.도서 위치 \t 4.도서ISBN \n >>");
            menu = scan.nextInt();
            scan.nextLine(); // \n같이 불필요한 내용 지움
            while (flag) {
                switch (menu) {
                    case 1:
                        System.out.println("수정할 이름을 입력하세요.");
                        newA.setTitile(scan.nextLine());
                        librarys.set(index, newA); // 해당 인덱스 번호에 객체 수정.
                        System.out.println("수정이 완료되었습니다.");
                        flag = false;
                        break;
                    case 2:
                        System.out.println("수정할 저자의 이름을 입력하세요.");
                        newA.setAuthor(scan.nextLine());
                        librarys.set(index, newA); // 해당 인덱스 번호에 객체 수정.
                        System.out.println("수정이 완료되었습니다.");
                        flag = false;
                        break;
                    case 3:
                        System.out.println("수정할 도서의 위치를 입력하세요.");
                        newA.setLocation(scan.nextLine());
                        librarys.set(index, newA); // 해당 인덱스 번호에 객체 수정.
                        System.out.println("수정이 완료되었습니다.");
                        flag = false;
                        break;
                    case 4:
                        System.out.println("수정할 도서 ISBN을 입력하세요.");
                        newA.setIsbn(scan.nextLine());
                        librarys.set(index, newA); // 해당 인덱스 번호에 객체 수정.
                        System.out.println("수정이 완료되었습니다.");
                        flag = false;
                        break;
                    default:
                        System.out.println("1~4번 중에 입력하세요.");
                        break;
                }
            }
        } else {
            System.out.println("찾는 도서가 없어 수정할 수 없습니다.");
        }
    }

    // 7.도서 내용 보기
    public void showLibrary(String sname) {
        for (Library a : librarys) {
            if (a.getTitile().equalsIgnoreCase(sname)) {
                System.out.println(a.toString());
            }
        }
    }
}
