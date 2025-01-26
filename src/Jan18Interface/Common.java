interface InterfaceA {
    void commonMethod(); // Same method in both interfaces
}

interface InterfaceB {
    void commonMethod(); // Same method in both interfaces
}

// Child class implements both interfaces
class Child implements InterfaceA, InterfaceB {
    @Override
    public void commonMethod() {
        // Resolving ambiguity by providing a single implementation
        System.out.println("Child's implementation of commonMethod");
    }
}

public class Common {
    public static void main(String[] args) {
        Child child = new Child();
        child.commonMethod(); // Output: Child's implementation of commonMethod
    }
}
