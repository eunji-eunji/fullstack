package a0318;

public class Square1 {
    public static void main(String[] args) {
        int n = 4;
        int s = SquareUtill.Square(n);
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d", n, s);
    }

}

// public은 한 개만 있을 수 있음.
// class 안의 public은 가능함.
// 클래스 안의 함수를 불러야 함. SquareUtill.Square();
class SquareUtill {
    public static int Square(int length) {
        // public : 접근 제한자. 누구나 접근할 수 있음.
        // static : 객체 생성없이 square 함수를 부를 때 필요
        // 함수의 타입 int Square 써야 함.
        int result = length * length;
        return result;
        // 계산한 값을 돌려줘야 함
    }
}
