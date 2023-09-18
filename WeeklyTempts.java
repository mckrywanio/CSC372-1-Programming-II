//---------------------------------
//Program Name:CriticalThinkingMod#5
//Author:Michael C Krywanio
//Date: SEP 17 2023
//---------------------------------
//PsudoCode
//Initialize an ArrayList called 'days'
//Initialize an ArrayList called 'temperatures'

//Function populateDays:
//    Add "monday" to 'days'
//    Add "tuesday" to 'days'
//    Add "wednesday" to 'days'
//    Add "thursday" to 'days'
//    Add "friday" to 'days'
//    Add "saturday" to 'days'
//    Add "sunday" to 'days'

//Function printWeeklyData:
//    Initialize a variable 'total' to 0
//    FOR each 'day' in 'days':
//        PRINT capitalized 'day' and its corresponding temperature from 'temperatures'
//        Add the temperature to 'total'
//    Calculate 'weeklyAvg' as 'total' divided by the size of 'days'
//    PRINT "Weekly Average:" and 'weeklyAvg'

//START MAIN

//CALL populateDays

//FOR each 'day' in 'days':
//    PROMPT user for temperature for 'day'
//    STORE the user's temperature in 'temperatures'

//WHILE true:
//    PROMPT user for a day or 'week' or 'exit'
//    Convert user input to lowercase and store in 'input'

//    IF 'input' is "exit":
//        BREAK
//    ELSE IF 'input' is "week":
//        CALL printWeeklyData
//    ELSE IF 'input' is in 'days':
//        FIND the index of 'input' in 'days'
//        PRINT 'input' and its corresponding temperature from 'temperatures'
//    ELSE:
//        PRINT "Invalid input. Please try again."

//END MAIN
//-----------------------------------
//Program Inputs: 5 tempuratures corisponding to the day of the week
//Program Outputs: 
//Enter the average temperature for (Day)
//Enter day of the week (Monday through Sunday) or 'Week' to get weekly data. Type 'exit' to stop:
// Day or week - temp°F
//-------------------------------------
import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTempts {
    
    private static ArrayList<String> days = new ArrayList<>();
    private static ArrayList<Double> temperatures = new ArrayList<>();

    public static void main(String[] args) {
        populateDays();
        
        Scanner scanner = new Scanner(System.in);
        for (String day : days) {
            System.out.println("Enter the average temperature for " + day + ":");
            double temp = scanner.nextDouble();
            temperatures.add(temp);
        }
        
        while (true) {
            System.out.println("\nEnter the day of the week (monday through sunday) for the average temp of that day; or 'week' to get the average temp for each day and the average temp for the entire week. Type 'exit' to stop:");
            String input = scanner.next().toLowerCase();
            
            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.equalsIgnoreCase("week")) {
                printWeeklyData();
            } else if (days.contains(input)) {
                int index = days.indexOf(input);
                System.out.println(input + " - " + temperatures.get(index) + "°F");
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
        
        scanner.close();
    }

    private static void populateDays() {
        days.add("monday");
        days.add("tuesday");
        days.add("wednesday");
        days.add("thursday");
        days.add("friday");
        days.add("saturday");
        days.add("sunday");
    }

    private static void printWeeklyData() {
        double total = 0;
        for (int i = 0; i < days.size(); i++) {
            System.out.println(Character.toUpperCase(days.get(i).charAt(0)) + days.get(i).substring(1) + " - " + temperatures.get(i) + "°F");
            total += temperatures.get(i);
        }
        
        double weeklyAvg = total / days.size();
        System.out.println("Weekly Average: " + weeklyAvg + "°F");
    }
}