package com.example.lib;

public class Car{
    private int year;
    protected int speed;

    void accelerate(){
        speed += 10;

        System.out.println("speed: "+speed);
    }

    void brake(){
        speed -= 5;
        System.out.println("speed: "+speed);
    }

    // constructor
    public Car(int speed, int year){
        this.year = year;
        this.speed = speed;
    }
}
