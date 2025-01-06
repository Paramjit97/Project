package dec14;

public class DateDemoMain {
    public static void main(String[]args){
        DateDemo BYear=new DateDemo();
        System.out.println("dob is:"+BYear.day+"-"+BYear.month+"-"+BYear.year);

        DateDemo Nyear= new DateDemo(01,01,2025);
        System.out.println("New Year Date:"+Nyear.day+"-"+Nyear.month+"-"+Nyear.year);

    }
}
