//----------------------------------------------------
//Program Name: Module 8: Portfolio Project
//Author: Michael C Krywanio
//Date: Dec 3 2023
//----------------------------------------------------
//Program Name: StudentManagementSystem.java
//Description: Java program using a loop to prompt user for student data including NAME, ADDRESS, and GPA.
//----------------------------------------------------
//Program StudentManagementSystem

//    Declare a LinkedList of Student objects

//    Start a loop
//        Prompt the user for the student's name
//        If the input is "exit", exit the loop
//        Prompt for the student's address
//        Initialize a variable for GPA
//        Start a loop for GPA input
//            Prompt for the student's GPA
//            Try to parse the GPA as a double
//            If parsing is successful, break the loop
//            Otherwise, inform the user of invalid input and continue the loop
//        End loop

//        Create a new Student object with the provided name, address, and GPA
//        Add the Student object to the LinkedList
//    End loop

//    Sort the LinkedList of Students by name

//    Try to open a file "students.txt" for writing
//        For each Student in the LinkedList
//            Write the Student's details to the file
//        End loop
//        Inform the user that the data is written to the file
//    Catch any file writing exceptions and print an error message

//End Program

//Class StudentsInfo
//    Private fields: name, address, GPA
//    Constructor to initialize the fields
//    Override compareTo method to compare Students by name for sorting
//    Method toString to return a string representation of the Student
//End Class

//-----------------------------------------------------
import java.util.*;
import java.io.*;

public class StudentManagementSystem {
    public static void main(String[] args) {
        List<StudentsInfo> students = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter student name (or 'exit' to finish):");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter student address:");
            String address = scanner.nextLine();

            double gpa = 0;
            boolean validGpa;
            do {
                System.out.println("Enter student GPA:");
                try {
                    gpa = Double.parseDouble(scanner.nextLine());
                    validGpa = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid GPA. Please enter a valid number.");
                    validGpa = false;
                }
            } while (!validGpa);

            StudentsInfo student = new StudentsInfo(name, address, gpa);
            students.add(student);
        }

        Collections.sort(students);

        try (PrintWriter writer = new PrintWriter("students.txt")) {
            for (StudentsInfo s : students) { // Changed Student to StudentsInfo
                writer.println(s);
            }
            System.out.println("Student data written to students.txt");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        scanner.close();
    }
}

class StudentsInfo implements Comparable<StudentsInfo> {
    private String name;
    private String address;
    private double gpa;

    // Constructor
    public StudentsInfo(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    // Override compareTo method for sorting
    @Override
    public int compareTo(StudentsInfo other) {
        return this.name.compareTo(other.name);
    }

    // toString method for output
    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", GPA: " + gpa;
    }
}