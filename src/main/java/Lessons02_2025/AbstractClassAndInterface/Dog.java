package Lessons02_2025.AbstractClassAndInterface;

public class Dog implements AbleToMakeSound{
//    public void makeSound() {
//        System.out.println("Make sound");
//    }
    @Override
    public void makeSound() {
        System.out.println("bark");
    }
}
