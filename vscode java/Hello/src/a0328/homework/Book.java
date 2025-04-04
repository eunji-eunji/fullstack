package a0328.homework;

public class Book {
    private String book;
    private String author;
    private String isbn;
    private double price;
    public Book(){
        
    }
    public Book(String book, String author, String isbn, double price) {
        this.book = book;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }
    public String getBook() {
        return book;
    }
    public void setBook(String book) {
        this.book = book;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "[제목: " + book + ", 저자: " + author + ", ISBN: " + isbn + ", 가격: " + price+"원]";
    }

}
