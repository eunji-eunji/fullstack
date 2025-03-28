package a0328.homeword;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class BookFile {
    private File file;
    private String dir;
    private String fileName;

    public BookFile() { // 기본생성자
        file = new File("d:\\");
    }

    // 생성자
    public BookFile(String dir, String fileName) {
        file = new File("d:\\" + dir + "\\" + fileName + ".txt");
        this.dir = "d:\\" + dir;
        this.fileName = fileName + ".txt";
    }

    private boolean check(File file) {
        if (file.exists()) {
            return true;
        } else {
            return false;
        }
    }

    // 파일 생성
    public void create() throws Exception {
        boolean exist = check(file);
        if (exist) {
            file.delete();
            file.createNewFile();
        } else {
            file = new File(dir);
            file.mkdir();
            file = new File(dir + "\\" + fileName);
        }
    }

    // 파일 쓰기
    public void write(String str) throws Exception {
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(str);
        fw.close();
    }

    public void read() throws Exception{
        boolean exist=check(file);
        if(exist){
            FileReader fr=new FileReader(file);
            BufferedReader bw=new BufferedReader(fr);
            String str;
            while((str=bw.readLine())!=null){
                System.out.println(str);
            }
            bw.close();
        }else{
            System.out.println("읽을 파일이 없습니다.");
        }
    }


}
