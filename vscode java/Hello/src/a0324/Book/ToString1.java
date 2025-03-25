package a0324.Book;

// 모든 자바 클래스는 Object를 상속받음
public class ToString1 extends Object {
    public static void main(String[] args) {
        Person person=new Person("홍길동", 25);
        System.out.println(person.toString());
        // 객체 person의 person.toString() 함수는 생략됨
        // toString()은 object에서 샹속 받은 메서드. 객체의 문자열을 정의하는 메소드
        // 기본적으로 person 객체에 접근하여 문자열을 출력함.(person@3514... 이렇게 출력됨)
        
    }
}
class Person{
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

// 1. 오버로딩과 오버라이딩의 차이
// 2. this와 this()의 차이
// 를 예제로 만드시오