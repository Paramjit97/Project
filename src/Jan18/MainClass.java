package Jan18;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Address address1 = new Address(121, "Mississauga", "ON", "l6r 3a8", "CA");
        Address address2=new Address(122,"Brampton","ON","l6r 3e8","CA");
        Address address3=new Address(123,"Toronto","ON","l6s3w8","CA");
        Employee emp1 = new Employee("param", "P2344", 2345678, "pa353522@gmail.com", address1);
        Employee emp2=new Employee("simi","S12345",23456.9,"simi@gmail.com",address2);
        Employee emp3 = new Employee("param", "P2345", 2345668, "pa3522@gmail.com", address3);
        Employee emp4 = new Employee("ram", "P24", 23678, "pa35352@gmail.com", address1);

        //inline thing
        // Employee emp1=new Employee("param","P2344",2345678,"pa353522@gmail.com",new Address(121,"redpoll","ON","l6r 3a8","CA"));
        //
        String province = emp1.getAddress().getProvince();
        System.out.println(province);

        System.out.println("Enter the City:");
        Scanner scanner=new Scanner(System.in);
        String cityN=scanner.next();

        Employee[] employee=new Employee[4];
        employee[0]=emp1;
        employee[1]=emp2;
        employee[2]=emp3;
        employee[3]=emp4;

        int count=0;
        for(Employee employees:employee){
            if(employees.getAddress().getCity().equalsIgnoreCase(cityN)){
                count++;
                System.out.println(employees);
            }
        }
        System.out.println(count);
    }
}
