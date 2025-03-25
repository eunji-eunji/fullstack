package a0324.RPG2;

public class Area1 {
    public static void main(String[] args) {
        Square s = new Square();
        s.name = "사각형";
        s.length = 3;
        
        Triangle t = new Triangle();
        t.name = "삼각형";
        t.base = 4;
        t.height = 3;
        Circle c = new Circle();
        c.name = "원";
        c.radius = 4;

        Shape[] shapes = {s, t, c};
        // 자식을 부모 타입 배열에 저장하는 것을 업캐스팅 배열 생성이라 함. (Shape)s -> (Shape)쓰는 게 좋지만 생략 가능함

        for(int i=0;i<shapes.length;i++){
            System.out.printf("%s의 넓이: %.2f\n", shapes[i].name, shapes[i].area());
        }

    }
}
// 상속 관계가 정의된 자식 객체는 부모의 타입으로 해석, 즉 업캐스팅될 수 있다.
// 서로 다른 자식 객체를 부모의 타입으로 묶어 관리할 수 있다.

class Shape {
    String name;
    double area(){
        return 0;
    }
}

class Square extends Shape {
    int length;
    double area(){
        return length*length;
    }
}

class Triangle extends Shape {
    int base;
    int height;
    double area(){
        return (base*height)/2;
    }
}

class Circle extends Shape {
    int radius;
    double area(){
        return radius*radius*Math.PI;
    }
}