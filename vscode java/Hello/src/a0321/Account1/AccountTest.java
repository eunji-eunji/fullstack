package a0321.Account1;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();
        // acc.balance=1000;
        // System.out.println(acc.balance);
        acc.setBalance(1000);
        System.out.println(acc.getBalance());

    }
}

class Account {
    // 자신 외 모든 클래스의 접근을 거부한다.
    private int balance;
    //private으로 변수 선언하는 이유?

    // 클래스 밖에서 balance에 직접 접근할 수 없고, 메소드를 통해 접근해야 한다.
    // private으로 설정했을 때, 전구 모양 클릭하면 getter and setter method가 자동으로 만들어짐
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}