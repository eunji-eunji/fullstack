package homework;

import java.util.ArrayList;

public class Movie {
    private String movieName;
    private String time;
    private int viewableAge; // 시청 가능 연령
    private ArrayList<String> seats;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getViewableAge() {
        return viewableAge;
    }

    public void setViewableAge(int viewableAge) {
        this.viewableAge = viewableAge;
    }

    public ArrayList<String> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<String> seats) {
        this.seats = seats;
    }

    public Movie(String movieName, String time, int viewableAge) {
        this.movieName = movieName;
        this.time = time;
        this.viewableAge = viewableAge;

        // 좌석 배열(1,2,3,4,5,6,7,8, 1,2,3,4,5,6,7,8, 1,2, ...)
        seats = new ArrayList<>();
        int j = 1;
        for (int i = 1; i <= 40; i++) {
            seats.add(j + "");
            j++;
            if (j > 8)
                j = 1;
        }
    }

    // | screen |
    // ------------------------------
    // A | [1][2] [3][4][5][6] [7][8] |
    // B | [1][2] [3][4][5][6] [7][8] |
    // C | [1][2] [3][4][5][6] [7][8] |
    // D | [1][2] [3][4][5][6] [7][8] |
    // E | [1][2] [3][4][5][6] [7][8] |
    // ------------------------------

    @Override
    public String toString() {
        return "   [영화제목: " + movieName + ", 시작시간: " + time +
                ", 시청가능연령: " + viewableAge + "세 이상]";
    }

    // 좌석 프린트
    public void seatToString() {
        System.out.println("|            screen            |");
        System.out.println("  ------------------------------");
        System.out.print("A | ");
        printRow(8);
        System.out.print("B | ");
        printRow(16);

        System.out.print("C | ");
        printRow(24);

        System.out.print("D | ");
        printRow(32);

        System.out.print("E | ");
        printRow(40);

        System.out.println("  ------------------------------");
    }

    private void printRow(int index) {
        int count=0;
        for (int i = (index - 8); i < index; i++) {
            if (count==2 || count==6) {
                System.out.print(" ");
            }
            System.out.printf("[%s]", seats.get(i));
            count++;
        }
        System.out.println();
    }
}
