package bank_test;

import java.time.Instant;

public class Account {
    private long account;
    private String name;
    private String birth;
    private int password;
    private int balance;
    
    public Account(String name, String birth, int password, int balance) {
        account = Instant.now().getEpochSecond();
        this.name = name;
        this.birth = birth;
        this.password = password;
        this.balance = balance;
    }

    public long getAccount() {
        return account;
    }
    public void setAccount(long account) {
        this.account = account;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBirth() {
        return birth;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
