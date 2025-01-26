package Abstraction;

public class Car extends Vehicle{
    @Override
    public void brake() {  //this one is not mandatory for inheritance as it is concrete
        super.brake();
    }

    @Override
    public void accelerate() { //mandatory because abstract method
        System.out.println("Car accelerate...");
    }

    @Override
    public void start() { //mandatory
        System.out.println("Car Start...");
    }
}
