package com.example.lib;

// paren class
public class Vehicle {
    private int numberOfWheels;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public Vehicle(int numberOfWheels) {
        setNumberOfWheels(numberOfWheels); ;
    }

    void start(){
        System.out.println("The vehicle starts");
    }

    void stop(){
        System.out.println("The vehicle stops");
    }
}
