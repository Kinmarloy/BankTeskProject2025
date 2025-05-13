package Lessons02_2025;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
//        String separator = File.separator;
//        String path = "C:" + separator +"Users" + separator + "User" + separator + "Desktop" + separator + "File.txt";
        String path = "src/test/resources/File.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }


        String path1 = "src/test/resources/File1.txt";
        File file1 = new File(path1);

        Scanner scanner1 = new Scanner(file1);
        String line1 = scanner1.nextLine();
        String[] numbersString = line1.split(" ");
        int[] numbers = new int[3];
        int counter = 0;

        for (String number : numbersString){
            numbers[counter++] = Integer.parseInt(number);
        }


        System.out.println(Arrays.toString(numbers));

        scanner1.close();

    }

}

