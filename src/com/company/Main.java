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
        String s = scanner.nextLine();
        if ("Read from file".equals(s)) {
            System.out.println("Enter the file name with extension: ");
            String str = scanner.nextLine();
            String path = "C:/resources/file.txt";              //создаем переменную, в которую помещаем путь до нашего файла
            File file = new File(path);                         //добавляем созданный файл в код
            Scanner scanner1 = new Scanner(file);               //объекту класса Scanner передаем наш файл
            while (scanner1.hasNextLine()) {                    //пока в файле есть строки
                //System.out.println(scanner1.nextLine());        //выводим строки в консоль

                String line = scanner1.nextLine();
                String[] words = line.split(" ");

                System.out.println(Arrays.toString(words));
                for (int i = 0; i < words.length; i++) {
                    if (words[i].contains("abc")) {
                        System.out.println(words[i]);
                    }
                }
            }


        }else if ("Read from console".equals(s)) {
            System.out.println("Type any symbol using your keyboard");
            String str = scanner.nextLine();
        }else {
            System.out.println("Type only Read from file or Read from console");
        }
    }
}
