package a0328.file;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input4 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        // byte 대신 문자로 입력스트림 읽을 때

        InputStreamReader in2 = new InputStreamReader(System.in);
        // 축약

        char[] a = new char[3]; // 문자열
        reader.read(a);

        System.out.println(a);
    }
}
