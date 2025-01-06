package Assignment;

import java.util.Scanner;

public class FlightBookingSystemMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        FlightBookingSystem booking=new FlightBookingSystem();
        booking.destinations();

        //check destination call
        System.out.println("Enter your destination name");
        String country=scanner.next();
        booking.checkDestinations(country);

        // new country
        System.out.println("Do you want to change the counrty");
        String answer=scanner.next();
        if(answer.equals("yes")) {
            System.out.println("Enter new destination");
            String newCountry = scanner.next();
            booking.changeDestination(newCountry);
        }

    }
}
