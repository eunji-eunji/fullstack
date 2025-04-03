package homework;

import java.time.LocalDate;
import java.time.Period;

public class Practice {
    public static void main(String[] args) {
        LocalDate d1=LocalDate.of(2025,4,3);
        LocalDate d2=LocalDate.of(2025,4,1);
        int day=Period.between(d2, d1).getDays();
        System.out.println(day);

    }
}
