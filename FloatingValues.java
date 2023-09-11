//---------------------------------
//Program Name:CriticalThinkingMod#3
//Author:Michael C Krywanio
//Date: SEP 3 2023
//---------------------------------
//PsudoCode
//START
//  INPUT weeklyIncome
//  IF weeklyIncome < 500 THEN
//   taxRate = 10%
//  ELSE IF weeklyIncome >= 500 AND weeklyIncome < 1500 THEN
//    taxRate = 15%
//  ELSE IF weeklyIncome >= 1500 AND weeklyIncome < 2500 THEN
//    taxRate = 20%
//  ELSE
//    taxRate = 30%
//  END IF
//  taxWithheld = weeklyIncome * taxRate
//  OUTPUT taxWithheld
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