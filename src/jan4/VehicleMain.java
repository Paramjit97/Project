package jan4;

public class VehicleMain {
    public static void main(String[] args) {

        Car car = new Car();
        car.accelerate();
        car.brake();
        car.numberOfDoors=3;
        // create object of all the classes
        Motorbike bike=new Motorbike();
        bike.brake();
        bike.accelerate();
        bike.canDoWheele();
        // Bike, car, Aeroplane
        Aeroplane plane=new Aeroplane();
        plane.start();
        plane.accelerate();
        plane.canFlyInAir();
        plane.printDetails();
        // and call the respective methods for all of them
        // provide values of specific data memebers
        Truck truck=new Truck();
        truck.start();
        truck.accelerate();
        truck.hasDualtires();
        truck.printDetails();
        // add another class called Truck

    }
}
