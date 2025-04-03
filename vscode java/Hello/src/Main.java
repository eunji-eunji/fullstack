
// 자바에서 기본적으로 제공하는 유틸리티 기능들을 사용하기 위해 import 함
// List, Map, Arrays 같은 자료구조를 쓰기 위함
import java.util.*;
// Stream 관련 기능을 사용하기 위해 import 함
// stream(), filter(), map(), collect() 등을 사용하려면 필요해
import java.util.stream.Collectors;

// 이 Customer 클래스는 "고객"에 대한 정보를 담는 설계도야.
// 즉, 이 클래스를 통해 고객 객체를 만들 수 있어.
class Customer {
    // 'name'이라는 변수는 고객의 이름을 저장하기 위한 공간이야.
    // 예: Kim, Lee 같은 사람이름
    // String은 문자열 자료형을 의미하고, final은 한 번 값이 정해지면 바꿀 수 없다는 뜻이야.
    private final String name;

    // 'city'라는 변수는 고객이 거주하는 도시 정보를 저장해.
    // 예: Seoul, Busan 같은 도시이름이 들어감
    private final String city;

    // 생성자: 객체가 생성될 때 name과 city 값을 받아서 초기화함
    public Customer(String name, String city) {
        this.name = name; // 생성자 매개변수 name을 현재 객체의 name에 저장
        this.city = city; // 생성자 매개변수 city를 현재 객체의 city에 저장
    }

    // 고객의 이름을 외부에서 가져갈 수 있도록 해주는 메서드 (getter)
    public String getName() {
        return name;
    }

    // 고객의 도시를 외부에서 가져갈 수 있도록 해주는 메서드 (getter)
    public String getCity() {
        return city;
    }

    // 객체를 문자열로 표현할 때 자동으로 호출되는 메서드 (출력용)
    @Override
    public String toString() {
        return "Customer{name='" + name + "', city='" + city + "'}";
    }
}

// Order 클래스는 "주문" 정보를 담는 설계도야.
// 각 주문은 주문번호(id), 주문한 고객(customer), 상품명(product), 수량(quantity)을 가지고 있어.
class Order {
    private final int id; // 주문 번호를 저장하는 변수
    private final Customer customer; // 주문한 고객의 정보
    private final String product; // 주문한 제품 이름
    private final int quantity; // 주문 수량

    // 생성자: 주문 객체를 만들 때 필요한 값들을 받아서 초기화해줌
    public Order(int id, Customer customer, String product, int quantity) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    // 주문 번호를 가져오는 메서드
    public int getId() {
        return id;
    }

    // 주문한 고객 정보를 가져오는 메서드
    public Customer getCustomer() {
        return customer;
    }

    // 주문한 제품 이름을 가져오는 메서드
    public String getProduct() {
        return product;
    }

    // 주문 수량을 가져오는 메서드
    public int getQuantity() {
        return quantity;
    }

    // 주문 정보를 문자열로 보기 좋게 출력할 수 있게 해주는 메서드
    @Override
    public String toString() {
        return "Order{id=" + id + ", customer=" + customer + ", product='" + product + "', quantity=" + quantity + "}";
    }
}

// Main 클래스: 프로그램이 시작되는 메인 클래스
public class Main {
    public static void main(String[] args) {
        // 고객 4명을 생성하고 각각 이름과 도시를 지정함
        Customer customer1 = new Customer("Kim", "Seoul");
        Customer customer2 = new Customer("Lee", "Busan");
        Customer customer3 = new Customer("Park", "Seoul");
        Customer customer4 = new Customer("Choi", "Seoul");

        // 주문 목록을 배열로 만든 뒤, 리스트로 변환함
        // 각 주문은 고객 객체, 제품 이름, 수량을 가지고 있음
        List<Order> orders = Arrays.asList(
                new Order(1, customer1, "Laptop", 1),
                new Order(2, customer2, "Smartphone", 2),
                new Order(3, customer3, "Keyboard", 1),
                new Order(4, customer1, "Mouse", 3),
                new Order(5, customer4, "Monitor", 1),
                new Order(6, customer3, "USB Cable", 2)
        );

        // 문제 1~8까지 각각 호출하여 결과를 출력함
        practice1(orders);
        practice2(orders);
        practice3(orders);
        practice4(orders);
        practice5(orders);
        practice6(orders);
        practice7(orders);
        practice8(orders);
    }

    // 문제 1: 서울에 사는 고객의 주문만 출력하시오.
private static void practice1(List<Order> orders) {
    System.out.println("\n문제 1: 서울에 사는 고객의 주문");

    // orders: 주문 목록(List<Order>)을 가지고 있음
    // .stream(): 리스트를 스트림이라는 "데이터 흐름"으로 바꿔줌 → 한 줄씩 순차적으로 처리 가능
    // .filter(): 조건에 맞는 데이터만 고르기 위한 함수
    // order -> ... : 람다식 (일종의 간단한 익명 함수), 리스트 안의 Order 하나하나를 처리
    // order.getCustomer(): 주문에 연결된 Customer 객체를 가져옴
    // getCity(): 고객이 사는 도시 이름을 반환
    // "Seoul".equals(...): null 방지 + 문자열이 "Seoul"과 같은지 비교
    // collect(...): 최종적으로 남은 결과를 다시 리스트로 모아서 저장

    List<Order> result = orders.stream() // 주문 리스트를 하나씩 처리 가능한 스트림으로 변환
        .filter(order -> "Seoul".equals(order.getCustomer().getCity())) // 조건: 고객의 도시가 "Seoul"인 것만 남김
        .collect(Collectors.toList()); // 그 결과들을 새로운 리스트로 모음

    // 결과 리스트를 하나씩 출력
    result.forEach(System.out::println); // forEach: 리스트를 반복하며 각 요소를 println으로 출력
}


    // 문제 2: 모든 주문의 총 수량을 구하시오.
private static void practice2(List<Order> orders) {
    System.out.println("\n문제 2: 전체 주문 수량 합계");

    // stream(): 리스트를 스트림으로 변환
    // mapToInt(): 각 주문에서 수량만 뽑아서 숫자(int) 스트림으로 변환함
    // Order::getQuantity → 주문 객체에서 수량을 꺼내는 메서드를 참조하는 방식
    // sum(): 수량들을 모두 더함

    int result = orders.stream()
        .mapToInt(Order::getQuantity) // mapToInt: 각 주문에서 정수 수량만 꺼냄 (예: 2, 3, 1 ...)
        .sum(); // 그 숫자들을 다 더함

    // 최종 결과 출력
    System.out.println(result);
}


    // 문제 3: 각 고객의 이름과 주문한 제품명을 출력하시오.
    private static void practice3(List<Order> orders) {
        System.out.println("\n문제 3: 고객 이름과 주문 제품명");
    
        // 주문 리스트에서 고객 이름과 제품명을 문자열로 만들어 리스트로 저장할 거야.
        // 예: "Kim → Laptop" 이런 형태로 만들 거야.
    
        List<String> result = orders.stream() // 주문 리스트를 스트림으로 바꿔서 하나씩 처리
            .map(order -> 
                // map(): 스트림 안에 있는 요소를 다른 형태로 "변환"하는 함수야.
                // 여기선 Order 객체 → String (문자열)로 바꾸는 게 목적이야.
                order.getCustomer().getName() + " → " + order.getProduct()
                // 고객 이름 + " → " + 제품명 으로 연결된 문자열을 만들고 있음.
            )
            .collect(Collectors.toList()); // map으로 만들어진 문자열들을 리스트로 수집해.
    
        result.forEach(System.out::println); // 결과 출력
    }
    
    

    // 문제 4: 고객 "Kim"의 주문만 출력하시오.
    private static void practice4(List<Order> orders) {
        System.out.println("\n문제 4: 고객 'Kim'의 주문");
    
        List<Order> result = orders.stream() // 스트림으로 변환해서 하나씩 처리
            .filter(order ->
                // filter(): 조건에 맞는 데이터만 걸러냄
                "Kim".equals(order.getCustomer().getName())
                // 고객 이름이 "Kim"과 같은 경우만 남김
                // null 안전하게 문자열을 앞에 두는 "역순 비교" 방식 사용
            )
            .collect(Collectors.toList()); // 필터링된 주문을 리스트로 모음
    
        result.forEach(System.out::println); // 출력
    }
    

    // 문제 5: 수량이 2개 이상인 주문만 출력하시오.
    private static void practice5(List<Order> orders) {
        System.out.println("\n문제 5: 수량이 2개 이상인 주문");
    
        List<Order> result = orders.stream()
            // 주문 목록(orders)을 하나씩 순서대로 처리하기 위해 stream으로 변환해.
            // stream은 리스트의 각 요소(Order)를 차례차례 꺼내서 처리할 수 있는 흐름이야.
    
            .filter(order -> order.getQuantity() >= 2)
            // filter(): 조건을 만족하는 데이터만 남기는 함수야.
            // 지금은 람다식 `order -> order.getQuantity() >= 2`가 들어가 있는데,
            // 이건 각 주문 객체(order)에 대해서 그 수량이 2 이상인지 검사하는 함수야.
            // 결과적으로 "수량이 2개 이상인 주문"만 리스트에 남게 돼.
    
            .collect(Collectors.toList());
            // 마지막으로 조건에 맞게 걸러진 주문들을 List로 모아서 저장해.
    
        result.forEach(System.out::println);
        // 걸러진 주문들을 하나씩 출력해줘.
    }
    

    // 문제 6: 중복 없는 제품명 출력
    private static void practice6(List<Order> orders) {
        System.out.println("\n문제 6: 중복 없는 제품 종류");
    
        List<String> result = orders.stream()
            .map(Order::getProduct)
            // map(): Order 객체 → String(제품명) 으로 변환하는 단계야.
            // Order 객체는 여러 정보(id, 고객, 수량 등)를 갖고 있는데,
            // 그 중 우리가 보고 싶은 건 '제품명'이니까 그것만 추출하는 거야.
    
            // 예: "Laptop", "Mouse", "Mouse", "USB Cable", "Laptop" ... 이런 식으로 나올 수 있어.
    
            .distinct()
            // distinct(): 중복을 제거하는 함수야.
            // 위처럼 제품명이 반복될 수 있기 때문에, 한 번만 보고 싶을 때 사용해.
            // 중복을 없애고 "Laptop", "Mouse", "USB Cable" 이렇게 고유한 것만 남겨줘.
    
            .collect(Collectors.toList());
            // 고유한 제품명을 리스트로 모아서 저장
    
        result.forEach(System.out::println);
        // 출력해서 사용자에게 보여줌
    }
    

    // 문제 7: 주문 수량 기준으로 내림차순 정렬
    private static void practice7(List<Order> orders) {
        System.out.println("\n문제 7: 수량 기준 내림차순 정렬");
    
        List<Order> result = orders.stream()
            .sorted(
                Comparator.comparing(Order::getQuantity).reversed()
                // Comparator.comparing(): 어떤 값을 기준으로 정렬할지 정함
                // 여기선 getQuantity() → 수량 기준
                // .reversed(): 내림차순으로 뒤집음 (큰 수부터 나오게)
            )
            .collect(Collectors.toList());
    
        result.forEach(System.out::println);
    }
    

    // 문제 8: 도시별 고객 수 출력
    private static void practice8(List<Order> orders) {
        System.out.println("\n문제 8: 도시별 고객 수");
    
        Map<String, Long> result = orders.stream()
            .map(Order::getCustomer)
            // Order 객체에서 Customer 객체만 꺼냄
    
            .distinct()
            // 같은 고객이 여러 번 주문했을 수도 있으니 중복 제거
    
            .collect(Collectors.groupingBy(
                Customer::getCity,
                // 고객의 도시(city)를 기준으로 그룹을 나눔
    
                Collectors.counting()
                // 각 그룹(도시)별로 몇 명인지 세어줌
            ));
    
        result.forEach((city, count) ->
            System.out.println(city + " → " + count + "명")
        );
    }
    
}
