package com.company;

import com.company.shapes.Circle;
import com.company.shapes.Shape;
import com.company.shapes.Rectangle;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
//        System.out.println(Math.round(MathConstants.PI.getNumber()));
//        System.out.println(Math.round(MathConstants.PI.getNumber()));
//        System.out.println(MathConstants.PYTHAGORAS_CONSTANT.getNumber());


//        Car newCar = new Car();
//        newCar.horn();

//        Vehicle car = new Car();
////        car.startEngine();
//
//        Vehicle mCycle = new Motorcycle();
////        mCycle.startEngine();
//
//        Vehicle bike = new Bicycle();
//        bike.stopEngine();

//        Motorcycle mCycle = new Motorcycle();
//        mCycle.horn();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        Shape circle = new Circle(sc.nextInt()); // Use the next number entered as the radius

        System.out.println("Area of the circle: " + circle.getArea());
        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
        System.out.println();

        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        Shape rectangle = new Rectangle(length, breadth);
        System.out.println("Area of the rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());

    }

    // Assignment:
    // create an interface with just one method called 'operation'
    // This method has the following signature: operation(int firstNumber, int secondNumber);
    // Create classes to implement the following operations
    // using the interface above: Add, Subtract, Multiplication, Division, Square and Squareroot.
    //


}

// 6: 23 - 6: 43.
// Exercise: 20 mins.
// Create an interface to hold Shapes.
// Implement shape methods in the following classes:  Circle, Rectangle, Square, Triangle.
// The methods to implement are:
// getPerimeter(N.B.: Perimeter is the same as circumference of a circle).
// getArea
