package com.company;

public enum MathConstants {

    PI(Math.PI),
    AVOGADRO_CONSTANT(6.02),
    PYTHAGORAS_CONSTANT(MathConstants.returnPythagoreas()), // Math.sqrt(-2)
    THEODORUS_CONSTANT( Math.sqrt(3)),
    IMAGINARY_UNIT(Math.sqrt(-1)),
    AVOGARDO_NUMBER(6.02214076 * Math.pow(10, 23));

    // create properties to hold these values.
    private final double number;

    // Constructor
    MathConstants(double number){
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public static double returnPythagoreas() {
        return Math.sqrt(-2);
    }

    // UML - Model a school hierarchy. Person, students, principal,
    // teachers, janitors. (how they relate to each
// other, their jobs at school. In diagrams.net

    // Aggregation - means that one object is a
    // part of another object. (the two objects do not depend on one another).
    // Composition - means an aggregation where the one object depends on the other.
}

