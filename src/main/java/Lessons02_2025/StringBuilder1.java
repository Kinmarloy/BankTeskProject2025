package Lessons02_2025;

public class StringBuilder1 {
    public static void main(String[] args) {
        String x = "Hello";
        x.toUpperCase();
        System.out.println(x); //все равно выведет Hello, т.к. x все так же харин ссылку на Hello и не переопределен

        StringBuilder y = new StringBuilder("Hello");
        y.append(" world");
        System.out.println(y.toString()); // SOUT ожидает неизменяемый объект
    }
}
