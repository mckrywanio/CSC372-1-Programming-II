//---------------------------------
// Program Name:UserINFO
//Author:Michael C Krywanio
//Date: Aug 20 2023
//---------------------------------
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
//-----------------------------------
//Program Inputs: firstName, LastName, streetAddress, city, zipCode
//Program Outputs: Please Enter first name:
// Please Enter last Name:
// Please Enter Address:
// Please Enter City:
// Please Enter Zip Code:
//
// Users Information:
// First Name: firstName
// Last Name: lastName
// Address: streetAddress
// City: city
// Zip Code: zipCode
//-------------------------------------
import java.util.Scanner;

// Scanner imported so user can input information.
public class UserINFO {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Please Enter first name: ");
        String firstName = scnr.nextLine();

        System.out.print("Please Enter Last name: ");
        String lastName = scnr.nextLine();

        System.out.print("Please Enter Address: ");
        String streetAddress = scnr.nextLine();

        System.out.print("Please Enter City: ");
        String city = scnr.nextLine();

        System.out.print("Please Enter Zip Code: ");
        String zipCode = scnr.nextLine();
// Once all the information has been entered you close the scanner class and proceed to output information.
        scnr.close();
// Output of inputed information
        System.out.println("\nUsers Information: ");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);
    }
}