package jan4;

public class Motorbike extends Vehicle {
    int numberOfKicks;
    @Override
    public void start() {
        System.out.println("Bike starts ");
    }

    @Override
    public void brake() {
        System.out.println("bike brakes ");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike accelerate ");
    }

    public boolean canDoWheele(){
        return true;
    }
}
