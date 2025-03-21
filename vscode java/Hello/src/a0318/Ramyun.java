package a0318;

public class Ramyun {
    public static void main(String[] args) {
        buy();  //라면을 사온다
        boil(); //물을 끓인다
        put();  //라면을 넣는다
        eat();  //맛있게 먹는다
    }
    private static void buy(){
        System.out.println("라면을 사온다.");
    }
    private static void boil(){
        System.out.println("물을 끓인다.");
    }
    private static void put(){
        System.out.println("라면을 넣는다.");
    }
    private static void eat() {
        System.out.println("맛있게 먹는다.");
    }
}
