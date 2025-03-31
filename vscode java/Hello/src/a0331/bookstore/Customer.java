package a0331.bookstore;

import java.util.Map;

public class Customer {
    // private int orderNum; // 고객 번호 - 고객1, 고객2, ...
    private int money; // 고객 잔액
    private Map<String, Integer> bookOrder; // 주문한 책과 수량

    public Customer() {
        // this.orderNum = orderNum;
        this.money = 30000;
    }

    // public int getOrderNum() {
    //     return orderNum;
    // }

    // public void setOrderNum(int orderNum) {
    //     this.orderNum = orderNum;
    // }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Map<String, Integer> getBookOrder() {
        return bookOrder;
    }

    public void setBookOrder(Map<String, Integer> bookOrder) {
        this.bookOrder = bookOrder;
    }

    // public String getOrderName() {
    //     return "고객" + orderNum;
    // }

}
