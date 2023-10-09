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