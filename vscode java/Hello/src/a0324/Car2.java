package a0324;

public class Car2 {
    String color;
    String company;
    String type;

    public Car2(String color, String company, String type) {
        this.color = color;
        this.company = company;
        this.type = type;
    }

    Car2() {
        this("white", "kia", "경차");
    }

    Car2(String com, String t) {
        this("white", com, t);
    }

    Car2(String t) {
        this("white", "kia", t);
    }

    // public String toString() {
    //     return color + "-" + company + "-" + type;
    // }

    @Override
    public String toString() {
        return "Car2 [color=" + color + ", company=" + company + ", type=" + type + "]";
        // toString 함수 override(재정의)
    }

    // 생성자: 객체를 만드는 특별한 메소드, 객체의 상태를 초기화할 수 있음.
    // 생성자는 호출부와 정의부로 나뉜다.
    // 생성자 호출 시 new 키워드 사용
    // 생성자 이름과 클래스명이 같다.
    // 생성자는 생성 객체의 주소를 반환한다.
    // 생성자는 반환 타입을 적지 않는다.
    // 클래스 내부에 생성자가 없는 경우, defalt 생성자가 추가된다.


    // toString() 기본동작 : 클래스 이름@16진수 해시코드 반환
    // toString() override(재정의) : 객체정보를 의미있게 출력
    // System.out.println("c2 = "+c2); : toString() 자동 호출됨

    // ArrayList, HashMap - toString()이 이미 오버라이딩 되어 있음
}
