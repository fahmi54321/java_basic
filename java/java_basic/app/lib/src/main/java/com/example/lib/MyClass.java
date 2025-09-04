package com.example.lib;

public class MyClass {
    public static void main(String[] args){

        Car myCar = new Car("C300");

        System.out.println(myCar.getCarModel());
        myCar.setCarModel("C200");

        System.out.println(myCar.getNumberOfWheels());
        System.out.println(myCar.getCarModel());
        myCar.hunk();
        myCar.start();
        myCar.stop();
    }
}