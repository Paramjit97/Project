package jan11;

public class StaticMethod {
    public static void displayStatic(){//2
        System.out.println("this is static");
    }
    public void display(){//4
        System.out.println("this is non-static method");
    }
    static {  //1.
        System.out.println("inside the static block;");
    }
    {//3
        System.out.println("instance block");
    }
    public static void main(String[] args) {

        //calling static
        StaticMethod.displayStatic();
        StaticMethod o1=new StaticMethod();
        //calling normal
        o1.display();
    }
}
