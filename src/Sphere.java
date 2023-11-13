//----------------------------------------------------
//Program Name: CriticalThinkingMod#4 Option 1
//Author: Michael C Krywanio
//Date: Nov 05 2023
//----------------------------------------------------
//Program Name: Sphere.java
//Description: 5 Code snippets to create 4 objects and put them into an array
//----------------------------------------------------
//Start
//
// Import necessary Java Swing and AWT libraries
// Define a class named Sphere that extends Shape
// Declare a private variable radius of type double
//
// Define a constructor for Sphere that takes a radius as an argument
// Set the instance radius to the passed radius value
//
// Implement the surfaceArea method
// Calculate and return the surface area of the sphere
//
// Implement the volume method
// Calculate and return the volume of the sphere
//
// Override the toString method
// Return a string representation of the sphere including radius, surface area, and volume
//
//End
//-----------------------------------------------------
public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return (4.0/3) * Math.PI * radius * radius * radius;
    }

    @Override
    public String toString() {
        return "Sphere { Radius: " + radius + ", Surface Area: " + surfaceArea() + ", Volume: " + volume() + " }";
    }
}