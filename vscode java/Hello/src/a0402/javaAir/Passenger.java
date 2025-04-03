package a0402.javaAir;

import java.time.LocalDate;
import java.time.Period;

public class Passenger {
    private String name;
    private int birthDate;
    private String pw;
    private String seat;

    public Passenger(String name, int birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Passenger(String name, int birthDate, String pw) {
        this.name = name;
        this.birthDate = birthDate;
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    // 15세 이상만 국제선 예약 가능
    public boolean man15(Passenger p) { // 831016
        int y = p.birthDate / 10000; // 83
        int m = (p.birthDate % 10000) / 100; // 1016 -> 10
        int d = p.birthDate % 100; // 16

        if (y > 0 && y <= 25) {
            y = y + 2000;
        } else {
            y += 1900;
        }

        LocalDate birthDate2 = LocalDate.of(y, m, d); // 생년월일
        LocalDate currentDate = LocalDate.now(); // 오늘 날짜
        int age = Period.between(birthDate2, currentDate).getYears();
        // System.out.println(age);
        return age > 15;
    }

    // 위와 같은 함수
    public boolean isEligibleForInternationalFlight() {
        int y = birthDate / 10000;
        int m = (birthDate % 10000) / 100;
        int d = birthDate % 100;

        y = (y > 0 && y <= 24) ? y + 2000 : y + 1900;

        LocalDate birthDate2 = LocalDate.of(y, m, d);
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate2, currentDate).getYears();

        return age > 15;
    }

    @Override
    public String toString() {
        return "Passenger [name=" + name + ", birthDate=" + birthDate + ", pw=" + pw + ", seat=" + seat + "]";
    }
}
