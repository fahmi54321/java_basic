package com.example.lib;

public class MyClass {
    public static void main(String[] args){

        // object
        Car redCar = new Car(100,2024);

        redCar.setSpeed(180);
        redCar.setYear(2025);

        redCar.accelerate();
        redCar.brake();
        redCar.brake();
        redCar.brake();
    }
}