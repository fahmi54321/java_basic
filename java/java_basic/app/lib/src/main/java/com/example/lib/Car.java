package com.example.lib;

public class Car{
    private int year;
    private int speed;

    // Getters and Setters

    /**
     * Lebih cepatnya:
     * Mac : control + enter (pilih constructor)
     * Windows : Alt + Insert (pilih constructor)
     *
     */
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void accelerate(){
        speed += 10;

        System.out.println("speed: "+getSpeed());
    }

    void brake(){
        speed -= 5;
        System.out.println("speed: "+getSpeed());
    }

    // constructor
    public Car(int speed, int year){
        setYear(year);
        setSpeed(speed);
    }
}
