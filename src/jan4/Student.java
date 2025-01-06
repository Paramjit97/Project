package jan4;

public class Student {
        String name;
        int roll;
        int marks;
        public Student(String name,int roll,int marks){
            this.name=name;
            this.roll=roll;
            this.marks=marks;
        }
       public int getRoll(){
            return roll;
       }
       public String getName(){
            return name;
       }
       public int getMarks(){
            return marks;
       }
       public void displayDetails(){
           System.out.println("name is:"+getName());
           System.out.println("roll is:"+getRoll());
           System.out.println("marks are:"+getMarks());

        }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", marks=" + marks +
                '}';
    }
}
