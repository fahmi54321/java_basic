package com.example.lib;

public class MyClass {
    public static void main(String[] args){

        Vehicle v1 = new Car("Bmw");
        Vehicle v2 = new Truck(6);

        v1.start();
        v2.start();

        v1.brake();
        v2.brake();
    }
}