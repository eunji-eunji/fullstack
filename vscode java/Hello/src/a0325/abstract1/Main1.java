package a0325.abstract1;

public class Main1 {
    public static void main(String[] args) {
        Dog dog=new Dog("puppy");
        Cat cat=new Cat("kitty");
        Bird bird=new Bird("bird");

        dog.makeSound();
        dog.eat();

        Animal dog1=new Dog("Buddy");
        dog1.eat();
        // Animal 클래스가 추상클래스이므로 직접 인스턴스를 만들 수 없고,
        // Dog 같은 하위 클래스에서 인스턴스를 만들어야 한다.
        // 추상클래스에 있는 일반 클래스도 이용할 수 있다.

        Animal cat1=new Cat("kitten");
        cat1.makeSound();

    }
}
