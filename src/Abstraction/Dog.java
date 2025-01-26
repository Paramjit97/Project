package Abstraction;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog eat..");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog bark..");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep..");
    }
}
