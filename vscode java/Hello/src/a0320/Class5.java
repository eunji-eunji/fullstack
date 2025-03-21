package a0320;

public class Class5 {
    public static void main(String[] args) {
        Person person1 = new Person("홍길동", 31);
        System.out.println(person1.name + person1.age);
    }
}

class Person {
    String name;
    int age;

    public Person(String string, int i) {
        name = string;
        age = i;
    }
}