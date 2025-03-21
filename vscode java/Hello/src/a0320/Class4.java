package a0320;

public class Class4 {
    public static void main(String[] args) {
        Student s = new Student("이순신", 3, "소프트웨어공학과");
        // 객체를 생성과 동시에 초기화 가능. 이럴 경우 생성자가 있어야 함
        Student s1 = new Student("홍길동", 5, "컴퓨터공학과");
        System.out.printf("이름: %s, 학년: %d, 부서: %s\n",s.name, s.grade, s.department);
        System.out.printf("이름: %s, 학년: %d, 부서: %s",s1.name, s1.grade, s1.department);
    }
}

class Student {
    String name;
    int grade;
    String department;

    public Student(String string1, int int1, String string2) {
        name = string1;
        grade = int1;
        department = string2;
    }
}
