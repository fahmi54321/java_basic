package com.example.lib;

public class MyClass {
    public static void main(String[] args){

        sayHello();
    }

    static void sayHello(){
        System.out.println("hello");
        System.out.println("10 + 20 = "+addNumbers());
        System.out.println("10 + 20 = "+addNumberss(10,20)); // static in (method overloading)
        System.out.println("10 + 20 = "+addNumberss(10.7,20.2)); // static double (method overloading)
    }

    static int addNumbers(){
        int x = 10;
        int y = 20;

        int z = x+y;
        return z;
    }

    static int addNumberss(int x, int y){
        return x+y;
    }

    static double addNumberss(double x, double y){
        return x+y;
    }
}