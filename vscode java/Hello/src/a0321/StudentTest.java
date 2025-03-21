package a0321;

public class StudentTest {
    public static void main(String[] args) {
        Student park = new Student(20191221,"park");
        Student kim = new Student(20191223,"kim");
        Student lee = new Student(20191236,"lee");
        System.out.printf("Student 객체의 수: %d", Student.count);
        
    }
}

class Student {
    int id;
    String name;    //인스턴스 변수
    static int count = 0;   //클래스 변수

    Student(int id, String name) {  //생성자
        Student.count++;    //클ㄹ스 변수에 객체가 생성될 때마다 1씩 증가
        this.id = id;
        this.name = name;
    }
}
