package a0320;

public class Class5_1 {
    public static void main(String[] args) {
        Person1 p1 = new Person1("홍길동", 31);
        Person1 p2 = new Person1();
        // 생성자가 이미 있을 경우 기본생성자가 만들어지지 않으므로 직접 만들어야 함.
        p2.name="이순신";
        p2.age=25;
        System.out.println(p1.name + p1.age);
        System.out.println(p2.name + p2.age);
    }
}

class Person1 {
    String name;
    int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person1() {

    }

    // 자바에서 기본으로 아래와 같이 기본생성자를 만들어 준다.
    // public Person1(){
    //
    // }
}