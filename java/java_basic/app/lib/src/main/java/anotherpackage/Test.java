package anotherpackage;

import com.example.lib.Car;

public class Test {
    void justTesting(){
        Car yellowCar = new Car(70, 2024);

        yellowCar.speed = 180;
        yellowCar.year = 2025;

        yellowCar.accelerate();
        yellowCar.brake();
        yellowCar.brake();
        yellowCar.brake();
    }
}
