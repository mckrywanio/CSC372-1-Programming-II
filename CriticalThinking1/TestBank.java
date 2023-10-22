//---------------------------------
//Program Name:CriticalThinkingMod#1
//Author:Michael C Krywanio
//Date: OCT 12 2023
//---------------------------------
// CLASS TestBank:

//     FUNCTION main():
//         CREATE a new checking account
//         DECLARE account AS NEW CheckingAccount()

//         Set account details
//         CALL account.setFirstName("John")
//         CALL account.setLastName("Doe")
//         CALL account.setAccountID(123456)

//         Deposit money
//         CALL account.deposit(500)

//         Withdraw money
//         CALL account.processWithdrawal(600)

//         Display account details
//         CALL account.displayAccount()

// END CLASS
//-------------------------------------
import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter account ID: ");
        int accountID = scanner.nextInt();

        System.out.print("Enter interest rate (e.g., 1.5 for 1.5%): ");
        double interestRate = scanner.nextDouble();

        CheckingAccount ca = new CheckingAccount(firstName, lastName, accountID, interestRate);

        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        ca.deposit(depositAmount);
        ca.displayAccount();

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        ca.withdrawal(withdrawalAmount);
        ca.displayAccount();

        scanner.close();
    }
}