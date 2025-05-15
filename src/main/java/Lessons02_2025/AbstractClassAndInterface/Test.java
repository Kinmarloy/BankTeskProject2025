package Lessons02_2025.AbstractClassAndInterface;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.makeSound();
        cat.makeSound();
//        dog.eat();
        cat.eat();
    }
}
