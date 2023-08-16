





/////////////////////////////////
//PsudoCode
//Start
//1. Import scanner inital

//2. Print to user Please enter first name:
//3. Set String firstName to user input of firstName

//4. Print to user Please enter last name: 
//5. Set Strint lastName to user input of lastName

//6. Print to user Please enter Address:
//7. Set String streetAddress to user input of Address

//8. Print to user Please enter City:
//9. Set String city to user input of City

//10. Print to user Please Enter Zip Code:
//11. Set String zipCode to user input of Zip Code

//12. end scanner

//13. Print Users Information:
//14. Print First Name: firstName
//15. Print Last Name: lastName
//16. Print Address: streetAddress
//17. Print City: city
//18. Print Zip Code: zipCode
//End

import java.util.Scanner;

public class UserINFO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Please Enter Last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Please Enter Address: ");
        String streetAddress = scanner.nextLine();

        System.out.print("Please Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Please Enter Zip Code: ");
        String zipCode = scanner.nextLine();

        scanner.close();

        System.out.println("\nUsers Information: ");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);
    }
}