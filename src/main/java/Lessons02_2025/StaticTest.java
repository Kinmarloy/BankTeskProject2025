package Lessons02_2025;

public class StaticTest {
    public static void main(String[] args) {
        Human.print();
    }
}

class Human {
    public static String description;
    final int CONSTANT;

    public Human() {
        CONSTANT = 1;
    }



    public static void print(){

        System.out.println(description);
    }
    }

