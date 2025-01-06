package dec17;

public class Student {
    String name;
    int age;
    String grade;
    String Course;

    public Student(){
        this("simran",23,"S");
        System.out.println("hey this is first");
    }

    public Student(String name) {
        this();
        this.name = name;
    }

    public Student(String name,int age) {
        System.out.println("I am const 3");
        this.name=name;
        this.age = age;
    }

    public Student(String name, int age, String grade) {
        this("Raj",34);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student(String name, int age, String grade, String course) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        Course = course;
    }
}
