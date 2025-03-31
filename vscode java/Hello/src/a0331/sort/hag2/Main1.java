package a0331.sort.hag2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("학생 수 입력: ");
        int n = sc.nextInt();

        // Student[] students = new Student[n];

        // 학생 정보 입력
        for (int i = 0; i < n; i++) {
            System.out.print("학생 이름: ");
            String name = sc.nextLine();
            System.out.print("학생 나이: ");
            int age = sc.nextInt();
            System.out.print("학생 학번: ");
            int studentId = sc.nextInt();
            sc.nextLine(); // 개행 문자 소비

            // students[i] = new Student(name, age, studentId);
            students.add(new Student(name, age, studentId));
        }
        InsertionSort(students);

        // 정렬된 결과 출력
        System.out.println("정렬된 학생 목록:");
        for (Student student : students) {
            System.out.println(student);
        }

        sc.close(); // Scanner 닫기
    }

    private static void InsertionSort(ArrayList<Student> students) {
        int n = students.size();
        for (int i = 1; i < n; i++) {
            Student currentStudent = students.get(i); // key=1(students[1])
            int j = i - 1; // j=0
            while (j >= 0 && students.get(j).getName().compareTo(currentStudent.getName()) > 0) {
                // students.get(j+1) = students.get(j);
                students.set(j+1,students.get(j));
                j--;
            }
            students.set(j+1, currentStudent);
        }
    }
}

class Student {
    private String name;
    private int age;
    private int studentId;

    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
    }

}