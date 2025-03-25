package a0324.UpCasting;

public class UpCasingTest {
    public static void main(String[] args) {
        Square s = new Square();
        s.name = "사각형";
        Triangle t = new Triangle();
        t.name = "삼각형";
        Circle c = new Circle();
        c.name = "원";

        Shape[] shapes = {s, t, c};
        // 자식을 부모 타입 배열에 저장하는 것을 업캐스팅 배열 생성이라 함. (Shape)s -> (Shape)쓰는 게 좋지만 생략 가능함

        for(int i=0;i<shapes.length;i++){
            System.out.printf("%d인 인덱스의 도형: %s\n", i, shapes[i].name);
        }

    }
}
// 상속 관계가 정의된 자식 객체는 부모의 타입으로 해석, 즉 업캐스팅될 수 있다.
// 서로 다른 자식 객체를 부모의 타입으로 묶어 관리할 수 있다.

class Shape {
    String name;
}

class Square extends Shape {

}

class Triangle extends Shape {

}

class Circle extends Shape {

}