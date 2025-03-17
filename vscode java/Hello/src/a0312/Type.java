package a0312;

public class Type {
    public static void main(String[] args) {
        // 정수
        byte b=127;     //-128 ~ 127
        short s=32767;  //-32768 ~ 32767
        int i= 2147483647;  //-2,147,483,648 ~ 2,147,483,647
        long l = 9223372036854775807L;    // //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        // long은 숫자 끝에 L 써야 함.

        // 실수
        float f=10.0f;
        // float는 숫자 끝에 f 써야 함
        double d=10.0;

        // 변수명
        int n=1;   //변수 이름은 숫자로 시작할 수 없다.
        // int public=1;    예약어를 변수명으로 사용할 수 없다.
        // 변수명은 영문자, 숫자, $, _ 로 시작
        // 변수명은 소문자로 시작하는 것이 일반적이다. 소문자로 시작해서 그 이후의 각 단어는 대문자 표기. : 카멜표기법
        int numberInt = 0;

        /*  정리
        자바에서 클래스 이름의 첫 글자는 대문자로 시작. Person, OrderDetain
        클래스 제외 나머지는 소문자로 시작  firstName, userAccount
        
        예외 2개
        1. 상수: 모두 대문자 사용. 언더바로 구분.   USER_LIMIT
        2. 패키지: 모두 소문자 사용.    org.spring.boot....
        */
    }
}
