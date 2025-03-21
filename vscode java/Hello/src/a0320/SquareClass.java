package a0320;

public class SquareClass {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.length = 3;
        System.out.println(sq.area());

    }

    // 객체지향 프로그램의 장점
    // 1. 프로그램 유지 보수가 좋다.
    // 2. 코드 재사용이 용이하다.

    // 클래스 -> 객체의 설계도
    // 3. 클래스를 토대로 만들어진 프로그램의 구성요소를 객체
    // 클래스 설계 - 필드와 메소드로 이루어짐    

}
class Square {
    int length;

    int area() {
        return length * length;
    }
}