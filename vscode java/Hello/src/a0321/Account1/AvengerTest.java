package a0321.Account1;

public class AvengerTest {
    public static void main(String[] args) {
        Avenger ironman=new Avenger("아이언맨", 100, 120);
        Avenger hulk=new Avenger("헐크", 100, 120);
        System.out.println(ironman.toStr());
        System.out.println(hulk.toStr());
    }
}

class Avenger {
    private String name;
    private int power;
    private int speed;

    // 위의 인스턴스 변수 블럭한 후 전구 모양 클릭 - construct 클릭하면 자동 생성 됨
    public Avenger(String name, int power, int speed) {
        this.name = name;
        this.power = power;
        this.speed = speed;
    }

    String toStr() {
        return String.format("Avenger{name: %s, poser: %d, speed: %d}", name, power, speed);
    }
}