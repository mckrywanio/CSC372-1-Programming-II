//---------------------------------
//Program Name:CriticalThinkingMod#1
//Author:Michael C Krywanio
//Date: OCT 12 2023
//---------------------------------
// CLASS BankAccount:

//     Fields
//     DECLARE firstName AS STRING
//     DECLARE lastName AS STRING
//     DECLARE accountID AS INTEGER
//     DECLARE balance AS DOUBLE

//     Constructor
//     CONSTRUCTOR():
//         SET balance TO 0

//     Methods
//     FUNCTION deposit(amount AS DOUBLE):
//         ADD amount TO balance

//     FUNCTION withdrawal(amount AS DOUBLE):
//         SUBTRACT amount FROM balance

//     FUNCTION setFirstName(name AS STRING):
//         SET firstName TO name

//     FUNCTION getFirstName() AS STRING:
//         RETURN firstName

//     FUNCTION setLastName(name AS STRING):
//         SET lastName TO name

//     FUNCTION getLastName() AS STRING:
//         RETURN lastName

//     FUNCTION setAccountID(id AS INTEGER):
//         SET accountID TO id

//     FUNCTION getAccountID() AS INTEGER:
//         RETURN accountID

//     FUNCTION getBalance() AS DOUBLE:
//         RETURN balance

//     FUNCTION accountSummary():
//         PRINT all account information

// END CLASS

//-------------------------------------

public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    public BankAccount(String firstName, String lastName, int accountID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    // setters and getters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void accountSummary() {
        System.out.println("Account ID: " + accountID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Balance: $" + balance);
    }
}