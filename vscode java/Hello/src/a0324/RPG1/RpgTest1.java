package a0324.RPG1;

public class RpgTest1 {
    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        wizard.name = "gandalph";
        wizard.hp = 100;
        wizard.mp = 80;
        wizard.speed = 2;
        wizard.punch();
        wizard.fireball();
        wizard.move();

        System.out.println();
        Knight knight = new Knight();
        knight.name = "전사";
        knight.hp = 150;
        knight.strong = 150;
        knight.punch();
        knight.splash();
        knight.speed = 3;
        knight.move();
    }
}

class Novice{
    String name;
    int hp;
    int speed;
    void punch(){
        System.out.printf("%s(HP: %d)의 펀치!\n", name, hp);
    }
    void move(){
        System.out.printf("%d만큼 이동합니다.\n", speed);
    }
}

class Wizard extends Novice{
    int mp;
    void fireball(){
        System.out.printf("%s(HP: %d, MP: %d)의 FireBall!\n", name, hp, mp);
    }
}

class Knight extends Novice{
    int strong;
    void splash(){
        System.out.printf("%s(HP: %d, STR: %d)의 splash!\n", name, hp, strong);
    }
}