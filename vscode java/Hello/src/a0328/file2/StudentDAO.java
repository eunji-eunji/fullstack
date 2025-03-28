package a0328.file2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAO {
    private ArrayList<StudentDTO> slist;
    Scanner scan = new Scanner(System.in);
    FileClass file = new FileClass("student", "student_grade"); // 폴더명, 파일명

    public StudentDAO() {
        slist = new ArrayList<StudentDTO>();
        StudentDTO s1 = new StudentDTO(0, "테스트1", 11, 100, 90, 80);
        StudentDTO s2 = new StudentDTO(1, "테스트2", 22, 90, 89, 91);
        StudentDTO s3 = new StudentDTO(2, "테스트3", 33, 85, 77, 55);
        StudentDTO s4 = new StudentDTO(3, "테스트4", 44, 77, 68, 85);
        slist.add(s1);
        slist.add(s2);
        slist.add(s3);
        slist.add(s4);
    }

    private void insert(StudentDTO s) {
        slist.add(s);
    }

    public void userInsert() {
        StudentDTO s = new StudentDTO();
        s.setId(slist.size()); // slist 크기를 불러옴.
        System.out.println("<학생 추가하기>");
        System.out.print("이름: ");
        s.setName(scan.nextLine());
        System.out.print("나이: ");
        s.setAge(scan.nextInt());
        System.out.print("국어: ");
        s.setKor(scan.nextInt());
        System.out.print("영어: ");
        s.setEng(scan.nextInt());
        System.out.print("수학: ");
        s.setMath(scan.nextInt());

        insert(s);
        System.out.println("학생이 추가되었습니다.");

    }

    // 삭제
    public void userDelete() {
        System.out.println("<학생 정보 삭제하기>");
        int index = searchIndex();
        if (index == -1) {
            System.out.println("해당 학생이 없습니다.");
        } else {
            String name = slist.get(index).getName();
            delete(index);
            System.out.println(name + " 학생 정보를 삭제했습니다.");
        }

    }

    private void delete(int index) {
        slist.remove(index);
    }

    // 인덱스 번호 찾기
    private int searchIndex() {
        int index = -1; // 초기화
        System.out.print("찾을 학생 이름: ");
        String name = scan.nextLine();
        for (int i = 0; i < slist.size(); i++) {
            if (slist.get(i).getName().equalsIgnoreCase(name)) {
                index = i;
                break;
            }
        }
        return index;
    }

    // 정보 검색
    public void userSelect() {
        System.out.println("<학생 정보 검색>");
        int index = searchIndex();
        if (index == -1) {
            System.out.println("해당 학생이 없습니다.");
        } else {
            System.out.println("     이름\t나이\t 국어\t 영어\t 수학\t");
            StudentDTO s = select(index);
            System.out.println(s);
        }
    }

    private StudentDTO select(int index) {
        return slist.get(index);
        // slist 인덱스 번호에 해당하는 StudentDTO 객체 반환
    }

    // 업데이트
    public void userUpdate() {
        System.out.println("<학생 정보 수정>");
        int index = searchIndex();
        if (index == -1) {
            System.out.println("해당 학생이 없습니다.");
        } else {
            StudentDTO s = new StudentDTO();
            s.setId(slist.get(index).getId());
            s.setName(slist.get(index).getName());
            s.setAge(slist.get(index).getAge());
            System.out.println(slist.get(index).getName() + " 학생 점수 수정");
            System.out.print("국어: ");
            s.setKor(scan.nextInt());
            System.out.print("영어: ");
            s.setEng(scan.nextInt());
            System.out.print("수학: ");
            s.setMath(scan.nextInt());
            // slist.set(index, s); //업데이트
            update(index, s);
        }
    }

    private void update(int index, StudentDTO s) {
        slist.set(index, s);
    }

    // 출력
    public void printAll() {
        System.out.println("<학생 정보 출력>");
        System.out.println("     이름\t 나이\t 국어\t 영어 \t수학 \n" +
                "-------------------------------------------------");
        for (int i = 0; i < slist.size(); i++) {
            System.out.println(slist.get(i).toString());
        }
    }

    public void dataSave() throws Exception {
        file.create();
        String str = "     이름\t 나이\t 국어\t 영어 \t수학 \n" +
                "-------------------------------------------------\n";
        for (int i = 0; i < slist.size(); i++) {
            str += slist.get(i).toString() + "\n";
        }
        file.write(str);

    }

    public void dataLoad() {
        try {
            file.read();
        } catch (Exception e) {
            System.out.println("읽을 파일이 없습니다.");
        }
    }

}
