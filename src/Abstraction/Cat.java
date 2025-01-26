package Abstraction;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat eat..");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat growls..");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleep..");
    }
}
