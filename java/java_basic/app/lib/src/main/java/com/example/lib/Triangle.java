package com.example.lib;

public class Triangle implements Shape {
    private final double height;
    private final double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return (height * base) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}
