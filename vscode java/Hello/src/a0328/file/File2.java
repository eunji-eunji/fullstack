package a0328.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class File2 {
    public static void main(String[] args) throws IOException {
        // out.txt 파일 생성하여 바이트 스트림으로 저장
        FileOutputStream output = new FileOutputStream("d:/out.txt");

        for (int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다.\r\n";
            // \r\n : 윈도우에서 줄바꿈 문자
            output.write(data.getBytes());
            // out.txt 파일에 데이터 입력
        }
        output.close();
    }
}
