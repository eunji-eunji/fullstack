package a0331.coffee;

import java.text.DecimalFormat;
import java.util.*;

public class CoffeeService {
    Map<String, Integer> orderList;
    private boolean reorder = false;
    private int orderNum = 1;

    Coffee coffee = Coffee.getInstance(); // 커피메뉴 관리하는 싱글톤 객체
    Customer customer;
    Thread t = new Thread();
    // 사용자가 처리할 프로램 지정 - 지연클래스
    Scanner sc = new Scanner(System.in);

    public CoffeeService() {
        orderList = new LinkedHashMap<>();
        // LinkedHashMap : 입력순서 또는 접근 순서 보장, 속도 느림. 용도: 순서가 중요한 경우
    }

    public void start() {
        System.out.println("\n어서오세요. 더조은커피샵입니다.");
        customer = new Customer(orderNum);
        coffee.getMenu();
        order();
        totalOrder(customer);
        try {
            System.out.println("주문하신 음료가 나왔습니다.");
            t.sleep(2000);
            end();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void order() {
        System.out.println("\n취소를 원하시면 0번을 눌러주세요.");
        end: while (true) {
            try {
                System.out.print("\n원하는 음료의 번호를 선택하세요.");
                String choice = sc.nextLine();
                int choiceNum = Integer.parseInt(choice.substring(0, 1));
                // 한 글자만 추출해서 숫자로 변경
                if (choiceNum == 0) {
                    System.out.println("주문을 취소합니다.\n");
                    System.exit(0);
                }
                sc.nextLine();
                String coffeeName = coffee.coffeeList.get(choiceNum - 1);

                System.out.println("선택하시느 음료는: " + coffeeName + "입니다. 몇 잔 주문하시겠?");
                int orderCount = sc.nextInt();
                sc.nextLine();

                // 재주문
                if (reorder) {
                    for (String coff : orderList.keySet()) {
                        if (coff.equals(coffeeName)) { // 똑같은 커피를 주문했을 때
                            int addCount = orderList.get(coff).intValue() + orderCount;
                            // 주문리스트의 수량을 불러서 현재 수량과 더함
                            orderList.replace(coffeeName, addCount);
                        } else {
                            orderList.put(coffeeName, orderCount);
                            break;
                        }
                    }
                } else {
                    orderList.put(coffeeName, orderCount);
                }

                // 추가주문
                addOrder();
                customer.setCoffeeOrder(orderList);
                break end;
            } catch (Exception e) {
                System.out.println("잘못 입력하였습니다.");
                continue;
            }
        }
    }

    private void addOrder() {
        reorder = false;
        System.out.println("\n주문을 계속하시겠습니까?");
        System.out.println("예(Y) / 아니오(N)");
        String yesOrNo = sc.nextLine();
        if (yesOrNo.equalsIgnoreCase("y") || yesOrNo.equals("예")) {
            coffee.getMenu();
            reorder = true;
            order();
        } else if (yesOrNo.equalsIgnoreCase("n") || yesOrNo.equals("아니오")) {
            return;
        }
    }

    private void totalOrder(Customer customer) {
        int s = 1;
        int totalMoney = 0;
        int coffeePrice = 0;
        DecimalFormat f = new DecimalFormat("###,000원");
        String name = customer.getOrderName() + "번 ";
        StringBuffer message = new StringBuffer();
        message.append("\n\n ")
                .append("+----------------------------------------------------+\n ")
                .append("|                                                    | \n ")
                .append("|          " + name + "고객님의 주문 내역입니다         | " + "\n");

        for (Map.Entry<String, Integer> order : customer.getCoffeeOrder().entrySet()) {
            // coffeePrice = coffee.menu.get(order.getKey()) *
            // customer.getCoffeeOrder().get(order.getKey());
            String coffeeName = order.getKey(); // 커피 이름
            int orderCount = order.getValue(); // 주문한 커피 수량
            int coffeeUnitPrice = coffee.menu.get(coffeeName); // 커피 개당 가격
            coffeePrice = coffeeUnitPrice * orderCount; // 주문한 커피 가격
            totalMoney = totalMoney + coffeePrice;
            String pay = f.format(coffeePrice); // 가격 포맷팅
            message.append(String.format(" | [%d] %-20s : %2d잔  %7s     |\n", s, coffeeName, orderCount, pay));
            s++; // 리스트 인덱스 증가

        }
        message.append(" |                                                    |\n ")
                .append("+----------------------------------------------------+ \n")
                .append(" ============ 총 결제 금액은 " + f.format(totalMoney) + "입니다 ========== \n");
        System.out.println(message);
        payment(totalMoney);

    }

    // 고객의 잔액에서 총 주문 금액 차감하여 결제
    private void payment(int totalMoney) {
        System.out.println("\n결제를 도와드리겠습니다. 카드를 넣어주세요.");
        int payResult = customer.getMoney() - totalMoney;
        try {
            t.sleep(2500); // 2.5초 후 실행
            System.out.println("결제 중이빈다...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (payResult < 0) {
            System.out.println("잔액이 부족합니다. 확인 후 다시 주문");
        } else {
            customer.setMoney(payResult);
            System.out.println("결제가 완료되었ㅅ븐디ㅏ.");
            System.out.println("이용해 주셔서 감사합니다.");
            orderNum++; // 다음 고객 번호
        }

    }

    private void end() {
        int s = 1;
        StringBuffer message = new StringBuffer();
        message.append("\n\n ")
                .append("+----------------------------------------------------+\n ")
                .append("|                                                    | \n ")
                .append("|       " + customer.getOrderName() + " 고객님 주문하신 음료 나왔습니다       | " + "\n");
        System.out.print(message);
        for (Map.Entry<String, Integer> order : customer.getCoffeeOrder().entrySet()) {
            System.out.printf(" | [%d] %-20s : %2d잔  %7s      |\n", s, order.getKey(), order.getValue(), "");
            s++;
        }
        System.out.println(" |                                                    |");
        System.out.println(" +----------------------------------------------------+");
    }
}
