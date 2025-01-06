package jan4;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Employee E1=null;
        //type of employement
        System.out.println("Enter the job type \n");
        String jobType=scanner.next();
        if(jobType.equalsIgnoreCase("fulltime")){
            E1=new Fulltime();
        } else if (jobType.equalsIgnoreCase("parttime")) {
            E1=new PartTime();
        }else{
            E1=new Contract();
        }

        //details of person
        System.out.println("Enter number of hours worked");
        double hours=scanner.nextDouble();
        System.out.println("Enter Payrate");
        double payRate=scanner.nextDouble();

        //enter the details to employee
        E1.setNumberOfHours(hours);
        E1.setPayRate(payRate);

        //details of the person
        System.out.println("Name:");
        String name=scanner.next();
        E1.name=name;
        System.out.println("ID:");
        int id=scanner.nextInt();
        E1.id=id;

        System.out.println("Age:");
        int age=scanner.nextInt();
        E1.age=age;

        System.out.println("Designation:");
        String designation=scanner.next();
        E1.designation=designation;
        E1.displayDetails();
    }
}
