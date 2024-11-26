package ru.app.bank;

public class BankFacade {
    private final Account account;
    private final DepositService depositService;
    private final TransferService transferService;
    private final BalanceService balanceService;

    public BankFacade(double initialBalance) {
        this.account = new Account(initialBalance);
        this.depositService = new DepositService();
        this.transferService = new TransferService();
        this.balanceService = new BalanceService();
    }

    public void deposit(double amount) {
        depositService.deposit(account, amount);
        System.out.println("Счет пополнен на " + amount);
    }

    public void transfer(Account toAccount, double amount) {
        if (transferService.transfer(account, toAccount, amount)) {
            System.out.println("Переведено " + amount);
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    public void checkBalance() {
        System.out.println("Баланс: " + balanceService.checkBalance(account));
    }

    public Account getAccount() {
        return account;
    }
}
