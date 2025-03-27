package a0326.collee_homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeTestOrder {
    public static void main(String[] args) {

        Map<String, Integer> menu = new HashMap<>();

        menu.put("Americano", 3000);
        menu.put("Latte", 4000);
        menu.put("Mocha", 4500);
        menu.put("Espresso", 2500);

        Map<String, Integer> order = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        // while (true) {

        System.out.print("몇 명의 주문을 받으시겠습니까? ");
        int numOfPerson = scan.nextInt();
        scan.nextLine();
        System.out.println();

        for (int i = 0; i < numOfPerson; i++) {
            System.out.printf("%d번째 고객님 주문을 시작합니다.\n", i + 1);
            while (true) {
                System.out.println("\n메뉴");
                // for(Map.Entry<String, Integer> entry: menu.entrySet()){
                // System.out.printf("%s - %d원",entry.getKey(), entry.getValue());
                // }
                for (String coffee : menu.keySet()) {
                    System.out.printf("%s - %d원\n", coffee, menu.get(coffee));
                }
                // 주문할 커피 이름
                System.out.print("주문할 커피 이름: ");
                String coffee = scan.nextLine();

                if (!menu.containsKey(coffee)) {
                    System.out.println("해당 커피는 메뉴에 없습니다.");
                    continue;
                }

                // 주문할 커피 수량
                System.out.print("수량: ");
                int quantity;

                while (true) {
                    try {
                        quantity = scan.nextInt();
                        scan.nextLine();
                        if (quantity <= 0) {
                            System.out.println("1 이상의 숫자를 입력하세요.");
                            continue;
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("유효한 숫자를 입력하세요.");
                        continue;
                    }
                }

                // 커피 주문 저장
                order.put(coffee, order.getOrDefault(coffee, 0) + quantity);
                System.out.printf("%s %d개 추가\n", coffee, quantity);
                System.out.println();
                break;
            }
        }

        // }

        scan.close();
        System.out.println("\n주문내역");
        int total = 0;
        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            int price = menu.get(entry.getKey()) * entry.getValue();
            System.out.printf("%s X %d = %d\n", entry.getKey(), entry.getValue(), price);
            total += price;
        }
        double discount = 0;
        if (total >= 20000) {
            discount = total * 0.1;
            System.out.println("총 금액이 2만원 이상일 경우 10% 할인이 적용됩니다.");
        }
        System.out.printf("총 금액: %d원\n", total);
        System.out.printf("할인 금액: %.0f원\n", discount);
        total = total - (int) discount;
        System.out.printf("총 결제 금액: %d원", total);

    }
}
