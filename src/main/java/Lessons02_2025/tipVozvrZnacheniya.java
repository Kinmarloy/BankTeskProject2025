package Lessons02_2025;

import commonelements.P;

public class tipVozvrZnacheniya {
    public static void main(String[] args) {
        Person person1 = new Person("S1", 10);
        int year2 = person1.calculate();
        System.out.println(year2);
    }

}

class Person {
    String name;
    int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    int calculate(){
        int years = age*2;
        return years;
    }

}
