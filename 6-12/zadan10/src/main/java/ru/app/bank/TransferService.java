package ru.app.bank;

public class TransferService {
    public boolean transfer(Account fromAccount, Account toAccount, double amount) {
        if (fromAccount.withdraw(amount)) {
            toAccount.deposit(amount);
            return true;
        }
        return false;
    }
}
