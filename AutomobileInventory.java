//---------------------------------
//Program Name:Programming 1 Portfolio Project
//Author:Michael C Krywanio
//Date: 08 OCT 2023
//---------------------------------
//PsudoCode
// CLASS AutomobileInventory:

//     PRIVATE:
//         LIST automobiles = new LIST of Automobile

//     PUBLIC:

//     METHOD main():
//         LOOP forever (until user decides to exit):
//             DISPLAY "Choose option: Add, List, Update, Remove, Exit"
//             READ user_choice
//             IF user_choice is "Add":
//                 CALL addVehicle()
//             ELSE IF user_choice is "List":
//                 CALL listVehicleInformation()
//             ELSE IF user_choice is "Update":
//                 CALL updateVehicle()
//             ELSE IF user_choice is "Remove":
//                 CALL removeVehicle()
//             ELSE IF user_choice is "Exit":
//                 ASK user if they want to save to a file
//                 IF user wants to save:
//                     CALL saveAutosToFile()
//                 END the loop
//             END IF
//         END LOOP
//     END METHOD

//     METHOD addVehicle():
//         TRY:
//             DISPLAY "Enter vehicle details: make, model, color, year, mileage"
//             READ vehicle details
//             CREATE new Automobile with read details
//             ADD new Automobile to the automobiles list
//             RETURN success message
//         CATCH any error:
//             RETURN failure message with error details
//     END METHOD

//     METHOD listVehicleInformation() -> LIST:
//         TRY:
//             FOR each automobile in automobiles:
//                 DISPLAY automobile details
//             END FOR
//         CATCH any error:
//             RETURN failure message with error details
//     END METHOD

//     METHOD updateVehicle():
//         TRY:
//             DISPLAY "Enter index of the vehicle to update"
//             READ index
//             DISPLAY current details of selected automobile
//             DISPLAY "Enter new details (leave blank to keep current)"
//             READ new details
//             UPDATE the automobile with new details
//             RETURN success message
//         CATCH any error:
//             RETURN failure message with error details
//     END METHOD

//     METHOD removeVehicle():
//         TRY:
//             DISPLAY "Enter index of the vehicle to remove"
//             READ index
//             REMOVE automobile at given index
//             RETURN success message
//         CATCH any error:
//             RETURN failure message with error details
//     END METHOD

//     METHOD saveAutosToFile():
//         TRY:
//             FOR each automobile in automobiles:
//                 WRITE automobile details to file "C:\Temp\Autos.txt"
//             END FOR
//             RETURN success message
//         CATCH any error:
//             RETURN failure message with error details
//     END METHOD

// END CLASS
//END MAIN

//-------------------------------------
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class AutomobileInventory {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String filePath = "C:\\Temp\\Autos.txt";
    private static ArrayList<Automobile> autosList = new ArrayList<>();

    public static void main(String[] args) {
        loadAutosFromFile();

        boolean continueRunning = true;
        while (continueRunning) {
            System.out.println("\nVehicle Inventory Menu:");
            System.out.println("1. Add new vehicle");
            System.out.println("2. Update vehicle information");
            System.out.println("3. Remove vehicle");
            System.out.println("4. List vehicle information");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    updateVehicle();
                    break;
                case 3:
                    removeVehicle();
                    break;
                case 4:
                    listVehicleInformation();
                    break;
                case 5:
                    continueRunning = false;
                    promptToSave();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void loadAutosFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    Automobile auto = new Automobile(parts[0], parts[1], parts[2], Integer.parseInt(parts[3]), Integer.parseInt(parts[4]));
                    autosList.add(auto);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void saveAutosToFile() {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (Automobile auto : autosList) {
                writer.write(auto.toFileString() + "\n");
            }
            System.out.println("Automobiles saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    private static void promptToSave() {
        System.out.print("\nWould you like to save the information to a file (Y or N)? ");
        String response = scanner.nextLine().trim().toUpperCase();

        if ("Y".equals(response)) {
            saveAutosToFile();
        } else if ("N".equals(response)) {
            System.out.println("Data will not be saved.");
        } else {
            System.out.println("Invalid response. Data will not be saved.");
        }
    }

    private static void addVehicle() {
        try {
            System.out.print("Enter make: ");
            String make = scanner.nextLine();
            System.out.print("Enter model: ");
            String model = scanner.nextLine();
            System.out.print("Enter color: ");
            String color = scanner.nextLine();
            System.out.print("Enter year: ");
            int year = scanner.nextInt();
            System.out.print("Enter mileage: ");
            int mileage = scanner.nextInt();
            scanner.nextLine();  // Consume leftover newline

            Automobile newAuto = new Automobile(make, model, color, year, mileage);
            autosList.add(newAuto);
            System.out.println("Vehicle added successfully!");
        } catch (Exception e) {
            System.out.println("Error adding vehicle: " + e.getMessage());
        } 
    }

    private static void updateVehicle() {
        try {
            listVehicleInformation();
            System.out.print("Enter the number of the vehicle to update: ");
            int index = scanner.nextInt() - 1;
            scanner.nextLine();

            if (index >= 0 && index < autosList.size()) {
                System.out.print("Enter new make (leave empty to keep current): ");
                String make = scanner.nextLine();
                System.out.print("Enter new model (leave empty to keep current): ");
                String model = scanner.nextLine();
                System.out.print("Enter new color (leave empty to keep current): ");
                String color = scanner.nextLine();
                System.out.print("Enter new year (leave empty to keep current): ");
                String yearStr = scanner.nextLine();
                System.out.print("Enter new mileage (leave empty to keep current): ");
                String mileageStr = scanner.nextLine();

                if (!make.isEmpty()) autosList.get(index).setMake(make);
                if (!model.isEmpty()) autosList.get(index).setModel(model);
                if (!color.isEmpty()) autosList.get(index).setColor(color);
                if (!yearStr.isEmpty()) autosList.get(index).setYear(Integer.parseInt(yearStr));
                if (!mileageStr.isEmpty()) autosList.get(index).setMileage(Integer.parseInt(mileageStr));

                System.out.println("Vehicle updated successfully!");
            } else {
                System.out.println("Invalid vehicle number!");
            }
        } catch (Exception e) {
            System.out.println("Error updating vehicle: " + e.getMessage());
        }
    }
   
    private static void removeVehicle() {
        try {
            listVehicleInformation();
            System.out.print("Enter the number of the vehicle to remove: ");
            int index = scanner.nextInt() - 1;
            scanner.nextLine();

            if (index >= 0 && index < autosList.size()) {
                autosList.remove(index);
                System.out.println("Vehicle removed successfully!");
            } else {
                System.out.println("Invalid vehicle number!");
            }
        } catch (Exception e) {
            System.out.println("Error removing vehicle: " + e.getMessage());
        }
}

    private static void listVehicleInformation() {
        try {
            if (autosList.isEmpty()) {
                System.out.println("No vehicles in the inventory.");
                return;
            }
            int counter = 1;
            for (Automobile auto : autosList) {
                System.out.println(counter++ + ". " + auto);
            }
        } catch (Exception e) {
            System.out.println("Error listing vehicles: " + e.getMessage());
        }
    }
}