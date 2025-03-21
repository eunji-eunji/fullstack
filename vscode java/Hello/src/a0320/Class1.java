package a0320;

public class Class1 {
    public static void main(String[] args) {
        Cat.claw();
        Cat c=new Cat();
        c.name = "네로";
        c.breeds="koreanShortHair";
        c.weight=4.37;

        // 필드 출력
        System.out.printf("이름: %s \n",c.name);
        System.out.printf("품종: %s \n",c.breeds);
        System.out.printf("무게: %.2fkg \n",c.weight);
        // '.' : 닷연산자. 객체를 접근하기 위한 연산자
    }
}

class Cat{
    static String name;
    // static: 객체 생성하지 않을 경우 필요

    String breeds;  // -> 필드(= 인스턴스 변수)
    double weight;

    static void claw(){
        System.out.println("할퀴기");
    }
    static void meow(){
        System.out.println("야옹");
    }
}
