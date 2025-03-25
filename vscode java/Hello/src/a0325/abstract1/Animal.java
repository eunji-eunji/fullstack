package a0325.abstract1;

/* 추상클래스
 * abstract 키워드가 붙은 클래스
 * 객체를 직접 생성할 수 없음
 * 공통적인 기능을 정의하고, 하위 클래스에서 구현하도록 강제하는 역할
 * "일반메서드 + 추상메서드(선언만 있고 구현은 없는 메서드)를 가질 수 있음"
 */

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound(); // 추상메소드(구현X)

    void eat() { // 일반메소드
        System.out.println(name + "is eating");
    }
}

// 추상클래스 사용 이유:
// animal을 상속받는 모든 클래스에 makeSound 메소드를 구현해야 함.
// 놓치지 않게 하기 위해 추상클래스 사용.
class Dog extends Animal { // 추상클래스를 상속받겠다.

    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + "멍멍");
    }

}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + "야옹");
    }

}

class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + "짹짹");
    }

}