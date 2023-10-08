public class Automobile {

    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    public Automobile() {
        // default constructor
    }

    public Automobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    public String addNewVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle added successfully!";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    public String[] listVehicleInfo() {
        try {
            return new String[] {make, model, color, String.valueOf(year), String.valueOf(mileage)};
        } catch (Exception e) {
            return new String[] {"Error: " + e.getMessage()};
        }
    }

    public String removeVehicle() {
        try {
            make = null;
            model = null;
            color = null;
            year = 0;
            mileage = 0;
            return "Vehicle removed successfully!";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    public String updateVehicleAttributes(String make, String model, String color, int year, int mileage) {
        try {
            if (make != null) this.make = make;
            if (model != null) this.model = model;
            if (color != null) this.color = color;
            if (year > 0) this.year = year;
            if (mileage > 0) this.mileage = mileage;
            return "Vehicle updated successfully!";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}