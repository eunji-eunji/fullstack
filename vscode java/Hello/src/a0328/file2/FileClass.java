package a0328.file2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileClass {
    private File file; // 자바에서 제공하는 파일 객체
    private String dir; // 디렉토리(폴더)
    private String fileName; // 파일명

    public FileClass() {
        file = new File("d:\\");
    }

    public FileClass(String dir, String fileName) {
        file = new File("d:\\" + dir + "\\" + fileName + ".txt");
        this.dir = "d:\\" + dir;
        this.fileName = fileName + ".txt";
    }

    private boolean check(File file2) {
        if (file.exists()) {
            return true;
        } else {
            return false;
        }
    }

    public void create() throws Exception {
        boolean exist = check(file);
        if (exist) {
            file.delete(); // 파일이 있으면 지움. 파일 클래스에서 제공하는 삭제 메소드
            file.createNewFile(); // 파일 생성. 파일 클래스에서 제공하는 생성 메소드
        } else {
            file = new File(dir);
            file.mkdir(); // 폴더 만들기
            file = new File(dir + "\\" + fileName);
        }
    }

    public void write(String str) throws Exception {
        FileWriter fw = new FileWriter(file); // 파일쓰기를 위한
        PrintWriter pw = new PrintWriter(fw); // 파일에 데이터 출력하기 편리함. -> println, printf을 쓸 수 있음
        pw.println(str);
        fw.close();
    }

    public void read() throws Exception {
        boolean exist = check(file);
        if (exist) {
            FileReader fr = new FileReader(file);
            BufferedReader bw = new BufferedReader(fr);
            String str;
            while ((str = bw.readLine()) != null) {
                System.out.println(str);
            }
            bw.close();
        }else{
            System.out.println("읽을 파일이 없습니다.");
        }
    }

}
