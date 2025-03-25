package a0325.bicycle;

abstract class Vehicle{
    String name;

    public Vehicle(String name) {
        this.name = name;
    }
    abstract void move();

    void displayinfo(){
        System.out.printf("이 차량은 %s입니다.\n",name);
    }
}

class Car extends Vehicle{

    public Car(String name) {
            super(name);
        }
    
        @Override
    void move() {
        System.out.printf("자동차 %s이(가) 도로를 달립니다.\n", name);
    }

}

class Bicycle extends Vehicle{

    public Bicycle(String name) {
            super(name);
        }
    
        @Override
    void move() {
        System.out.printf("자전거 %s이(가) 도로를 달립니다.\n", name);
    }

}

public class BicycleMain {
    public static void main(String[] args) {
        Vehicle car=new Car("붕붕이");
        Vehicle bicycle=new Bicycle("따릉이");

        car.move();
        bicycle.move();

        car.displayinfo();
        bicycle.displayinfo();
    }
}
