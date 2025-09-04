package com.example.lib;

// child class
public class Car extends Vehicle{

    private String carModel;

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

//    public Car(int numberOfWheels) {
//        super(numberOfWheels);
//    }

    public Car(String carModel) {
        super(4);

        setCarModel(carModel);
    }

    void hunk(){
        System.out.println("Beep");
    }
}
