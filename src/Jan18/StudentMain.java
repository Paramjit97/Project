package Jan18;

public class StudentMain {
    public static void main(String[] args) {
        Name sname=new Name("Param","Jit","kaur");
        Student stu1=new Student(sname,"param@gmail.com","23434-5844");

        String lastName=stu1.getName().getLastName();
        System.out.println(lastName);
        System.out.println(stu1);

    }
}
