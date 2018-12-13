package com.company;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class test {
    public static void main(String[] args) throws Exception{
        List<String> list = Files.readAllLines(Paths.get("file.txt"));
        for(String item: list) {
            System.out.println(item.length());


        }
    }
}
