package a0327.class1;

// Enum: 서로 연관된 상수들의 집합. (열거형)
enum Day{   
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY 
}
public class Enum1 {
    public static void main(String[] args) {
        Day today=Day.WEDNESDAY;
        System.out.println("오늘은 "+today+"입니다.");
    }   
}
