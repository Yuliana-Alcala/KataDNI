package dev.katadni.views;

import java.util.Scanner;

public class DniView {

    private static Scanner scanner = new Scanner(System.in);

    public static String askNumberDni(){
        System.out.println("------------ Calculate Letter DNI ------------");
        System.out.println("Enter the DNI number");
        return scanner.nextLine();

    }

    public static void showsLetterDni(String letterDni){
        System.out.println("letter DNI");

    }

}
