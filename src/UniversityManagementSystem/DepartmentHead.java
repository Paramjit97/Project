package UniversityManagementSystem;

public class DepartmentHead extends Professor{
    String officeRoom;

    public DepartmentHead(String name, int age, String employeeId, String department,
                          double salary, String officeRoom) {
        super(name, age, employeeId, department, salary);
        this.officeRoom=officeRoom;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Office:"+officeRoom+"\n");
    }
}
