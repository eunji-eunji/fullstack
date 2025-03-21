package a0321;

public class MyMath1 {
    public static void main(String[] args) {
        // int b=MyMath.add(5,6);
        MyMath mm = new MyMath();
        int m1 = mm.add(3, 5);
        int m2 = mm.subtract(8, 5);
        int m3 = mm.multiplay(3, 5);
        double m4 = mm.divide(3, 5);
        int m5 = mm.max(3, 5);
        System.out.println("m1 += "+m1);
        System.out.println("m2 -= "+m2);
        System.out.println("m3 *= "+m3);
        System.out.println("m4 /= "+m4);
        System.out.println("max = "+m5);

    }
    // 사칙연산을 수행하는 메서드를 가진 MyMath 클래스
    // 메서드는 클래스 영역에 정의 가능
    // 1. MyMath 클래스 만듦
    // 2. 객체 생성
    // 3. 객체 사용
}

class MyMath {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiplay(int a, int b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}