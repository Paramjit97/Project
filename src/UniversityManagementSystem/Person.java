package UniversityManagementSystem;

public class Person {
    private String name;
    private int age;

    //constructor

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //display
    public void display(){
        System.out.println("Name:"+name+"\nAge:"+age);
    }
    public final Class  getClassType(){
        return getClass();
    }
}
