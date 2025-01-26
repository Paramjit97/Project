package UniversityManagementSystem;

public class University {
    static String  universityName;
    static int totalStudents=0;
    static int totalProfessors=0;


    public static void  setUniversityName(String universityName) {
        universityName = universityName;
    }

    public static int  incrementStudentCount(){
        totalStudents++;
        return totalStudents;
    }
    public static int incrementProfessorCount(){
        totalProfessors++;
        return totalProfessors;
    }
    public static void getStatics(){
        System.out.println("---University Statics---");
        System.out.println("Total Students:"+totalStudents+"\nTotal Professors:"+totalProfessors);
    }
}
