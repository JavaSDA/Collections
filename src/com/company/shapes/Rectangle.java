package com.company.shapes;

public class Rectangle implements Shape {

    // Define the properties of the rectangle
    private int length;
    private int breadth;

    // Define the constructor
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Define getters and setters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public float getArea() {
        return length * breadth;
    }

    public float getPerimeter() {
        return  2 * (length + breadth);
    }
}
