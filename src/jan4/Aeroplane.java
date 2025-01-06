package jan4;

public class Aeroplane extends Vehicle {

    @Override
    public void start() {
        System.out.println("Plane starts");
    }

    @Override
    public void brake() {
        System.out.println("Plane brakes");
    }

    @Override
    public void accelerate() {
        System.out.println("It can fly.... ");
    }

    public boolean canFlyInAir() {
        return true;
    }
}