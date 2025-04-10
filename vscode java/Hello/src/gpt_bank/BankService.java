package gpt_bank;

import java.util.HashMap;
import java.util.Map;

public class BankService {
     private final Map<String, Account> accounts = new HashMap<>();

    public Account createAccount(String name, String birth, String password, int initialDeposit) {
        if (initialDeposit < 1000) return null;
        String number = AccountNumberGenerator.generate();
        while (accounts.containsKey(number)) {
            number = AccountNumberGenerator.generate();
        }
        Account acc = new Account(number, name, birth, password, initialDeposit);
        accounts.put(number, acc);
        return acc;
    }

    public Account findAccount(String number) {
        return accounts.get(number);
    }

    public boolean transfer(String from, String to, String password, int amount) {
        Account a = accounts.get(from);
        Account b = accounts.get(to);
        if (a == null || b == null || !a.checkPassword(password)) return false;
        if (!a.withdraw(amount)) return false;
        b.deposit(amount);
        return true;
    }

    public boolean deleteAccount(String number) {
        return accounts.remove(number) != null;
    }
}
