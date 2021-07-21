package com.company;

public class Car implements Vehicle {

    public void horn() {
        System.out.println("Car Hoooooonk!!!");
    }

    public void startEngine() {
        System.out.println("Car Engine started");
    }

    public void stopEngine() {
        System.out.println("Engine Stopped");
    }

    public void stopEngine(boolean isOn) {

    }
}
