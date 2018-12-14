package com.company;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class qqq {
    private static String power;
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (true) {
            power = s.next();
            if (reg(power)) {
                break;
            }
            else {
                System.out.println("Try again input only digits and comma");
            }

        }

    }

    static boolean reg(String S) {

        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(S);

        return m.matches();
    }

}
