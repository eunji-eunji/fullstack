package bank_test;

public class Account {
    private final String accountNumber;
    private String name;
    private String birthDate;
    private String password;
    private int balance;

    public Account(String accountNumber, String name, String birthDate, String password, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.birthDate = birthDate;
        this.password = password;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // 비밀번호 확인
    public boolean checkPassword(String pw) {
        return password.equals(pw);
    }

    // 입금
    public void deposit(int amount) {
        balance += amount;
    }

    // 출금
    public boolean withdraw(int amount) {
        if (amount > balance)
            return false; // 계좌에 돈 없으면 출금 불가
        balance -= amount;
        return true;
    }

    // 계좌 정보 수정
    public void updateInfo(String name, String birthDate, String password) {
        this.name = name;
        this.birthDate = birthDate;
        this.password = password;
    }

}
