package com.example.lib;

public class MyClass {
    public static void main(String[] args){

        Car v1 = new Car("Bmw");
        Truck v2 = new Truck(6);

        v1.start();
        v2.start();

        v1.startEngine();
        v1.stopEngine();
        v1.accelerate();
        v1.brake();
        v2.startEngine();
        v2.stopEngine();
        v2.accelerate();
        v2.brake();

        v1.stop();
        v2.stop();
    }
}