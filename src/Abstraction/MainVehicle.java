package Abstraction;

public class MainVehicle {
    public static void main(String[] args) {
        //Vehicle vehicle=new Vehicle();it can't be done because it is abstract

        //therefore run time polymorphism is used
        Vehicle vehicle=new Car();
        vehicle.brake();
        vehicle.accelerate();
        vehicle.start();
    }
}
