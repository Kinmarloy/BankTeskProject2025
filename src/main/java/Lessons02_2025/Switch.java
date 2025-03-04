package Lessons02_2025;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число");
        int x = scanner.nextInt();
        switch (x) {
            case 0 :
                System.out.println(0);
                break;
            case 1 :
                System.out.println(1);
                break;
        }
    }
}
