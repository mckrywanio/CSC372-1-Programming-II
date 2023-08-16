
//ask professor if she would like import scanner used or hard code

   

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