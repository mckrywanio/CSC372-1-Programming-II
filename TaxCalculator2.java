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

public class TaxCalculator2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weekly income: ");
        double weeklyIncome = scanner.nextDouble();

        double taxWithheld = calculateTax(weeklyIncome);
        System.out.printf("Your average weekly tax withholding is: $%.2f%n", taxWithheld);

        scanner.close();
    }

    public static double calculateTax(double weeklyIncome) {
        double taxRate;

        if (weeklyIncome < 500) {
            taxRate = 0.10;
        } else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
            taxRate = 0.15;
        } else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        return weeklyIncome * taxRate;
    }
}