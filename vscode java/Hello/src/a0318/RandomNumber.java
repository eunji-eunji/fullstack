package a0318;

public class RandomNumber {
    public static void main(String[] args) {
        int n = rollDie();
        System.out.printf("주사위의 눈: %d", n);
    }

    private static int rollDie() {
        int a=(int)(Math.random()*6)+1;
        return a;

        // double x=6*Math.random();
        // int temp=(int)x;
        // return temp+1;
    }
}
