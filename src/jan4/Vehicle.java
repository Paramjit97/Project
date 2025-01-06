package jan4;

public class Vehicle {
    int numberOfWheels;
    String color;

    public void start() {
        System.out.println(" Start");
    }

    public void brake() {
        System.out.println("vehicle break");
    }

    public void accelerate() {
        System.out.println("vehicle accelerate");
    }

    public void printDetails() {
        System.out.println("vehicle details: number of wheels" + numberOfWheels);
        System.out.println("Number of doors...");
    }
}