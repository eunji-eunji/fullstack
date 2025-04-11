package bank_test;

import java.util.HashMap;
import java.util.Map;

import gpt_bank.AccountNumberGenerator;

public class BankService {
    private final Map<String, Account> accounts = new HashMap<>();

    public Account createAccount(String name, String birth, String password, int initialDeposit) {
        if (initialDeposit < 1000)
            return null; // 초기 입금액이 1000원 미만이면 계좌 생성 불가
        String number = AccountNumberGenerator.generate(); // 계좌 생성
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
        // 받는계좌, 보내는계좌가 비어 있거나 비밀번호가 틀리면 false
        if (a == null || b == null || !a.checkPassword(password))
            return false;
        //
        if (!a.withdraw(amount))
            return false;
        b.deposit(amount);
        return true;
    }

    public boolean deleteAccount(String number) {
        // 계좌번호가 존재하면 계좌를 삭제하고 해당 계좌 반환.
        // 계좌가 없으면 null 반환.
        return accounts.remove(number) != null;
    }
}
