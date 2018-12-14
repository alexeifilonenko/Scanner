package com.company;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
       int number  = scanner.nextInt();
        while (number != 777 && number!= 555) {
            System.out.println("Вы не угадали. Попробуйте еще раз");
            number = scanner.nextInt();
        }
        if(number == 777 || number == 555) {
            System.out.println("Бинго!!!");
        }


        }
    }

