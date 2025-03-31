package a0331.coffee;

import java.util.*;

public class Customer {
    private int orderNum;
    private int money;
    private Map<String, Integer> coffeeOrder;

    public Customer(int orderNum) {
        this.orderNum = orderNum;
        this.money = 20000; // 고객이 가지고 있는 돈 초기값
    }

    public Map<String, Integer> getCoffeeOrder() {
        return coffeeOrder;
    }

    public void setCoffeeOrder(Map<String, Integer> coffeeOrder) {
        this.coffeeOrder = coffeeOrder;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getOrderName() {  //고객1, 고객2 ,...
        return "고객 " + orderNum;
    }

}
