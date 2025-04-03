package a0401;

import java.util.ArrayList;
import java.util.List;

public class List3 {
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

        // 이름만 출력
        System.out.println();
        for (Student s : studentList) {
            System.out.println(s.getName());
        }

        studentList.stream()
                .map(Student::getName)    //이름만 추출
                .forEach(System.out::println);    //출력

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
        return studentList.stream()
                .filter(student -> student.getId() == i)
                .findFirst()    // 학생이 여러명 있어도 첫 번째 학생만 선택
                .orElse(null);  //학생을 찾으면 해당 학생을 반환. 찾지 못하면 null 반환
    }

    private static void deleteStudent(List<Student> studentList, int i) {
        boolean removed = studentList.removeIf(student -> student.getId() == i); // 잘 지워졌으면 true 반환
        System.out.println(removed ? "삭제 완료" : "찾을 수 x");
    }

    private static void updateStudent(List<Student> studentList, int i, String string, int j) {
        boolean updated = studentList.stream()
                .filter(student -> student.getId() == i)
                .peek(student -> {
                    student.setName(string);
                    student.setAge(j);
                })
                .findFirst()
                .isPresent();
        System.out.println(updated ? "학생ID " + i + "정보 수정" : "찾을 수 없습니다.");
    }

    private static void printList(List<Student> studentList) {
        studentList.forEach(System.out::println);
    }
}
