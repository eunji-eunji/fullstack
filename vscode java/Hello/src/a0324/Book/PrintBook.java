package a0324.Book;

public class PrintBook extends Book {
    private double weight;
    private int pageCount;
    
    
    public PrintBook(String title, String author, String iSBN, double weight, int pageCount) {
        super(title, author, iSBN);
        this.weight = weight;
        this.pageCount = pageCount;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Page Count: "+pageCount);
        System.out.println("Weight: "+weight+"kg");
    }

}
