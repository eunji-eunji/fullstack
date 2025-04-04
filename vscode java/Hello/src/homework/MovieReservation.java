package homework;

import java.util.Scanner;

public class MovieReservation {
    public static void main(String[] args) {
        MovieManager manager = new MovieManager();
        Scanner sc = new Scanner(System.in);
        FileC fc = new FileC();
        System.out.println();
        System.out.println("(^O^)/  더조은 영화관에 오신걸 환영합니다.");

        end: while (true) {
            System.out.println("\n1.상영 중인 영화 목록\n2.영화 예매\n3.예매 내역 조회\n4.예매 내역 저장\n5.영화 목록 업로드\n0.종료\n");
            System.out.print("메뉴입력 > ");
            String menuStr = sc.next();
            sc.nextLine();

            int menu = -1;
            try {
                menu = Integer.parseInt(menuStr);
            } catch (NumberFormatException e) {
                menu = 9;
            }
            switch (menu) {
                // 1. 상영 중인 영화 목록
                case 1:
                    manager.displayMovieList("상영 중인 영화");
                    break;
                // 2. 영화 예매
                case 2:
                    try {
                        manager.bookMovie();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                // 3. 예매 내역 조회
                case 3:
                    manager.checkReservation();
                    break;
                // 4. 예매 내역 저장
                case 4:
                    manager.ticketSave();
                    break;
                // 5. 영화 목록 업로드
                case 5:
                    fc.upload();
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    sc.close();
                    break end;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        }
    }
}
