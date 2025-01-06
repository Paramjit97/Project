package Assignment;

import java.util.Scanner;

public class ClassroomAttendanceTracker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Number of Students:");
        int num=scanner.nextInt();
        String[] StudentN=new String[num];
        String[] Attendence=new String[num];

        System.out.println("Enter Students name:");
        for(int i=0;i< StudentN.length;i++){
            StudentN[i]=scanner.next();
        }

        System.out.println("mark the Attendance");
        for(int i=0;i< Attendence.length;i++){
            Attendence[i]=scanner.next();
        }

        //check if student is present or not

        boolean found=false;
        int stuIndex=0;
        System.out.println("Enter name of student who u want to check if present or not");
        String studentName=scanner.next();
        for(int i=0;i<num;i++){
           if(StudentN[i].equals(studentName)) {
               stuIndex = i;
               found = true;
               break;
           }
        }
        if(found){
            if(Attendence[stuIndex].equals("p")){
                System.out.println("student:"+StudentN[stuIndex]+" is present");
            }
            else{
                System.out.println("student:"+StudentN[stuIndex]+" is absent");
            }
        }
        if(!found){
            System.out.println("No such student");
        }
    }
}
