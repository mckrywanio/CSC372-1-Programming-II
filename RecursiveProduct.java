//----------------------------------------------------
//Program Name: CriticalThinkingMod#5 Option 1
//Author: Michael C Krywanio
//Date: Nov 12 2023
//----------------------------------------------------
//Program Name: RecursiveProduct.java
//Description: Input 5 numbers and display the product using recursion.
//----------------------------------------------------
// Start

// Import the Scanner class for user input

// Define a class named RecursiveProduct
    // Define a recursive method to calculate the product of an array of numbers
        // Base case: if the index is at the last number, return the last number
        // Recursive case: multiply the current number by the result of the recursive call

    // Main method
        // Create a Scanner object for reading user input
        // Declare an array to store five numbers

        // Loop to read five numbers from the user
            // Prompt the user to enter a number
            // Read the number from the user

        // Close the Scanner object

        // Calculate the product using the recursive method
        // Display the product

// End
//-----------------------------------------------------
import java.util.Scanner;

public class RecursiveProduct {

    // Recursive method to calculate product of an array of numbers
    public static int productOfNumbers(int[] numbers, int index) {
        // Base case: if index is at the last number, return the last number
        if (index == numbers.length - 1) {
            return numbers[index];
        }
        // Recursive call: multiply current number with the result of product of the rest
        return numbers[index] * productOfNumbers(numbers, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Reading five numbers from the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        // Calculating the product using recursion
        int product = productOfNumbers(numbers, 0);
        System.out.println("The product of the entered numbers is: " + product);
    }
}