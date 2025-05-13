package Lessons02_2025.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        String path = "src/test/resources/File2.txt";
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("Файл не найден");
        }
        finally {
            System.out.println("finally");
        }
 

    }
}
