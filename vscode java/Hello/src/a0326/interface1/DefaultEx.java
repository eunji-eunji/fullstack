package a0326.interface1;

interface Greeting {
    void sayHello();

    // java 8 이상부터 사용가능한 default 메소드
    // default 있으면 함수 구현할 수 있음
    default void sayGoodbye() {
        System.out.println("안녕히가세요");
    };
}

class Person implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("안녕하세요");
    }

    // Person 클래스에만 존재하는 추가 메소드
    public void introduce() {
        System.out.println("저는 누구입니다.");
    }

}

public class DefaultEx {
    public static void main(String[] args) {
        Person person = new Person();
        person.sayHello();
        person.sayGoodbye();
        person.introduce();

        Greeting parent = new Person();
        parent.sayGoodbye();
        parent.sayHello();
        // parent.introduce(); //컴파일 에러남. Greeting 타입에는 introduce()가 없기 때문에.

        // 다운캐스팅: 부모 -> 자식 타입으로 변환
        if (parent instanceof Person) { // 부모 자식 관계인지 물어봄
            ((Person) parent).introduce(); // Greeting(부모) 타입의 parent을 Person(자식)타입으로 변환
            // parent가 실제로는 Person의 객체이므로, Person으로 다운캐스팅하면 initroduce() 호출 가능
        }
    }
}
