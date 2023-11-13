//----------------------------------------------------
//Program Name: CriticalThinkingMod#4 Option 1
//Author: Michael C Krywanio
//Date: Nov 05 2023
//----------------------------------------------------
//Program Name: Cone.java
//Description: 5 Code snippets to create 4 objects and put them into an array
//----------------------------------------------------
//Start
//
//Define a class named Cone that extends Shape
//Declare private variables radius and height, both of type double
//
//Define a constructor for Cone that takes radius and height as arguments
//Set the instance radius and height to the passed values
//
//Implement the surfaceArea method
//Calculate and return the surface area of the cone
//
//Implement the volume method
//Calculate and return the volume of the cone
//
//Override the toString method
//Return a string representation of the cone including radius, height, surface area, and volume
//
//End
//-----------------------------------------------------
public class Cone extends Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height / 3;
    }

    @Override
    public String toString() {
        return "Cone { Radius: " + radius + ", Height: " + height + ", Surface Area: " + surfaceArea() + ", Volume: " + volume() + " }";
    }
}