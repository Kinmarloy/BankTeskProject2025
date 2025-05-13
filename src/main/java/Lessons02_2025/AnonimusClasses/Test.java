package Lessons02_2025.AnonimusClasses;

//class Animal {
//    public void eat(){
//        System.out.println("Animal is eating...");
//    }
//}

//class OtherAnimal extends Animal {
//    public void eat(){
//        System.out.println("Other animal is eating...");
//    }
//}  Что бы не создавать отдельный класс, если нужно переопределить и использовать метод 1 раз
//      создали анонимный класс  при создании объекта animal2

interface AbletoEat {
    public void eat();
}

public class Test {
    public static void main(String[] args) {
        AbletoEat abletoEat = new AbletoEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };

        abletoEat.eat();



//        Animal animal = new Animal();
//        animal.eat();
//
//        //Если мы хотим создать объект класса Animal с переопределенным методом eat:
//        Animal animal2 = new Animal(){
//            @Override
//            public void eat(){
//                System.out.println("Other animal is eating...");
//            }
//        };

//        animal2.eat();

//        OtherAnimal otherAnimal = new OtherAnimal();
//        otherAnimal.eat();
    }
}
