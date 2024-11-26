package ru.app;

import ru.app.bank.Account;
import ru.app.bank.BankFacade;

public class Main {
    public static void main(String[] args) {
        BankFacade myBank = new BankFacade(1000);
        Account otherAccount = new Account(500);

        myBank.checkBalance();
        myBank.deposit(200);
        myBank.checkBalance();

        myBank.transfer(otherAccount, 800);
        myBank.checkBalance();

        myBank.transfer(otherAccount, 500);
        myBank.checkBalance();
    }
}
