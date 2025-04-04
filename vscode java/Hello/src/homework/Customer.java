package homework;

import java.time.LocalDate;
import java.time.Period;

public class Customer {
    private String name;
    private int birthDate;
    private int price; // 나이에 따라 가격이 달라짐

    private String pw;
    private String seat;

    public Customer(String name, int birthDate, String pw) {
        this.name = name;
        this.birthDate = birthDate;
        this.pw = pw;

        if (age(birthDate) >= 20) { // 성인 가격 14,000원
            price = 14000;
        } else if (age(birthDate) >= 14 && age(birthDate) < 20) { // 중고등학생 가격 11,000원
            price = 11000;
        } else { // 0~13세 가격 8,000원
            price = 8000;
        }
    }

    public Customer() {
    }

    public Customer(String name, int birthDate) {
        this.name = name;
        this.birthDate = birthDate;

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

    public int getPrice() {
        return price;
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

    // 예매자 나이 출력
    public int age(int birthDate) { // 830101
        int y = birthDate / 10000; // 83
        int m = (birthDate % 10000) / 100; // 01
        int d = birthDate % 100; // 01

        // 연도를 4자리로 표현
        if (y > 0 && y <= 25) {
            y += 2000;
        } else {
            y += 1900;
        }

        LocalDate birth = LocalDate.of(y, m, d); // 입력한 생년월일
        LocalDate current = LocalDate.now(); // 현재 날짜
        int age = Period.between(birth, current).getYears(); // 나이

        return age;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", birthDate=" + birthDate + ", pw=" + pw + ", seat=" + seat + "]";
    }
}
