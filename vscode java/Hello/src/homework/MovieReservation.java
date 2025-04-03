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
            System.out.println("1.상영 중인 영화 목록\n2.영화 예매\n3.예매 내역 조회\n4.예매 내역 저장\n5.영화 목록 업로드\n0.종료\n");
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
                case 1:
                System.out.println("성인: 14,000원 / 청소년(14~19세): 11,000원, / 아동(1~13세): 8,000원");
                    manager.displayMovie();
                    break;
            
                default:
                    break;
            }
        }
    }
}
