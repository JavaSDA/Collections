package com.company.shapes;

public class Circle implements Shape {

    // Define the properties of a circle.
    private int radius;

    // Define constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    // getters and setters
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // getArea and getPerimeter methods.
    public float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }


}
