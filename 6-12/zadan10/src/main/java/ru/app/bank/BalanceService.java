package ru.app.bank;

public class BalanceService {
    public double checkBalance(Account account) {
        return account.getBalance();
    }
}
