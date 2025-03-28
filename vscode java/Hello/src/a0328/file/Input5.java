package a0328.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input5 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        BufferedReader bw=new BufferedReader(new InputStreamReader(System.in));
        // 축약형

        String a = br.readLine(); // 한 줄씩 입력 가능

        // BufferedReader 특징
        // 별다른 정규식 검사를 하지 않는다. (타입의 제약이 없다.)
        // 개행이 입력되면 데이터를 보낸다.
        // type(int, String 등등) 검사가 필요 없을 때 BufferedReader 쓰면 될 듯

        System.out.println(a);
    }
}
