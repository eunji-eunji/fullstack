package a0318;

public class ArrEx2 {
    public static void main(String[] args) {
        int[] arrInt=new int[5];    //길이가 5개인 배열 객체 생성
        System.out.println(arrInt[0]);
        for(int i=0;i<5;i++){
            System.out.println(arrInt[i]);
        }
        for(int num:arrInt){    //향상된 for문
            System.out.println(num);
        }
    }
}
