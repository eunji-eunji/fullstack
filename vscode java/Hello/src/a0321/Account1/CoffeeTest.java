package a0321.Account1;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee c = new Coffee("아메리카노", 3000);
        System.out.printf("%s(%d) -> ", c.getName(), c.getPrice());
        c.setPrice(c.getPrice() + 500);
        System.out.printf("%s(%d) -> ", c.getName(), c.getPrice());

    }
}

class Coffee {
    private String name;
    private int price;

    Coffee (String c, int i) {
        name = c;
        price = i;
    }

    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int i) {
        price = i;
    }

}