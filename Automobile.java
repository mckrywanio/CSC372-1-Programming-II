//---------------------------------
//Program Name:Programming 1 Portfolio Project
//Author:Michael C Krywanio
//Date: OCT 08 2023
//---------------------------------
//PsudoCode
// CLASS Automobile:

//     PRIVATE:
//         string make
//         string model
//         string color
//         int year
//         int mileage

//     PUBLIC:

//     METHOD Constructor():
//         make = ""
//         model = ""
//         color = ""
//         year = 0
//         mileage = 0
//     END METHOD

//     METHOD Constructor(param_make, param_model, param_color, param_year, param_mileage):
//         make = param_make
//         model = param_model
//         color = param_color
//         year = param_year
//         mileage = param_mileage
//     END METHOD

//     METHOD toString() -> string:
//         RETURN make + ", " + model + ", " + color + ", " + year + ", " + mileage
//     END METHOD

// END CLASS

//END MAIN

//-------------------------------------
public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    public Automobile() {
        this.make = "";
        this.model = "";
        this.color = "";
        this.year = 0;
        this.mileage = 0;
    }

    public Automobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }
    public void setMake(String make) {
        this.make = make;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String toFileString() {
        return make + "," + model + "," + color + "," + year + "," + mileage;
    }

    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Color: " + color + ", Year: " + year + ", Mileage: " + mileage;
    }
}