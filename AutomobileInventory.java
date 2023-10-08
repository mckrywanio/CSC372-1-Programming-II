import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.nio.file.*;
import java.io.*;

public class AutomobileInventory {

    public static void main(String[] args) {
        try {
            Automobile car = new Automobile("Toyota", "Camry", "Red", 2020, 20000);
            String[] info = car.listVehicleInfo();

            for (String data : info) {
                System.out.println(data);
            }

            System.out.println(car.removeVehicle());

            System.out.println(car.addNewVehicle("Honda", "Civic", "Blue", 2022, 1000));
            info = car.listVehicleInfo();
            for (String data : info) {
                System.out.println(data);
            }

            System.out.println(car.updateVehicleAttributes(null, "Accord", null, 0, 0));
            info = car.listVehicleInfo();
            for (String data : info) {
                System.out.println(data);
            }

            System.out.println("Do you want to print the information to a file (Y or N)?");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine().toUpperCase();
            scanner.close();

            if ("Y".equalsIgnoreCase(response)) {
                saveToFile(info);
                System.out.println("Data has been written to C:\\Temp\\Autos.txt");
            } else {
                System.out.println("Data will not be printed to a file.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void saveToFile(String[] data) throws IOException {
        Path path = Paths.get("C:\\Temp\\Autos.txt");
        Files.write(path, java.util.Arrays.asList(data), StandardCharsets.UTF_8);
    }
}