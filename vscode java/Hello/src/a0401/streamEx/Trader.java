package a0401.streamEx;

public class Trader {
    @Override
    public String toString() {
        return "Trader [name=" + name + ", city=" + city + "]";
    }

    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

}
