package a0324.Doseo1;

public class Library {
    @Override
    public String toString() {
        return "Library 책제목: " + titile + ", 저자: " + author + ", 책위치: " + location + ", isbn: " + isbn
                + ", 대출여부: " + (available ? "대출가능" : "대출 불가능") ;
    }

    private String titile;
    private String author;
    private String location;
    private String isbn;
    private boolean available;

    public Library() {
    }

    public Library(String titile, String author, String location, String isbn) {
        this.titile = titile;
        this.author = author;
        this.location = location;
        this.isbn = isbn;
        this.available = true;
    }


    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void book(){
        this.available = false;
    }
}
