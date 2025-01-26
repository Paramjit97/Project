package Abstraction;

public class MainAnimal {
    public static void main(String[] args) {
        Animal dog=new Dog();
        Animal cat=new Cat();
        Animal tiger=new Tiger();

        dog.eat();
        cat.makeSound();
        tiger.sleep();
    }
}
