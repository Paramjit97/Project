package Jan18;

public class Employee {
    private String name;
    private String id;
    private double salary;
    private String email;
    private Address address;

    public Employee(String name, String id, double salary, String email, Address address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}

