package a0327.exception1;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
// customException은 Exception(자바의 최상위 예외)를 상속 받음
// 사용자 정의 예외
// 생성자를 통해

public class ExceptionEx04 {
    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (CustomException e) {
            // customException은 원래 없는 예외임. 사용자 정의 예외
            System.out.println("예외발생: " + e.getMessage());
        }
    }
    // checkNumber(-5)를 호출하여 음수 전달 -> 예외 발생
    // catch(CustomException e)에서 예외를 잡고 예외메시지를 출력함

    private static void checkNumber(int num) throws CustomException {
        if (num < 0) {
            throw new CustomException("음수X");
        }
        System.out.println("입력값: " + num);
    }
    // 매개변수로 받은 num이 음수라면 customException을 발생시킴
    // throws cunstomException을 선언하여 이 메서드가 예외를 던질 수 있음을 표시
}
