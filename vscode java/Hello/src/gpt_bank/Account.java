package gpt_bank;

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

    public String getAccountNumber() { return accountNumber; }
    public int getBalance() { return balance; }
    public String getName() { return name; }

    public boolean checkPassword(String pw) {
        return password.equals(pw);
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if (amount > balance) return false;
        balance -= amount;
        return true;
    }

    public void updateInfo(String name, String birthDate, String password) {
        this.name = name;
        this.birthDate = birthDate;
        this.password = password;
    }
}
