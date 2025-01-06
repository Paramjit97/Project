package Assignment;

import java.util.Scanner;

public class FlightBookingSystem {

        Scanner scanner=new Scanner(System.in);
        String[] destinations=new String[5];
        String finalDestination=null;
        //to add destinations
    public void destinations(){
        System.out.println("Enter the destinations");
        for(int i=0;i<5;i++){
            destinations[i]=scanner.next();
        }
    }
    //fights available or not
    public void checkDestinations(String country){
        boolean available=false;
        System.out.println("check availabilty");
        for(int i=0;i<5;i++){
            if (destinations[i].equals(country)){
                finalDestination=country;
                System.out.println("your destination country  "+finalDestination+"  is available");
                available=true;
                break;
            }
        }
        if(!available){
            System.out.println("Sorry "+country+" not available");
        }
    }

    //change the destination
    public void changeDestination(String newCountry){
        boolean available=false;
        for(int i=0;i<5;i++){
            if (destinations[i].equals(newCountry)){
                System.out.println("your new destination has been changed from "+finalDestination+" to "+newCountry);
                finalDestination=newCountry;
                available=true;
                break;
            }
        }
        if(!available){
            System.out.println("Sorry "+newCountry+" not available");
        }
    }
}
