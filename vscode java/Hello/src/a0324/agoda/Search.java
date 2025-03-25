package a0324.agoda;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AgodaManager manager = new AgodaManager();
        boolean flag = true;

        while (flag) {
            System.out.println("\n숙소 예약 시스템에 오신 것을 환영합니다.");
            System.out.println("1. 예약 가능한 숙소 보기");
            System.out.println("2. 숙소 예약하기");
            System.out.println("3. 예약한 숙소 보기");
            System.out.println("4. 숙소 추가하기");
            System.out.println("5. 숙소 삭제하기");
            System.out.println("6. 숙소 정보 수정하기");
            System.out.println("7. 숙소 정보 조회하기");
            System.out.println("8. 종료");
            System.out.print("원하는 작업을 선택하세요 > ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("예약 가능한 숙소 보기");
                    manager.allAgoda();
                    break;
                case 2:
                    System.out.println("숙소 예약하기");
                    System.out.print("예약할 숙소 이름 입력: ");
                    String name = scan.nextLine();
                    if (manager.agodaBook(name)) {
                        System.out.println("예약이 완료되었습니다.");
                    } else {
                        System.out.println("예약 가능한 숙소가 없습니다.");
                    }
                    break;
                case 3:
                    System.out.println("예약한 숙소 보기");
                    manager.agodaData();
                    break;
                case 4:
                    System.out.println("숙소 추가하기");
                    System.out.print("추가할 숙소 이름: ");
                    String newname = scan.nextLine();
                    System.out.print("추가할 숙소 위치: ");
                    String newlocation = scan.nextLine();
                    System.out.print("추가할 숙소 가격: ");
                    double newprice = scan.nextDouble();
                    manager.addAgoda(newname, newlocation, newprice);
                    break;
                case 5:
                    System.out.println("숙소 삭제하기");
                    System.out.print("삭제할 숙소 이름: ");
                    String removename = scan.nextLine();
                    System.out.println(removename);
                    if (removename.equals("")) {
                        System.out.println("다시 입력하세요.");
                        removename = scan.nextLine();
                    }
                    manager.removeAgoda(removename);
                    break;
                case 6:
                    System.out.println("숙소 정보 수정하기");
                    System.out.print("수정할 숙소 이름: ");
                    String updatename = scan.nextLine();
                    if (updatename.equals("")) {
                        System.out.println("다시 입력하세요.");
                        updatename = scan.nextLine();
                    }
                    manager.agodaupdate(updatename);
                    break;
                case 7:
                    System.out.println("숙소 정보 조회하기");
                    manager.listAgoda();
                    break;
                case 8:
                    System.out.println("종료");
                    flag = false;
                    scan.close();
                    break;
            }
        }
    }
}