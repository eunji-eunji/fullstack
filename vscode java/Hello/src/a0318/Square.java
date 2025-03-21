package a0318;
public class Square {
    public static void main(String[] args) {
        int n = 4;
        int s = Square(n);
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d", n, s);

    }

    public static int Square(int length) {
        // public : 접근 제한자. 누구나 접근할 수 있음.
        //static : 객체 생성없이 square 함수를 부를 때 필요
        //함수의 타입 int Square 써야 함.
        int result = length * length;
        return result;
        // 계산한 값을 돌려줘야 함
    }
}
