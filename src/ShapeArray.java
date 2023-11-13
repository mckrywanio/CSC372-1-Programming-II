//----------------------------------------------------
//Program Name: CriticalThinkingMod#4 Option 1
//Author: Michael C Krywanio
//Date: Nov 05 2023
//----------------------------------------------------
//Program Name: ShapeArray.java
//Description: 5 Code snippets to create 4 objects and put them into an array
//----------------------------------------------------
//Start
//
//Define a class named ShapeArray
//In the main method:
//Create an array of Shape objects named shapeArray with size 3
//
//Instantiate a Sphere object with a given radius and store it in shapeArray
//Instantiate a Cylinder object with given radius and height and store it in shapeArray
//Instantiate a Cone object with given radius and height and store it in shapeArray
//
//Loop through each element in shapeArray
//Print the string representation of each Shape object using its toString method
//
//End
//-----------------------------------------------------
public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[3];
        shapeArray[0] = new Sphere(5.0);
        shapeArray[1] = new Cylinder(3.0, 7.0);
        shapeArray[2] = new Cone(2.0, 6.0);

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}