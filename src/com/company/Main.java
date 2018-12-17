package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Read from file or Read from console?");
        System.out.println("Type Exit for closing program");
        String s = scanner.nextLine();
        while ((!s.equals("Read from file")) && (!s.equals("Read from console")) && (!s.equals("Exit"))) {
            System.out.println("You must type only Read from file Read from console or Exit");
            s = scanner.nextLine();
        }
        if ("Read from file".equals(s)) {
            System.out.println("Enter the file name with extension: ");
            String str = scanner.nextLine();
            //String path = "/resources/file.txt";              //создаем переменную, в которую помещаем путь до нашего файла
            File file = new File("resources/file.txt");                         //добавляем созданный файл в код
            Scanner scanner1 = new Scanner(file);               //объекту класса Scanner передаем наш файл
            while (scanner1.hasNextLine()) {                    //пока в файле есть строки
                //System.out.println(scanner1.nextLine());        //выводим строки в консоль

                String line = scanner1.nextLine();
                String[] words = line.split(" ");
                System.out.println("Available words for sorting");
                System.out.println(Arrays.toString(words));
                System.out.println("Type symbols for looking for");
                String abc = scanner.nextLine();
                System.out.println("List of words after sorting");
                for (int i = 0; i < words.length; i++) {

                    if (words[i].contains(abc)) {
                        System.out.println(words[i]);
                    }
                }
            }


        }else if ("Read from console".equals(s)) {
            System.out.println("Type any symbol using your keyboard");
            String srt = scanner.nextLine();
            String[] words1 = srt.split(" ");
            System.out.println("Available words for sorting");
            System.out.println(Arrays.toString(words1));
            System.out.println("Type symbols for looking for");
            String a = scanner.nextLine();
            System.out.println("List of words after sorting");
            for(int i = 0; i < words1.length; i++) {
                if (words1[i].contains(a)) {
                    System.out.println(words1[i]);
                }
            }

        }


        else if("Exit".equals(s)){
            System.out.println("Program is closing...");
            scanner.close();
        }
    }
}
