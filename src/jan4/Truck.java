package jan4;

public class Truck extends Vehicle{
    int numberOfTrailers;
    @Override
    public void start() {
        System.out.println("truck starts");
    }

    @Override
    public void brake() {
        System.out.println("truck brakes");
    }

    @Override
    public void accelerate() {
        System.out.println("start accelerating ");
    }
    public boolean hasDualtires(){
        return true;
    }
}
