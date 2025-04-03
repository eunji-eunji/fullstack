package a0401;

import java.util.ArrayList;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
        // ArrayList 생성
        List<Student> studentList = new ArrayList<>();

        // 객체추가
        studentList.add(new Student(101, "Alice", 20));
        studentList.add(new Student(102, "Bob", 22));
        studentList.add(new Student(103, "Charlie", 21));

        System.out.println(studentList);

        printList(studentList);

        System.out.println(studentList.get(1).toString());
        System.out.println(studentList.get(1).getName());

        System.out.println();
        for (Student s : studentList) {
            System.out.println(s.getName());
        }

        System.out.println();
        studentList.add(new Student(104, "David", 23));
        printList(studentList);

        System.out.println();
        // 데이터 변경 함수
        updateStudent(studentList, 102, "Robert", 25);
        printList(studentList);

        // 데이터 삭제
        System.out.println("\n특정 학생 삭제");
        deleteStudent(studentList, 103);
        printList(studentList);
        // 특정 학생 검색
        System.out.println("\n 특정 학생 검색");
        Student searchedStudent = findStudentById(studentList, 104);
        System.out.println(searchedStudent != null ? searchedStudent : "학생을 찾을 수 없습니다.");

    }

    private static Student findStudentById(List<Student> studentList, int i) {
        Student st = null;
        for (Student s : studentList) {
            if (s.getId() == i) {
                st = s;
            }
        }
        return st;
    }

    private static void deleteStudent(List<Student> studentList, int i) {
        for (Student s : studentList) {
            if (s.getId() == i) {
                studentList.remove(s);
            }
        }
    }

    private static void updateStudent(List<Student> studentList, int i, String string, int j) {
        for (Student s : studentList) {
            if (s.getId() == i) {
                s.setName(string);
                s.setAge(j);
            }
        }
    }

    private static void printList(List<Student> studentList) {
        for (Student s : studentList) {
            System.out.println(s.toString());
        }
    }
}

class Student {

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}