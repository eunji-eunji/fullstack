package a0321;

public class HeroTest {
    public static void main(String[] args) {
        Hero thor = new Hero("토르", 150);
        Hero thanos = new Hero("타노스", 200);
        thor.punch(thanos);
        thor.punch(thanos);
        thanos.punch(thor);
    }
}
class Hero{
    String name;
    int hp;
    Hero(String name, int hp){
        this.name=name;
        this.hp=hp;
    }

    void punch(Hero enemy){ //히어로 클래스 타입이 punch 클래스의 매개변수
        System.out.printf("[%s]의 주먹!", name);    //토르의 주먹
        enemy.hp -= 10;
        System.out.printf(" -> %s의 체력 : %d\n", enemy.name, enemy.hp);   //타노스의 이름, 체력
    }
}