package jan7;

public class DieselCar extends Car {
    public DieselCar(String brand,String model,double price) {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    @Override
    public void details() {
        System.out.println("This is the info about diesel car:\n");
        super.details();
    }

}
