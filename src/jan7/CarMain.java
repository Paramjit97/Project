package jan7;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the type of car:Electric/Gasoline/Diesel");
        String name=scanner.next();
        //name of the car
        System.out.println("Enter model:");
        String brand=scanner.next();
        //model
        System.out.println("Enter brand");
        String model=scanner.next();
        //price
        System.out.println("Enter price:");
        double price=scanner.nextDouble();

        Car car=null;
        if(name.equalsIgnoreCase("electric")) {
             car = new ElectricCar(brand, model, price);
        } else if (name.equalsIgnoreCase("gasoline")) {

             car = new GasolineCar(brand, model, price);
        }
        else {
            car = new DieselCar(brand, model, price);
        }
        car.details();

        //reference of child
        ElectricCar ecar=new ElectricCar("Tesla","S",1200000);
        ecar.details();

        GasolineCar gcar=new GasolineCar("Honda","Civic",12000);
        gcar.details();

        DieselCar dcar=new DieselCar("BMW","328d",12300);
        dcar.details();
    }
}
