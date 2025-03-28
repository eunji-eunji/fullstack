package a0328.file;

import java.io.IOException;
import java.io.InputStream;

public class Input3 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        byte[] a=new byte[3];
        in.read(a);
        // read() 메소드를 통해 a 배열을 키보드로 입력받음

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}
