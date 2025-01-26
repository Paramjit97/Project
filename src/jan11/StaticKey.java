package jan11;

public class StaticKey {
    String name;
    int id;
    double salary;
    static String company="Google";  //it shared therefire memory manangement

    public StaticKey(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "StaticKey{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    //main
    public static void main(String[] args) {
        StaticKey employee=new StaticKey("param",1762,30000);
        System.out.println(employee);
    }
}
