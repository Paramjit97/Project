package UniversityManagementSystem;

public class Professor extends Person{
    String employeeId;
    String department;
    double salary;
    public Professor(String name, int age, String employeeId,String department,double salary) {
        super(name, age);
        this.employeeId=employeeId;
        this.department=department;
        this.salary=salary;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID:"+employeeId+"\nDepartment:"+department+"\nSalary:" +
                "$"+salary );
    }
}
