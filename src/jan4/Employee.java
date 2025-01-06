package jan4;

public class Employee {
    int id;
    String name;
    double salary;
    String designation;
    int age;
    double numberOfHours;
    double payRate;

  public int getId(){
      return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public double getNumberOfHours() {
        return numberOfHours;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumberOfHours(double numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // to display info
    public void displayDetails(){
        System.out.println("Name of person is:"+getName()+"\nid of the person is:"+getId()+"\ndesignation:"+getDesignation()+"\nage:0"+getAge()+"\nnumber of working hours:"
                +getNumberOfHours());
    }
}