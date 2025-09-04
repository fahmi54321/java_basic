package com.example.lib;

public class Truck extends Vehicle {
    public Truck(int numberOfWheels) {
        super(numberOfWheels);
    }

    @Override
    void start() {
        System.out.println("The trucks start");
    }

    @Override
    void stop() {
        System.out.println("The trucks stop");
    }

    @Override
    void brake() {
        System.out.println("The trucks brake");
    }
}
