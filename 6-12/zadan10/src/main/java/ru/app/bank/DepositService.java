package ru.app.bank;

public class DepositService {
    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }
}
