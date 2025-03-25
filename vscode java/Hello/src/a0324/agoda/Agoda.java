package a0324.agoda;

public class Agoda {
    private String name;
    private String location;
    private double price;
    private boolean available;

    public Agoda(){
    }

    public Agoda(String name, String location, double price) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Agoda 숙소 이름: " + name + ", 위치: " + location + ", 가격: " + price + ", 가능여부: "
                + (available ? "가능" : "불가능");
    }
}
