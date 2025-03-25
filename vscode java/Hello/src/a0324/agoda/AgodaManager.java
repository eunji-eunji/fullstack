package a0324.agoda;

import java.util.ArrayList;
import java.util.Scanner;

public class AgodaManager {
    ArrayList<Agoda> agodas;
    ArrayList<Agoda> agodaDatas;

    public AgodaManager() {
        agodas = new ArrayList<>();
        agodaDatas = new ArrayList<>();
        agodas.add(new Agoda("Hotel A", "Seoul", 100.0));
        agodas.add(new Agoda("Hotel B", "Busan", 80.0));
        agodas.add(new Agoda("Hotel C", "Jeju", 120.0));
    }

    // 1번 예약 가능한 숙소 보기
    public void allAgoda() {
        for (Agoda a : agodas) {
            if (a.isAvailable())
                System.out.println(a);
        }
    }

    // 2번 숙소 예약하기
    public boolean agodaBook(String name) {
        for (Agoda a : agodas) {
            if (a.getName().equalsIgnoreCase(name)) {
                agodaDatas.add(a);
                a.setAvailable(false);
                return true;
            }
        }
        return false;
    }

    // 3번 예약한 숙소 보기
    public void agodaData() {
        for (Agoda a : agodaDatas) {
            System.out.println(a);
        }
    }

    // 4번 숙소 추가하기
    public void addAgoda(String newname, String newlocation, double newprice) {
        agodas.add(new Agoda(newname, newlocation, newprice));
        System.out.println("숙소 추가가 완료되었습니다.");
    }

    // 5번 숙소 삭제하기
    public void removeAgoda(String removeagoda) {
        String state = "false";
        for (Agoda a : agodas) {
            if (a.getName().equalsIgnoreCase(removeagoda)) {
                if (a.isAvailable()) {
                    agodas.remove(a);
                    state = "true";
                    break;
                } else {
                    state = "using";
                    break;
                }
            }
        }
        if (state == "true") {
            System.out.println("숙소가 삭제되었습니다.");
        } else if (state == "using") {
            System.out.println("이용 중인 숙소는 삭제할 수 없습니다.");
        } else {
            System.out.println("해당 숙소가 없습니다.");
        }
    }

    // 6번 숙소 정보 수정하기
    public void agodaupdate(String updatename) {
        int i = 0;
        int index = -1;
        int menu = -1;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        Agoda newA = new Agoda();

        for (Agoda a : agodas) {
            i++;
            if (a.getName().equalsIgnoreCase(updatename)) {
                index = i - 1;
                newA = a;
            }
        }
        if (index != -1) {
            System.out.println("1.이름 수정 | 2.위치 수정 | 3.가격 수정");
            System.out.print("선택 >> ");
            menu = scan.nextInt();
            scan.nextLine(); 

            while (flag) {
                switch (menu) {
                    case 1:
                        System.out.print("수정할 이름 입력: ");
                        newA.setName(scan.nextLine());
                        agodas.set(index, newA);
                        System.out.println("수정이 완료되었습니다.");
                        flag = false;
                        break;
                    case 2:
                        System.out.print("수정할 위치 입력: ");
                        newA.setLocation(scan.nextLine());
                        agodas.set(index, newA);
                        System.out.println("수정이 완료되었습니다.");
                        flag = false;
                        break;
                    case 3:
                        System.out.print("수정할 가격 입력: ");
                        newA.setPrice(scan.nextDouble());
                        agodas.set(index, newA);
                        System.out.println("수정이 완료되었습니다.");
                        flag = false;
                        break;
                    default:
                        System.out.println("1~3번을 입력하세요.");
                        break;
                }
            }
        } else {
            System.out.println("해당 숙소가 없습니다.");
        }
    }

    // 7번 숙소 정보 조회하기
    public void listAgoda() {
        System.out.println("1.전부 조회 | 2.숙소 선택 조회");
        System.out.print("선택 >> ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                for (Agoda a : agodas) {
                    System.out.println(a.toString());
                }
                break;
            case 2:
                System.out.print("조회할 숙소 이름: ");
                String searchName = scan.nextLine();
                for (Agoda a : agodas) {
                    if (a.getName().equalsIgnoreCase(searchName)) {
                        System.out.println(a);
                        break;
                    } else {
                        System.out.println("해당 숙소가 없습니다.");
                        break;
                    }
                }
            default:
                break;
        }

    }

}
