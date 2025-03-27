package a0326.interface1;

interface Flyable {
    void fly();
}

interface Swimable {
    void swim();
}

// 여러 개의 인터페이스를 구현한 클래스
class Bird implements Flyable, Swimable {

    @Override
    public void fly() {
        System.out.println("bird fly");
    }

    @Override
    public void swim() {
        System.out.println("bird swim");
    }

}

public class MultiInterfaceEx {
    public static void main(String[] args) {
        Bird bird=new Bird();
        bird.fly();
        bird.swim();            
    }
}
