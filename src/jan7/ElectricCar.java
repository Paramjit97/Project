package jan7;

public class ElectricCar extends Car{

    public ElectricCar(String brand,String model,double price) {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    @Override
    public void details() {
        System.out.println("This is the info about electric car:\n");
        super.details();
    }
}
