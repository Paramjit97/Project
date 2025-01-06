package dec29;

import java.util.Scanner;

public class TempCoverter {
    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // enter the temp
        System.out.println("Enter the temp");
        int temp=scanner.nextInt();
        TempCoverter temperature=new TempCoverter();

        int finaltemp=temperature.RTemp(temp);
        System.out.println("the result is:"+finaltemp);
    }
    public int RTemp(int temperature){
        System.out.println("Menu\n1.Celsius to fahrenheit\n2.fahrenheit to celsius");
        int Menu=scanner.nextInt();
        int result=0;
        switch (Menu){
            case 1:
                result=(int)(temperature*(9.0/5))+32;
                break;
            case 2:
                result=(int)((temperature-32)*(5.0/9));
        }
        return result;
    }
}
