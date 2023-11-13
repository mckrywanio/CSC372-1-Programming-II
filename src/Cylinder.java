//----------------------------------------------------
//Program Name: CriticalThinkingMod#4 Option 1
//Author: Michael C Krywanio
//Date: Nov 05 2023
//----------------------------------------------------
//Program Name: Cylinder.java
//Description: 5 Code snippets to create 4 objects and put them into an array
//----------------------------------------------------
//Start
//
// Define a class named Cylinder that extends Shape
// Declare private variables radius and height, both of type double
//
// Define a constructor for Cylinder that takes radius and height as arguments
// Set the instance radius and height to the passed values
//
// Implement the surfaceArea method
// Calculate and return the surface area of the cylinder
//
// Implement the volume method
// Calculate and return the volume of the cylinder
//
// Override the toString method
// Return a string representation of the cylinder including radius, height, surface area, and volume
//
//End
//-----------------------------------------------------
public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder { Radius: " + radius + ", Height: " + height + ", Surface Area: " + surfaceArea() + ", Volume: " + volume() + " }";
    }
}