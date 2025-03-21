package a0321.Account1;

public class Student {
    private String name;
    private int studentId;
    private int kor, math, eng;

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    Student(String n, int sid, int k, int m, int e) {
        name = n;
        studentId = sid;
        kor = k;
        math = m;
        eng = e;
    }

    String getName() {
        return name;
    }

    int getID() {
        return studentId;
    }

    int getKor() {
        return kor;
    }

    int getMath() {
        return math;
    }

    int getEng() {
        return eng;
    }

    double getAvg() {
        return ((kor + math + eng) / 3.0);
    }

    public Student() {
        // 기본생성자
    }

}
