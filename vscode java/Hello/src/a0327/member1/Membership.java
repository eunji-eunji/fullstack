package a0327.member1;

import java.util.Scanner;

public class Membership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MemberManager manager = new MemberManager();
        while (true) {
            System.out.println("\n===== 회원 관리 프로그램 =====");
            System.out.println("1. 회원 추가");
            System.out.println("2. 회원 검색");
            System.out.println("3. 회원 수정");
            System.out.println("4. 회원 삭제");
            System.out.println("5. 전체 회원 목록 보기");
            System.out.println("6. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = scan.nextInt();
            scan.nextLine(); // 버퍼 비우기

            switch (choice) {
                case 1:
                    System.out.print("이름: ");
                    String name = scan.nextLine();
                    System.out.print("나이: ");
                    int age = scan.nextInt();
                    System.out.print("이메일: ");
                    scan.nextLine();
                    String email = scan.nextLine();
                    manager.addMember(name, age, email);
                    break;
                case 2:
                    System.out.print("검색할 회원의 이름: ");
                    String searchName = scan.nextLine();
                    Member foundMember = manager.findMember(searchName);
                    if (foundMember != null) {
                        System.out.print("회원정보: " + foundMember);
                    } else {
                        System.out.println("해당 이름 없음");
                    }
                    break;
                case 3:
                    System.out.print("수정할 회원의 이름: ");
                    String updateName = scan.nextLine();
                    System.out.print("나이: ");
                    int newage = scan.nextInt();
                    System.out.print("이메일: ");
                    scan.nextLine();
                    String newemail = scan.nextLine();
                    manager.updateMember(updateName, newage, newemail);
                    break;
                case 4:
                    System.out.print("삭제할 회원의 이름: ");
                    String removeName = scan.nextLine();
                    manager.removeMember(removeName);
                    break;
                case 5:
                    System.out.println("회원 검색");
                    manager.displayAllMembers(); // 회원 목록 출력
                    break;
                case 6:
                    System.out.println("종료");
                    scan.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못 선택");
                    break;
            }
        }
    }
}
