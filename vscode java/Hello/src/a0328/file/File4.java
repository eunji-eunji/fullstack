package a0328.file;

import java.io.FileWriter;
import java.io.IOException;

public class File4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d:/out.txt");
        for (int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다.\r\n";
            // \r\n : 윈도우에서 줄바꿈 문자
            fw.write(data);
        }
        // println 메소드 사용할 수 있다. \r\n 을 대체함
        fw.close();

        // 파일에 내용 추가
        FileWriter fw2 = new FileWriter("d:/out.txt",true); //이어쓰기
        for (int i = 11; i < 21; i++) {
            String data = i + "번째 줄입니다.\r\n";
            // \r\n : 윈도우에서 줄바꿈 문자
            fw2.write(data);
        }
        // println 메소드 사용할 수 있다. \r\n 을 대체함
        fw2.close();
    }
}
