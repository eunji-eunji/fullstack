package a0326.string;

public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer();
        System.out.println("원본: "+str);

        System.out.println(str.append("수업"));
        System.out.println("append 호출: "+str);
    }
}
