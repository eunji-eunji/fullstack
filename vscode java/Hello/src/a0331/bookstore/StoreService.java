package a0331.bookstore;

import java.text.DecimalFormat;
import java.util.*;

public class StoreService {
    Map<String, Integer> orderList; // 주문내역
    private boolean reorder = false; // 재주문 여부
    // private int orderNum=1; //고객번호

    Book book = Book.getInstance();
    Customer customer;
    Thread t = new Thread();
    Scanner sc = new Scanner(System.in);

    public StoreService() { // 기본생성자 호출할 때 주문내역 맵 생성
        orderList = new LinkedHashMap<>();
    }

    // 이 함수만 main에서 호출
    public void start() {
        System.out.println("\n어서오세요. 서점입니다.");
        customer = new Customer(); // 30000
        book.getMenu(); // 책목록, 책가격, 서점메뉴판 입력됨
        order(); // 책 주문
        totalOrder(customer); // 전체 주문
        try {
            System.out.println("구매해 주셔서 감사합니다.");
            t.sleep(2000);
            end();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 주문
    private void order() {
        System.out.println("\n취소를 원하시면 0번을 눌러주세요.");
        end: while (true) {
            try {
                System.out.print("\n원하시는 책의 번호를 입력하세요.");
                String choiceString = sc.nextLine();
                int choice = Integer.parseInt(choiceString.substring(0, 1));

                if (choice == 0) {
                    System.out.println("주문을 취소합니다.");
                    System.exit(0);
                }

                sc.nextLine();
                String orderBookName = book.bookList.get(choice - 1);
                // 입력한 책의 이름 저장

                System.out.println("선택하신 책은 " + orderBookName + "입니다. 몇 권 구매하시겠습니까?");
                int orderCount = sc.nextInt();
                sc.nextLine();

                // 추가 주문 했는지 안 했는지
                if (reorder) {
                    for (String b : orderList.keySet()) {
                        if (b.equals(orderBookName)) { // 추가 주문 한 뒤 위에 주문한 책과 같은 책을 주문했을 때
                            int addCount = orderList.get(b).intValue() + orderCount;
                            // orderList의 key(b)의 값 + 추가 주문한 수량
                            orderList.replace(orderBookName, addCount);
                        } else {
                            orderList.put(orderBookName, orderCount);
                            break;
                        }
                    }
                } else {
                    orderList.put(orderBookName, orderCount);
                    // 처음엔 reorder가 false이므로 입력한 책과 수량을 orderList에 먼저 저장함
                }

                // 추가 주문
                addOrder();
                customer.setBookOrder(orderList);
                // 주문 내역은 customer의 orderList에 저장
                break end;
            } catch (Exception e) {
                System.out.println("잘못 입력하였습니다.");
                continue;
            }
        }
    }

    // 추가 주문
    private void addOrder() {
        reorder = false; // 재주문이 true일 수 있으니 false로 초기화 해줌
        System.out.println("\n주문을 꼐속하시겠습니까?");
        System.out.println("예(Y) / 아니오(N)");
        String YorN = sc.nextLine();
        if (YorN.equalsIgnoreCase("y") || YorN.equals("예")) {
            book.getMenu(); // 서점 메뉴판 보여줌
            order(); // 책 주문
            reorder = true;
        } else if (YorN.equalsIgnoreCase("n") || YorN.equals("아니오")) {
            return;
        }
    }

    // 전체 주문
    private void totalOrder(Customer customer) {
        int s = 1;
        double totalPrice = 0; // 전체 금액
        int bookPrice = 0; // 각 리스트의 책 가격 합계
        DecimalFormat f = new DecimalFormat("###,000원");
        StringBuffer message = new StringBuffer();
        message.append("\n\n ")
                .append("+----------------------------------------------------+\n ")
                .append("|                                                    | \n ")
                .append("|                         주문 내역                   | " + "\n");

        for (Map.Entry<String, Integer> entry : customer.getBookOrder().entrySet()) {
            String name = s + "번 ";
            message.append(name + " 주문");
            String bookName = entry.getKey(); // 첫번째 주문 책 이름
            // entry = getBookOrder
            int bookCount = entry.getValue(); // 첫번째 주문한 책 개수
            bookPrice = book.menu.get(bookName) * bookCount; // 첫번째 주문 금액
            totalPrice = totalPrice + bookPrice;
            String pay = f.format(bookPrice);
            message.append(String.format(" | [%d] %-20s : %2d권  %7s     |\n", s, bookName, bookCount, pay));
            s++;
        }
        message.append(" |                                                    |\n ")
                .append("+----------------------------------------------------+ \n")
                .append(" ============ 총 주문 금액은 " + f.format(totalPrice) + "입니다 ========== \n");

        // 만원 이상 할인
        if (totalPrice >= 10000) {
            message.append("만 원 이상 구매 시 10% 할인됩니다.");
            totalPrice = totalPrice * 0.9;
            message.append(" ============ 총 결제 금액은 " + f.format(totalPrice) + "입니다 ========== \n");
        } else {
            message.append(" ============ 총 결제 금액은 " + f.format(totalPrice) + "입니다 ========== \n");
        }
        System.out.println(message);
        payment(totalPrice);

    }

    private void payment(double totalPrice) {
        System.out.println("\n결제를 도와드리겠습니다. 카드를 넣어주세요.");
        int payResult = customer.getMoney() - (int) totalPrice;
        try {
            t.sleep(2500);
            System.out.println("결제 중...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(payResult<0){
            System.out.println("잔액이 부족합니다.");
            
        }else{
            customer.setMoney(payResult);
            System.out.println("결제가 완료되었습니다.");
            System.out.println("이용해 주셔서 감사합니다.");
            
        }
    }


    private void end() {
        int s = 1;
        StringBuffer message = new StringBuffer();
        message.append("\n\n ")
                .append("+----------------------------------------------------+\n ")
                .append("|                                                    | \n ")
                .append("|       " + s+ "번 고객님 구매내역입니다.              | " + "\n");
        System.out.print(message);
        for (Map.Entry<String, Integer> order : customer.getBookOrder().entrySet()) {
            System.out.printf(" | [%d] %-20s : %2d권  %7s      |\n", s, order.getKey(), order.getValue(), "");
            s++;
        }
        System.out.println(" |                                                    |");
        System.out.println(" +----------------------------------------------------+");
    }

}
