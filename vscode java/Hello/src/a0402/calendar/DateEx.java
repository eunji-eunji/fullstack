package a0402.calendar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateEx {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        // 현재 날짜와 시간
        System.out.println("기본 ISO 형식: "+now);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        // mm : 분, MM : 월
        String formattedDate = now.format(formatter);
        System.out.println("포매팅된 날짜: " + formattedDate);
        // MM을 소문자로 쓰면 분으로 인식. MM,DD 두개씩 써야 04,02 두 자릿수로 표기
        // HH 대문자 - 24시간 표기
        // 시간 hh 로 쓰면 12시간 표기. hh:mm:ss a -> a : am/pm 표시
    }
}
