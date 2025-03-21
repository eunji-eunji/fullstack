package a0318;

public class Oil {
    public static void main(String[] args) {
        double gasoline=8.86;
        double distance=182.736;
        fuel(gasoline, distance);

    }
    public static void fuel(double gas, double dis){
        double mileage=dis/gas;
        System.out.printf("휘발유 %.2fL, 주행거리 %.3fkm, 연비 %.3fkm/L",gas, dis, mileage);
    }
    // fuel : 메소드 이름
    // double gas, double dis : 매개변수, 입력변수, 파라미터
    // return mileage : 반환값
    // void fuel의 void: 반환 타입
}
