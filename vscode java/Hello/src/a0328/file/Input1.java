package a0328.file;

import java.io.IOException;
// ↑ io패키지는 throws IOException 을 통해 반드시 예외처리 해줘야 한다.
import java.io.InputStream;

public class Input1 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        // InputStream 타입의 in 변수 생성.
        // InputStream read 에서는 1byte 크기의 사용자 입력

        int a;
        a = in.read();  
        // in 변수를 read() 메소드를 통해 키보드로 입력받음
        System.out.println(a);
        // 아스키코드는 7비트를 활용한 문자 표현코드
        // 알파벳 대소문자, 숫자 0~9, 특수문자 
        // 숫자 0 : 아스키코드 48, a : 97
    }
}
