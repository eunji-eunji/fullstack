package a0401.order;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Customer {
    private final String name;
    private final String city;

    public Customer(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

class Order {
    private final int id;
    private final Customer customer;
    private final String product;
    private final int quantity;

    public Order(int id, Customer customer, String product, int quantity) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                "}\n";
    }
}

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Kim", "Seoul");
        Customer customer2 = new Customer("Lee", "Busan");
        Customer customer3 = new Customer("Park", "Seoul");
        Customer customer4 = new Customer("Choi", "Seoul");

        List<Order> orders = Arrays.asList(
                new Order(1, customer1, "Laptop", 1),
                new Order(2, customer2, "Smartphone", 2),
                new Order(3, customer3, "Keyboard", 1),
                new Order(4, customer1, "Mouse", 3),
                new Order(5, customer4, "Monitor", 1),
                new Order(6, customer3, "USB Cable", 2));

        // 여기에 답을 작성하세요.
        // 문제 1: 서울에 사는 고객의 주문만 출력하시오.
        problem1(orders);

        // 문제 2: 모든 주문의 총 수량을 구하시오.(mapToInt사용)
        problem2(orders);

        // 문제 3: 각 고객의 이름과 그 고객이 주문한 제품명을 출력하시오.
        problem3(orders);

        // 문제 4: 특정 고객("Kim")의 주문만 필터링하여 출력하시오.
        problem4(orders);

        // 문제 5: 주문 수량이 2개 이상인 주문만 출력하시오.
        problem5(orders);

        // 문제 6: 고객이 주문한 제품의 종류를 중복 없이 출력하시오.
        problem6(orders);

        // 문제 7. 모든 주문을 quantity 기준 내림차순으로 정렬하시오.
        problem7(orders);

        // 문제 8.각 도시별로 고객 수를 출력하시오. (count이용)
        problem8(orders);

    }

    private static void problem8(List<Order> orders) {
        Map<String, Long> result = orders.stream()
                .map(Order::getCustomer)
                .distinct()
                .collect(Collectors.groupingBy(Customer::getCity, Collectors.counting()));
        result.forEach((city, count) -> System.out.println(city + ": " + count));
    }

    private static void problem7(List<Order> orders) {
        List<Order> result = orders.stream()
                .sorted(Comparator.comparing(Order::getQuantity).reversed())
                .collect(Collectors.toList());
        System.out.println(result);
    }

    private static void problem6(List<Order> orders) {
        List<String> result = orders.stream()
                .map(Order::getProduct)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);
    }

    private static void problem5(List<Order> orders) {
        List<Order> result = orders.stream()
                .filter(o -> o.getQuantity() >= 2)
                .collect(Collectors.toList());
        System.out.println(result);
    }

    private static void problem4(List<Order> orders) {
        List<Order> result = orders.stream()
                .filter(o -> o.getCustomer().getName().equalsIgnoreCase("kim"))
                .collect(Collectors.toList());
        System.out.println(result);

    }

    // 문제 3: 각 고객의 이름과 그 고객이 주문한 제품명을 출력하시오.
    private static void problem3(List<Order> orders) {
        Map<String, List<String>> map = orders.stream()
        .collect(Collectors.groupingBy(o->o.getCustomer().getName(), 
        Collectors.mapping(Order::getProduct, Collectors.toList())));
        map.forEach((name, product)->System.out.print(name+"->"+product+"\n"));
    }

    private static void problem2(List<Order> orders) {
        int result = orders.stream()
                .mapToInt(t -> t.getQuantity())
                .sum();
        System.out.println("합계: " + result + "\n");
    }

    private static void problem1(List<Order> orders) {
        List<Order> result = orders.stream()
                .filter(t -> t.getCustomer().getCity().equalsIgnoreCase("seoul"))
                .collect(Collectors.toList());
        System.out.println(result + "\n");

    }
}