//---------------------------------
//Program Name:CriticalThinkingMod#1
//Author:Michael C Krywanio
//Date: OCT 12 2023
//---------------------------------
// CLASS CheckingAccount EXTENDS BankAccount:

//     Fields
//     DECLARE interestRate AS DOUBLE
//     DECLARE overdraftFee AS DOUBLE = 30

//     Methods
//     FUNCTION processWithdrawal(amount AS DOUBLE):
//         IF balance - amount < 0 THEN
//             SUBTRACT overdraftFee FROM balance
//             PRINT "Overdraft fee charged!"
//         END IF
//         CALL withdrawal(amount) FROM SUPERCLASS

//     FUNCTION displayAccount():
//         PRINT all superclass attributes
//         PRINT interest rate

// END CLASS
//-------------------------------------
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