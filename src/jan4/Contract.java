package jan4;

public class Contract extends Employee{

    @Override
    public double getSalary() {
        return getNumberOfHours()*getPayRate();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("this is contractor employee");
        System.out.println("salary:"+getSalary());
    }
}
