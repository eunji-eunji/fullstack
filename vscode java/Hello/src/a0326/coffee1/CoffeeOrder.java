// package a0326.coffee1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeOrder {
    public static void main(String[] args) {
        Map<String, Integer> menu = new HashMap<>();

        menu.put("Americano", 3000);
        menu.put("Latte", 4000);
        menu.put("Mocha", 4500);
        menu.put("Espresso", 2500);

        Map<String, Integer> order = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n메뉴");
            for (Map.Entry<String, Integer> entry : menu.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + "원");
            }
            // menu.entrySet(); 커피 이름과 가격을 저장
            // entry.getKey(); 커피 이름
            // entry.getValue(); 가격

            for (String coffee : menu.keySet()) {
                System.out.println(coffee + " - " + menu.get(coffee) + "원");
            }
            // menu.keySet() : 메뉴의 모든 키(커피 이름)
            // menu.get(coffee) : 해당 키의 값(가격)

            System.out.print("주문할 커피 이름(종료: exit): ");
            String coffee = scan.nextLine();
            if (coffee.equalsIgnoreCase("exit")) {
                break;
            }
            if (!menu.containsKey(coffee)) { // 입력한 coffee가 메뉴에 없을 경우. (containsKey : )
                System.out.println("해당 커피는 메뉴에 없습니다.");
                continue;
            }

            System.out.print("수량: ");
            int quantity;

            while (true) {
                // 예외 처리 방법
                try {
                    quantity = Integer.parseInt(scan.nextLine());
                    if (quantity <= 0) {
                        System.out.println("1 이상의 숫자를 입력하세요.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    // 예외 종류 모르면 가장 상위 예외인 exception 써도 됨
                    System.out.println("유효한 숫자를 입력해주세요.");
                    continue;
                }
            }
            
            // order.put(coffee,quantity);
            order.put(coffee, order.getOrDefault(coffee, 0) + quantity); // coffee 이름이 안 들어가면 0 입력
            // getOrDefault : 맵에서 키가 존재하지 않을 경우 기본값을 반환하는 메소드
            // null 값 방지

            // if(menu.containsKey(coffee)){
            // order.put(coffee, quantity);
            // }
            // containsKey를 사용할 필요 없이 코드가 간결
            System.out.println(coffee + " " + quantity + "개 추가");
        }
        scan.close();
        System.out.println("\n주문내역");
        int total = 0;
        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            int price = menu.get(entry.getKey()) * entry.getValue();
            System.out.println(entry.getKey() + " X " + entry.getValue() + " = " + price + "원");
            total += price;
        }
        System.out.printf("총 금액: %d원\n", total);
    }
}
