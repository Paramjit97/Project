package Abstraction;

public abstract class Vehicle {
    String color;
    String model;
    double price;

    public void brake(){
        System.out.println("brake..");// this one is concrete class
    }

    public abstract void accelerate();
    public abstract void start();
}
