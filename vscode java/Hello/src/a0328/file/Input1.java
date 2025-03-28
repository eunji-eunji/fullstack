package a0328.file;

import java.io.IOException;
import java.io.InputStream;

public class Input1 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        // System.in - 키보드로 입력 받음.
        // InputStream read 에서는 1byte 크기의 사용자 입력

        int a;
        a = in.read();  // 키보드로 입력한 값을 읽어서 a에 넣음
        System.out.println(a);
        // 아스키코드는 7비트를 활용한 문자 표현코드
        // 알파벳 대소문자, 숫자 0~9, 특수문자 
        // 숫자 0 : 아스키코드 48, a : 97
    }
}
