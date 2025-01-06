package jan4;

public class Fulltime extends Employee{

    @Override
    public double getSalary() {
        return numberOfHours*payRate;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("this is full-time employee");
        System.out.println("salary:"+getSalary());
    }
}
