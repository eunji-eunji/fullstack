package gpt_bank;

public class AdminService {
    private final BankService bankService;

    public AdminService(BankService bankService) {
        this.bankService = bankService;
    }

    public boolean delete(String accNum) {
        return bankService.deleteAccount(accNum);
    }

    public boolean update(String accNum, String name, String birth, String pw) {
        Account a = bankService.findAccount(accNum);
        if (a == null) return false;
        a.updateInfo(name, birth, pw);
        return true;
    }
}
