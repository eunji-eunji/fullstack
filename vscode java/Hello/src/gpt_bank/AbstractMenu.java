package gpt_bank;

public class AbstractMenu implements Menu{
    protected String title;

    public AbstractMenu(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("\n==== " + title + " ====");
    }
}
