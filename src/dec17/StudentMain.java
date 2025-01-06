package dec17;

public class StudentMain {
    public static void main(String[] args) {
        Student Data=new Student();
        System.out.println("Details are"+Data.name+Data.Course+Data.grade+Data.age);

        Student Data1=new Student("Param",25);
        Student Data2=new Student("Sukh",26,"A");
        Student Data3=new Student("sehaj",27,"A","CSE");
        System.out.println("Final Data"+Data3);
    }
}
