package jan4;

public class Car extends Vehicle {
    int numberOfDoors;

    @Override
    public void start() {
        System.out.println("car start");;
    }

    @Override
    public void brake() {
        System.out.println("car brake");;
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate");
    }
    public boolean hasAC(){
        return true;
    }
}
