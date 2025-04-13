package bank_test;

import java.util.HashMap;
import java.util.Map;

//  계좌 관리 - 생성, 입금, 출금, 이체
public class BankService {
    // 계좌번호를 통해 모든 걸 처리하기 때문에 맵으로 계좌번호, 계좌정보 생성
    private final Map<String, Account> accounts = new HashMap<>();

    public Account createAccount(String name, String birth, String password, int initialDeposit) {
        if (initialDeposit < 1000)
            return null; // 초기 입금액이 1000원 미만이면 계좌 생성 불가
        String number = AccountNumberGenerate.generate(); // 랜덤한 계좌번호 생성
        while (accounts.containsKey(number)) {  // 같은 계좌번호가 있다면 재실행
            number = AccountNumberGenerate.generate();
        }
        Account acc = new Account(number, name, birth, password, initialDeposit);
        accounts.put(number, acc);  // 맵에 저장
        return acc;
    }

    // 계좌번호로 계좌 정보 찾아서 Account 반환
    public Account findAccount(String number) {
        return accounts.get(number);
    }

    // 계좌이체
    public boolean transfer(String from, String to, String password, int amount) {
        Account fromAcc = accounts.get(from); // 보내는 계좌
        Account toAcc = accounts.get(to);   // 받는 계좌
        // 받는 계좌, 보내는 계좌가 비어 있거나 비밀번호가 틀리면 false
        if (fromAcc == null || toAcc == null || !fromAcc.checkPassword(password))
            return false;
        // 출금이 불가능하면 false, 가능하면 보내는 계좌에서 출금 후 true
        if (!fromAcc.withdraw(amount))
            return false;
        toAcc.deposit(amount);  // 받는 계좌에 입금
        return true;
    }

    // 계좌 삭제 - adminService를 통해 호출
    protected boolean deleteAccount(String number) {
        // 계좌번호가 존재하면 계좌를 삭제하고 해당 계좌 반환. -> true
        // 계좌가 없으면 null 반환. -> false
        return accounts.remove(number) != null;
    }
}
