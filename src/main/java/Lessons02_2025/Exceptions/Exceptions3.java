package Lessons02_2025.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {
        // checked exception (compile time exception) = исключительные случаи в работе программы
        // т.е. ошибка, которая может появиться, даже если код написан правильно, пример - файл не найден
        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        }
        // unchecked (run time exception) = ошибка в работе программы
        // ошибки которые не должны быть в программе, пример - деление на ноль, или nullPointerException

//        int a = 1 / 0;
        String name = null;
        name.length();

    }
}

