package movie_test;

import java.text.DecimalFormat;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MovieManager {
    private static ArrayList<Movie> movies; // 영화 정보
    private static ArrayList<Customer> customers; // 고객 정보
    private static Map<String, Movie> reservationMap = new HashMap<>(); // Map<고객, 고객이 예매한 영화>
    private static FileC fc = new FileC();
    private DecimalFormat priceFormat = new DecimalFormat("#,###원");

    Scanner sc = new Scanner(System.in);

    public MovieManager() {
        movies = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void displayMovieList(String str) {
        System.out.println("\n-----------" + str + "-----------");
        int count = 1;
        for (Movie movie : movies) {
            System.out.println(count + "" + movie);
            count++;
        }
        System.out.println("------------------------------");
        System.out.println("성인: 14,000원 / 청소년(14~19세): 11,000원, / 아동(1~13세): 8,000원\n");
    }

    // 영화 예매
    public void bookMovie() throws InterruptedException {
        // 나이에 따라 시청 제한
        for (;;) {
            displayMovieList("영화 예매");
            System.out.print("예매할 영화 번호 입력(0: 메뉴) > ");
            try {
                int bookNum = Integer.parseInt(sc.next());
                if (bookNum == 0) {
                    System.out.println("메뉴로 돌아갑니다.\n");
                    break;
                }
                if (bookNum > movies.size() || bookNum < 1) {
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }
                System.out.println("선택한 영화");
                System.out.println("===============================");
                System.out.println(bookNum + "" + movies.get(bookNum - 1));
                System.out.println("===============================");
                Movie mv = movies.get(bookNum - 1);
                if (customerInfo(mv) == false) {
                    break;
                }

                if (customers != null && !customers.isEmpty()) {
                    String seatNum = Integer.toString(seatSelection(mv));
                    // 숫자 0~39를 String으로 변경하여 customers의 seat에 저장
                    customers.get(customers.size() - 1).setSeat(seatNum);
                    System.out.println("예약 중입니다.");
                    Thread.sleep(2000);

                    System.out.println("===============================");
                    System.out.println("예약이 완료되었습니다.");
                    System.out.println("      [" + customers.get(customers.size() - 1).getName() + "] 님의 예약 정보   ");
                    System.out.println("  " + bookNum + "" + mv);
                    System.out.println("===============================");
                    System.out.println("잠시 후 메인 화면으로 이동합니다.");
                    Thread.sleep(2000);
                    reservationMap.put(customers.get(customers.size() - 1).getName(), mv);
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    // 좌석 예약
    private int seatSelection(Movie mv) throws InputMismatchException {
        int seatNum = -1;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("=======================");
                mv.seatToString();
                System.out.print("좌석 열(A-E): ");
                String seatLine = sc.next().toUpperCase();

                if (!"ABCDE".contains(seatLine)) {
                    System.out.println("A-E까지만 입력 가능합니다.");
                    continue;
                }

                System.out.print("좌석 번호: ");
                int seatInt = sc.nextInt() - 1;
                sc.nextLine();

                if (seatInt < 0 || seatInt > 7) {
                    System.out.println("좌석 번호는 1부터 8까지만 입력 가능합니다.");
                    continue;
                }

                int rowOffset = 0;
                switch (seatLine) {
                    case "A":
                        rowOffset = 0;
                        break;
                    case "B":
                        rowOffset = 8;
                        break;
                    case "C":
                        rowOffset = 16;
                        break;
                    case "D":
                        rowOffset = 24;
                        break;
                    case "E":
                        rowOffset = 32;
                        break;
                }

                // 좌석 배열의 인덱스 번호
                int finalIndex = seatInt + rowOffset;

                // 이미 예약된 좌석인지 확인
                if (mv.getSeats().get(finalIndex).equals("X")) {
                    System.out.println("이미 예약된 좌석입니다.");
                    continue;
                }

                mv.getSeats().set(finalIndex, "X");

                // 변경이 성공적으로 적용되었는지 확인
                if (mv.getSeats().get(finalIndex).equals("X")) {
                    // seatLine: 좌석 열(A-E) / seatInt: 0~7
                    System.out.println("좌석 선택이 완료되었습니다: " + seatLine + (seatInt + 1));
                    seatNum = finalIndex;
                    flag = false; // 정상적으로 좌석 선택 완료
                } else {
                    System.out.println("좌석 선택에 실패했습니다. 다시 시도해주세요.");
                }

            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다.");
            }
        }
        // seatNum: 0~39의 숫자
        return seatNum;
    }

    // 고객 정보
    private boolean customerInfo(Movie mv) {
        System.out.println("\n예매자 정보를 입력하세요.(0: 메뉴)");
        System.out.print("이름: ");
        String name = sc.next();

        // 메뉴로 돌아가기
        if (name.equals("0")) {
            System.out.println("메뉴로 돌아갑니다.");
            return false;
        }
        System.out.print("생년월일(6자리): ");
        try {
            int birthDate = Integer.parseInt(sc.next());

            // 메뉴로 돌아가기
            if (birthDate == 0) {
                System.out.println("메뉴로 돌아갑니다.");
                return false;
            }

            Customer c = new Customer(name, birthDate);
            if (c.age(birthDate) >= mv.getViewableAge()) { // 시청 가능한 연령인지
                System.out.print("결제 비밀번호: ");
                String pw = sc.next();
                c = new Customer(name, birthDate, pw);
                customers.add(c);
            } else {
                System.out.println(mv.getViewableAge() + "세 미만은 시청할 수 없습니다.");
                return false;
            }
            return true;
        } catch (DateTimeException e) {
            System.out.println("생년월일을 6자리로 입력해주세요. ex)990101");
            return false;
        }
    }

    // 예매 확인
    public void checkReservation() {
        int index = search("예약 확인");
        if (index == -1) {
            System.out.println("예약된 내역이 없습니다.");
            return;
        }
        checkPassword(index);
    }

    // 예약자 찾기
    private int search(String str) {
        System.out.println("========" + str + "========");
        System.out.print("예약자 이름: ");
        String name = sc.next();
        int index = -1;
        if (customers != null) {
            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).getName().equals(name)) {
                    index = i;
                }
            }
        }
        return index;
    }

    // 비밀번호 확인
    private void checkPassword(int index) {
        if (index != -1) {
            System.out.print("결제 비밀번호 입력: ");
            String pw = sc.next();
            sc.nextLine();
            System.out.println();
            if (customers.get(index).getPw().equals(pw)) {
                System.out.println("비밀번호가 일치합니다.");
                System.out.println(ticketPrint(reservationMap, customers.get(index).getName()));
                return;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다.");
                return;
            }
        }
    }

    // 예매 정보 출력
    public String ticketPrint(Map<String, Movie> reservationMap, String name) {
        int index = -1;
        int bookPrice = -1;
        if (customers != null) {
            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).getName().equals(name)) {
                    index = i;
                    bookPrice = customers.get(i).getPrice();
                }
            }
        }

        // 배열 인덱스를 1~40인 숫자로 저장
        int seat = Integer.parseInt(customers.get(index).getSeat()) + 1;

        // A1, A2, A3, ...E8 로 표현
        String seatName;
        if (seat <= 8) {
            seatName = "A" + seat;
        } else if (seat > 8 && seat <= 16) {
            seat -= 8;
            seatName = "B" + seat;
        } else if (seat > 16 && seat <= 24) {
            seat -= 16;
            seatName = "C" + seat;
        } else if (seat > 24 && seat <= 32) {
            seat -= 24;
            seatName = "D" + seat;
        } else {
            seat -= 32;
            seatName = "E" + seat;
        }

        String priceComma = priceFormat.format(bookPrice);
        return "ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n" +
                "\t" + name + "님의 티켓정보" +
                "| 좌석 : " + seatName + "번 | 가격: " + priceComma + "\n" +
                reservationMap.get(name) + "\n" +
                "ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n";
    }

    // 예매 내역 저장
    public void ticketSave() {
        int index = search("티켓 조회");
        if (index == -1) {
            System.out.println("예약된 내역이 없습니다.");
            return;
        }
        checkPassword(index);
        fc.ticketSaveFile(reservationMap, customers.get(index).getName());
    }

    public static ArrayList<Movie> getMovies() {
        return movies;
    }

    public static Map<String, Movie> getReservatioMap() {
        return reservationMap;
    }

    // 예매 취소
    public void ticketCancel() {
        int index = search("예약 확인");
        if (index == -1) {
            System.out.println("예약된 내역이 없습니다.");
            return;
        }
        checkPassword(index);

        Customer customer = customers.get(index);
        // 영화 객체를 Map에서 가져옴
        Movie reservedMovie = reservationMap.get(customer.getName());

        Movie originalMovie = null;
        for (Movie m : movies) {
            if (m.getMovieName().equals(reservedMovie.getMovieName())) {
                originalMovie = m;
                break;
            }
        }

        if (originalMovie == null) {
            System.out.println("해당 영화를 찾을 수 없습니다.");
            return;
        }

        // 좌석 복구
        String seat = customer.getSeat(); // ex) String 타입 0~39(배열 인덱스 번호)
        int seatInt = Integer.parseInt(seat); // int 타입 0~39(배열 인덱스 번호)
        if (seatInt != -1) {
            if (seatInt < 8) { // 0~7
                seat = (seatInt + 1) + ""; // int 타입에서 0~7의 String 타입으로 변경
            } else if (seatInt >= 8 && seatInt < 16) { // 8~15
                seat = (seatInt - 7) + "";
            } else if (seatInt >= 16 && seatInt < 24) { // 16~23
                seat = (seatInt - 15) + "";
            } else if (seatInt >= 24 && seatInt < 32) { // 24~31
                seat = (seatInt - 23) + "";
            } else if (seatInt >= 32 && seatInt < 40) { // 32~39
                seat = (seatInt - 31) + "";
            }
        } else {
            System.out.println("취소할 수 없습니다.");
            return;
        }
        // 영화의 좌석을 'X'에서 숫자로 변경
        originalMovie.getSeats().set(seatInt, seat);

        // 고객 정보 및 예매 정보 제거
        reservationMap.remove(customer.getName());
        customers.remove(index);
        System.out.println("예매가 취소되었습니다.");
    }

    // 영화 등록
    public void resister() {
        System.out.print("등록할 영화 제목: ");
        String name = sc.nextLine();
        for (int i = 0; i < movies.size(); i++) {
            if (name.equalsIgnoreCase(movies.get(i).getMovieName())) {
                System.out.println("이미 등록된 영화입니다.");
                return;
            }
        }
        System.out.print("영화 시작 시간: ");
        String time = sc.nextLine();
        try {
            System.out.print("영화 시청 연령: ");
            int age = sc.nextInt();
            Movie newMovie = new Movie(name, time, age);
            movies.add(newMovie);
            System.out.println("영화가 등록되었습니다.");
            fc.saveMovieList();
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력하세요.");
        }
    }

    // 영화 수정
    public void change() {
        System.out.print("수정할 영화 제목: ");
        String existName = sc.nextLine();
        for (int i = 0; i < movies.size(); i++) {
            if (existName.equalsIgnoreCase(movies.get(i).getMovieName())) {
                System.out.println("\n1.영화 제목 수정\n2.영화 시작시간 수정\n3.영화 시청 가능 연령 수정\n");
                System.out.print("메뉴 > ");
                int menu = sc.nextInt();
                sc.nextLine();
                switch (menu) {
                    case 1:
                        System.out.print("수정할 영화 제목 입력: ");
                        String newName = sc.nextLine();
                        movies.get(i).setMovieName(newName);
                        break;
                    case 2:
                        System.out.print("수정할 영화 시작시간 입력: ");
                        String newTime = sc.nextLine();
                        movies.get(i).setTime(newTime);
                        break;
                    case 3:
                        try {
                            System.out.print("수정할 영화 시청가능 연령 입력: ");
                            int newAge = sc.nextInt();
                            movies.get(i).setViewableAge(newAge);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("숫자만 입력하세요.");
                        }
                    default:
                        System.out.println("잘못 입력하셨습니다.");
                        break;
                }
                fc.saveMovieList();
                return;
            }
        }
        System.out.println("존재하지 않는 영화입니다.");
        return;
    }

    // 영화 삭제
    public void remove() {
        System.out.print("삭제할 영화 제목: ");
        String existName = sc.nextLine();
        for (int i = 0; i < movies.size(); i++) {
            if (existName.equalsIgnoreCase(movies.get(i).getMovieName())) {
                movies.remove(i);
                System.out.println("영화가 삭제되었습니다.");
                fc.saveMovieList();
                return;
            }
        }
        System.out.println("존재하지 않는 영화입니다.");
        return;
    }

}
