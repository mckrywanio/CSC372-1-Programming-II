public class CheckingAccount extends BankAccount {
    private double interestRate;
    private static final double OVERDRAFT_FEE = 30.0;

    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
        super(firstName, lastName, accountID);
        this.interestRate = interestRate;
    }

    @Override
    public void withdrawal(double amount) {
        super.withdrawal(amount);
        if (getBalance() < 0) {
            processWithdrawal();
        }
    }

    public void processWithdrawal() {
        System.out.println("Overdraft! $30 fee accessed.");
        super.withdrawal(OVERDRAFT_FEE);
    }

    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}