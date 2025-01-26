package UniversityManagementSystem;

public class Student extends Person{
    String studentId;
    String course;
    double gpa;
    public Student(String name,int age,String studentId,String course,double gpa) {
        super(name, age);
        this.studentId=studentId;
        this.course=course;
        this.gpa=gpa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Student ID:"+studentId+"\nCourse:"+course+"\nGPA"+gpa);
    }
}
