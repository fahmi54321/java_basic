package com.example.lib;

public class Truck extends Vehicle implements VehicleInterface {
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
    public void startEngine() {
        System.out.println("The trucks startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("The trucks stopEngine");
    }

    @Override
    public void accelerate() {
        System.out.println("The trucks accelerate");
    }

    @Override
    public void brake() {
        System.out.println("The trucks brake");
    }
}
