package com.example.lib;

// child class
public class Car extends Vehicle implements VehicleInterface{

    private String carModel;

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Car(String carModel) {
        super(4);

        setCarModel(carModel);
    }

    void hunk(){
        System.out.println("Beep");
    }

    @Override
    void start() {
        System.out.println("The Car starts");
//        super.start();
    }

    @Override
    void stop() {
        System.out.println("The Car stops");
//        super.stop();
    }

    @Override
    public void startEngine() {
        System.out.println("The Car startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("The Car stopEngine");
    }

    @Override
    public void accelerate() {
        System.out.println("The Car accelerate");
    }

    @Override
    public void brake() {
        System.out.println("The Car brake");
    }
}
