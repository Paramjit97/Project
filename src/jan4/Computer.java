package jan4;
public class Computer{
int capacity;
String model;
String manufacturer;

    public Computer(int capacity, String model, String manufacturer) {
        this.capacity = capacity;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void comp(){
        System.out.println("this is parent");
    }
}
