package jan11;

public class Superuse {
    int x=10;
    public void show(){
         x=20;
        System.out.println(x);
    }
}

class Subclass extends Superuse{
    @Override
    public void show() {
        super.show();
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        Superuse s1=new Subclass();
        s1.show();
    }
}
