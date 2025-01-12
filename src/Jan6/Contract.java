package Jan6;

public class Contract extends Employee {
    double payRate;

    public Contract(int id, String name, String designation, int age, double numberOfHours,
                    double payRate) {
        super(id, name, designation, age);
    }

    @Override
    public double calculate() {
        return numberOfHours * payRate;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("this is Contract based Employee");
        System.out.println("salary:" + calculate());
    }

}
