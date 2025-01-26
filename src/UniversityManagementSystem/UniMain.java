package UniversityManagementSystem;

import java.util.Scanner;

public class UniMain {
    public static void main(String[] args) {
        University.universityName = "Guru Nanak Dev University";

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for role
        System.out.println("Enter your role (Student, Professor, DepartmentHead):");
        String role = scanner.next();

        // Initialize person object
        Person person = null;

        if (role.equalsIgnoreCase("Student")) {
            // Student info
            System.out.println("Enter your name:");
            String name = scanner.next();
            System.out.println("Enter your age:");
            int age = scanner.nextInt();
            System.out.println("Enter Student Id:");
            String stuId = scanner.next();
            System.out.println("Enter Course:");
            String course = scanner.next();
            scanner.nextLine();
            System.out.println("Enter GPA:");
            double gpa = scanner.nextDouble();

            person = new Student(name, age, stuId, course, gpa);
        } else if (role.equalsIgnoreCase("Professor")) {
            // Professor info
            System.out.println("Enter your name:");
            String name = scanner.next();
            System.out.println("Enter your age:");
            int age = scanner.nextInt();
            System.out.println("Enter Employee Id:");
            String empId = scanner.next();
            System.out.println("Enter Department:");
            String dept = scanner.next();
            scanner.nextLine();
            System.out.println("Enter Salary:");
            double salary = scanner.nextDouble();

            person = new Professor(name, age, empId, dept, salary);
        } else if (role.equalsIgnoreCase("DepartmentHead")) {
            // DepartmentHead info
            System.out.println("Enter your name:");
            String name = scanner.next();
            scanner.nextLine();
            System.out.println("Enter your age:");
            int age = scanner.nextInt();
            System.out.println("Enter Employee Id:");
            String empId = scanner.next();
            System.out.println("Enter Department:");
            String dept = scanner.next();
            scanner.nextLine();
            System.out.println("Enter Salary:");
            double salary = scanner.nextDouble();
            System.out.println("Enter Office Number:");
            String officeNum = scanner.next();

            person = new DepartmentHead(name, age, empId, dept, salary, officeNum);
        } else {
            System.out.println("Invalid role entered.");
            return; // Exit if the role is invalid
        }

        // Array to store the created person object
        Person[] people = new Person[1];
        people[0] = person; // Add the created person to the array

        // Display the details of the person
        System.out.println("Do you want to enter more?yes/no");
        String response=scanner.next();
        while (response.equalsIgnoreCase("yes")) {
            for (Person p : people) {

                p.display();
                if (p instanceof Student) {
                    University.incrementStudentCount();
                } else if (p instanceof Professor || p instanceof DepartmentHead) {
                    University.incrementProfessorCount();
                }
            }
            System.out.print("Do you want to continue? (yes/no): ");
            String responseupdate=scanner.next();
            response = responseupdate;// Update response
        }
        // Show university statistics
        University.getStatics();

    }
}
