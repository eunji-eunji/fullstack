package homework;

import java.util.Scanner;

public class MovieReservation {
    public static void main(String[] args) {
        MovieManager manager = new MovieManager();
        Scanner sc = new Scanner(System.in);
        FileC fc = new FileC();
        fc.upload(); // 파일에서 영화 목록 불러옴

        String adminPassword = "admin0317";

        System.out.println();
        System.out.println("(^O^)/  Movie Cinema에 오신걸 환영합니다.");

        end: while (true) {
            System.out.println("\n1.상영 중인 영화 목록\n2.영화 예매\n3.예매 내역 조회\n4.예매 내역 저장\n5.예매 취소\n6.관리자 모드\n0.종료\n");
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
                // 5. 예매 취소
                case 5:
                    manager.ticketCancel();
                    break;
                // 6. 관리자 모드 입장
                case 6:
                    System.out.println("관리자 비밀번호를 입력하세요.");
                    System.out.print("입력: ");
                    String admin = sc.nextLine();
                    if (admin.equals(adminPassword)) {
                        System.out.println("관리자 모드로 변경되었습니다.");
                        System.out.println("1.영화 등록 / 2.영화 수정 / 3.영화 삭제");
                        System.out.print("메뉴 > ");
                        int adaminMenu = sc.nextInt();
                        switch (adaminMenu) {
                            // 영화 등록
                            case 1:
                                manager.resister();
                                break;
                            // 영화 수정
                            case 2:
                                manager.change();
                                break;
                            // 영화 삭제
                            case 3:
                                manager.remove();
                                break;
                            default:
                                System.out.println("잘못 입력하셨습니다.");
                                break;
                        }
                        break;
                    } else {
                        System.out.println("관리자 비밀번호가 일치하지 않습니다.");
                        break;
                    }
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
