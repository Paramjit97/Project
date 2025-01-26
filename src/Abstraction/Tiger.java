package Abstraction;

public class Tiger extends Animal{
    @Override
    public void eat() {
        System.out.println("Tiger eat..");
    }

    @Override
    public void makeSound() {
        System.out.println("Tiger roar..");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleep..");
    }
}
