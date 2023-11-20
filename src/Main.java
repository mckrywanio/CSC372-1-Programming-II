//----------------------------------------------------
//Program Name: CriticalThinkingMod#6 Option 2
//Author: Michael C Krywanio
//Date: Nov 19 2023
//----------------------------------------------------
//Program Name: Main.java
//Description: 4 programs that will sort inputed student information into a array; rollnum, name, address.
//----------------------------------------------------
//Start
//
//Class Main
//    Method main
//        Initialize scanner for input
//        Create an empty ArrayList of Student

//        Repeat 10 times
//            Prompt user for student details
//            Validate roll number (numeric and within range)
//            Read name and address
//            Create new Student and add to ArrayList

//        Sort the ArrayList using MergeSort
//        Print sorted list of students
//        Close scanner
//End Class
//
//End
//-----------------------------------------------------
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int rollNo = 0;
            String name, address;

            while (true) {
                try {
                    System.out.println("Enter details for student " + (i + 1) + ":");

                    System.out.print("Roll Number (1-10): ");
                    rollNo = scanner.nextInt();
                    scanner.nextLine(); // Consume the remaining newline

                    if (rollNo < 1 || rollNo > 10) {
                        System.out.println("Invalid roll number. It should be between 1 and 10.");
                        continue;
                    }

                    System.out.print("Name: ");
                    name = scanner.nextLine();

                    System.out.print("Address: ");
                    address = scanner.nextLine();

                    break; // Break out of the loop if everything is valid
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a numeric roll number.");
                    scanner.nextLine(); // Consume the invalid input
                }
            }

            students.add(new Student(rollNo, name, address));
        }

        // Sorting the students by roll number
        MergeSort.sort(students, new StudentComparator());

        // Print sorted students
        System.out.println("\nSorted Students:");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}