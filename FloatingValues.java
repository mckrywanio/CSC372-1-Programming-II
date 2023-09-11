//---------------------------------
//Program Name:CriticalThinkingMod#4
//Author:Michael C Krywanio
//Date: SEP 10 2023
//---------------------------------
//PsudoCode
//START

//Initialize count = 0
//Initialize total = 0.0
//Initialize maximum as a very small number
//Initialize minimum as a very large number

//WHILE count is less than 5 DO
//    Prompt the user to enter a floating-point value
//    Read the value from the user
//    Add value to total
//    IF value is greater than maximum THEN
//        set maximum to value
//    ENDIF
//    IF value is less than minimum THEN
//        set minimum to value
//    ENDIF
//    Increment count
//ENDWHILE

//Compute average as total divided by 5
//Compute interest as total multiplied by 0.20

//Print total, average, maximum, minimum, interest

//END
//-----------------------------------
//Program Inputs: Weekly Income
//Program Outputs: Your average weekly tax withholding is:
//-------------------------------------

import java.util.Scanner;

public class FloatingValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        double total = 0.0;
        double maximum = Double.MIN_VALUE; // A very small initial value
        double minimum = Double.MAX_VALUE; // A very large initial value
        System.out.print("This program will compute the max, min, average, total, and interst on total at 20%.");
        while (count < 5) {
            System.out.print("Enter a floating-point value (" + (5 - count) + " left): ");
            double value = scanner.nextDouble();
            total += value;

            if (value > maximum) {
                maximum = value;
            }
            if (value < minimum) {
                minimum = value;
            }
            
            count++;
        }

        double average = total / 5;
        double interest = total * 0.20;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Interest on total at 20%: " + interest);

        scanner.close();
    }
}