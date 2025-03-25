package a0324.RPG2;

public class Con1 {
    public static void main(String[] args) {
        new BBB();
    }
}
class AAA{
    AAA(){
        System.out.println("AAA() 생성자 호출 완료");
    }
}
class BBB extends AAA{
    BBB(){
        super();    //생략된 부모 생성자 호출 코드. 
        System.out.println("BBB() 생성자 호출 완료");
    }
}
// 상속 관계에서 자식 객체가 만들어지려면 부모 영역이 먼저 완성되어야 함.
// 그래서 부모 객체가 먼저 생성된 후 자식 객체가 생성됨.
// ★ 자식 생성자는 부모 생성자를 반드시 호출함. super() 자동 삽입