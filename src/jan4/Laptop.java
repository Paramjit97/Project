package jan4;

public class Laptop extends Computer {
    public  Laptop(int capacity,String model,String manufacturer, int batteryLife) {
        super(capacity, model, manufacturer);
    }
    public void laptopcol() {
        System.out.println("this is laptop inherit from computer");
        System.out.println(capacity);
    }
    }


