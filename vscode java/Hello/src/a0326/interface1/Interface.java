package a0326.interface1;

interface Animal {
    void makeSound();   //추상메소드(abstract가 생략된 형태임)
    // 일반메소드 사용 금지
}
// 인터페이스를 구현하는 클래스 

class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

}
class Cat implements Animal{

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }

}
public class Interface {
    public static void main(String[] args) {
        // 인터페이스는 추상클래스와 마찬가지로 자신을 객체로 만들 수 없음
        Animal dog=new Dog();
        Animal cat=new Cat();
        // main() 메소드에서 다형성을 활용하여 Animal 타입으로 Dog, Cat 객체를 생성할 수 있다.

        dog.makeSound();
        cat.makeSound();
    }
}
