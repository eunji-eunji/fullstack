package a0324.Doseo1;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LibraryManager manager = new LibraryManager();
        boolean flag = true;

        while (flag) {
            System.out.println("\n도서검색 시스템에 오신 것을 환영합니다.");
            System.out.println("1.대출 가능한 도서 보기");
            System.out.println("2.도서 대출하기");
            System.out.println("3.대출한 도서 보기");
            System.out.println("4.도서 추가하기");
            System.out.println("5.도서 삭제하기");
            System.out.println("6.도서 정보 수정하기");
            System.out.println("7.도서 내용 보기");
            System.out.println("8.종료");
            System.out.print("원하는 작업을 선택하세요 >> ");
            int choice = scan.nextInt();
            scan.nextLine(); // 혹시 모를 이상한 문제 제거
            switch (choice) {
                case 1:
                    System.out.println("대출가능한 도서");
                    manager.allLibrary();
                    break;
                case 2:
                    System.out.println("도서 대출하기");
                    System.out.print("대출하려는 도서의 이름을 입력하세요: ");
                    String libraryName = scan.nextLine();
                    if (manager.booklocations(libraryName)) {
                        System.out.println("도서가 대출되었습니다.");
                    } else {
                        System.out.println("대출 가능한 도서가 없습니다.");
                    }
                    break;
                case 3:
                    System.out.println("대출한 도서 보기");
                    manager.booklocation();
                    break;
                case 4:
                    System.out.println("도서 추가하기");
                    System.out.print("추가할 도서 이름 : ");
                    String addtitle = scan.nextLine();
                    System.out.print("작가: ");
                    String addauthor = scan.nextLine();
                    System.out.print("위치: ");
                    String addlocation = scan.nextLine();
                    System.out.print("ISBN: ");
                    String addisbn = scan.nextLine();
                    scan.nextLine(); // 개행문자 초기화
                    manager.addLibrary(addtitle, addauthor, addlocation, addisbn);
                    System.out.println("도서 추가 완료");
                    break;
                case 5:
                    System.out.println("도서 삭제하기");
                    System.out.print("삭제하려는 도서 이름을 입력하세요.");
                    String dname = scan.nextLine();
                    if (dname.equals("")) {
                        System.out.print("삭제하려는 도서 이름을 다시 입력하세요.\n 이름 >> ");
                        dname = scan.nextLine();
                    }
                    manager.delLibrary(dname);
                    break;
                case 6:
                    System.out.println("도서 정보 수정하기");
                    System.out.println("수정하려는 도서 이름을 입력하세요.");
                    String uname = scan.nextLine();
                    if (uname.equals("")) {
                        System.out.println("수정하려는 도서 이름을 다시 입력하세요.\n 이름 >> ");
                        uname = scan.nextLine();
                    }
                    manager.updateLibrary(uname);
                    break;
                case 7:
                    System.out.println("도서 내용 보기");
                    System.out.println("조회하려는 도서 이름을 입력하세요.");
                    String sname = scan.nextLine();
                    if (sname.equals("")) {
                        System.out.println("조회하려는 도서 이름을 다시 입력하세요.\n 이름 >> ");
                        sname = scan.nextLine();
                    }
                    manager.showLibrary(sname);
                    System.out.println("조회되었습니다.");
                    break;
                case 8:
                    flag=false;
                    System.out.println("종료");
                    scan.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
