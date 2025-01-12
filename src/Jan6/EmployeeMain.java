package Jan6;


import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = null;

        // enter details
        System.out.println("Name:");
        String name=scanner.next();

        System.out.println("ID:");
        int id=scanner.nextInt();


        System.out.println("Age:");
        int age=scanner.nextInt();

        System.out.println("Designation:");
        String designation=scanner.next();

        System.out.println("Enter Number of Working Hours:");
        double numberOfHours = scanner.nextDouble();

        System.out.println("Enter Pay Rate:");
        double payRate = scanner.nextDouble();

        System.out.println("Enter Job Type :");
        String jobType = scanner.next();


        if (jobType.equalsIgnoreCase("fulltime")) {
            employee = new Fulltime(id, name, designation, age, numberOfHours, payRate);
        } else if (jobType.equalsIgnoreCase("parttime")) {
            employee = new Parttime(id, name, designation, age, numberOfHours, payRate);
        } else {
            System.out.println("Invalid job type. Defaulting to part-time.");
            employee = new Parttime(id, name, designation, age, numberOfHours, payRate);
        }
        employee.displayDetails();
    }
}
