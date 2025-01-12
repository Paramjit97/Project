package jan7;

public class GasolineCar extends Car {
    public GasolineCar(String brand,String model,double price) {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    @Override
    public void details() {
        System.out.println("This is the info about gasoline car:\n");
        super.details();
    }
}
