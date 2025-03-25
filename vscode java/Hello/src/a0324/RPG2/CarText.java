package a0324.RPG2;

public class CarText {
    public static void main(String[] args) {
        Truck t = new Truck("봉고", 1.5);
        
    }
}
class Car{
    String name;

    public Car(String _name) {
        name = _name;
        System.out.println("모델명: "+name);
    }
    void move(){
        System.out.printf("[%s]가 이동합니다.\n", name);
    }

}
class Truck extends Car{
    double payload;

    public Truck(String _name, double payload) {
        super(_name);   // 부모생성자 호출 코드가 자동생성됨.
        this.payload = payload;
    }
    void load(){
        System.out.printf("[%s]가 물건을 적재합니다. (최대 %.1f톤)\n", name, payload);
    }

}