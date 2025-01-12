package Jan6;

public class Parttime extends Employee{
    double payRate;
    public Parttime(int id,String name,String designation,int age,double numberOfHours,
                    double payRate){
        super(id,name,designation,age);
    }

    @Override
    public double calculate() {
        return numberOfHours*payRate;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("this is Part-time employee");
        System.out.println("salary:"+calculate());
    }
}
