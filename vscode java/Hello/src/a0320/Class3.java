package a0320;

public class Class3 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        // 객체 생성
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 5;

        System.out.printf("c1:%s %d, 크기: %d, %d\n", c1.kind, c1.number, c1.width, c1.height);
        System.out.printf("c2:%s %d, 크기: %d, %d\n", c2.kind, c2.number, c2.width, c2.height);

        // c1.width=50;    // 클래스(공용) 변수이기 때문에 다른 객체의 변수도 바뀜
        // c1.height=40;
        Card.width=50;  //변수 값을 바꿀 때, c1.width로 바꾸는 것보다 이게 좋은 방법
        Card.height=40;

        System.out.printf("c1:%s %d, 크기: %d, %d\n", c1.kind, c1.number, c1.width, c1.height);
        System.out.printf("c2:%s %d, 크기: %d, %d\n", c2.kind, c2.number, c2.width, c2.height);


    }
}

class Card {
    String kind; // 인스턴스(객체) 변수
    int number;
    static int width = 100;
    static int height = 80; // 클래스 변수
    // static 쓰는 이유 : Card 클래스에서 모든 카드의 크기가 똑같을 경우, static을 사용함. Card.width; 클래스
    // 변수라고 함
    // static이 있으므로 객체 생성없이 사용 가능
}