package a0326.casting;

public class AnimalMain {
    public static void main(String[] args) {
        Animal eagle=new Eagle();
        eagle.sleep();
        // eagle.eat();    에러

        Eagle eagleObj=(Eagle)eagle;    //강제 형변환
        eagleObj.eat();

    }
}
