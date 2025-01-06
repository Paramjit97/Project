package jan4;

public class PartTime extends Employee{
    @Override
    public double getSalary() {
        return getNumberOfHours()*getPayRate();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("this is part-time employee");
        System.out.println("salary:"+getSalary());
    }
}
