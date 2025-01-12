package Jan6;

public class Employee {
    int id;
    String name;
    double salary;
    String designation;
    int age;
    double numberOfHours;
    double payRate;
    public Employee(int id,String name,String designation,int age){
        this.id=id;
        this.name=name;
        this.designation=designation;
        this.age=age;
    }
    public double calculate(){
        return numberOfHours*payRate;
    }
    public void displayDetails(){
        System.out.println("Name of person is:"+name+"\nid of the person is:"+id+
                "\ndesignation"+designation+"\nage:0"+age+"\nnumber of working hours:"
                +numberOfHours);
    }
}
