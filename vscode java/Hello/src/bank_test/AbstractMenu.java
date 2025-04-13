package bank_test;

// 메뉴 인터페이스 상속
public abstract class AbstractMenu implements Menu {
    protected String title;

    public AbstractMenu(String title) {
        this.title = title;
    }

    // 메뉴 인터페이스의 print함수 구현
    @Override
    public void print() {
        System.out.println("\n==== " + title + " ====");
    }
}
