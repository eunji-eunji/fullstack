package a0321.Account1;

public class Main2 {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동", 12345678, 91, 85, 92);
        System.out.println("이름: " + student1.getName());
        System.out.println("학번: " + student1.getID());
        System.out.println("국어: " + student1.getKor());
        System.out.println("수학: " + student1.getMath());
        System.out.println("영어: " + student1.getEng());
        System.out.println("평균: " + student1.getAvg());

        Student student2 = new Student();
        student2.setName("이경자");
        student2.setStudentId(20134578);
        student2.setKor(90);
        student2.setMath(85);
        student2.setEng(94);
        System.out.println("이름: " + student2.getName());
        System.out.println("학번: " + student2.getID());
        System.out.println("국어: " + student2.getKor());
        System.out.println("수학: " + student2.getMath());
        System.out.println("영어: " + student2.getEng());
        System.out.println("평균: " + student2.getAvg());
    }
}
