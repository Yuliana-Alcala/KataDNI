package dev.katadni.views;

import java.util.Scanner;

public class DniView {

    private static Scanner scanner = new Scanner(System.in);

    public static int askNumberDni(){

        System.out.println("------------ Calculate Letter DNI ------------");
        System.out.println("Enter the DNI number");
        
        return scanner.nextInt();

    }

    public static void showsLetterDni(char letterDni, int dni){
        System.out.println("--------------------------------");
        System.out.println("The DNI letter is: " + letterDni);
        System.out.println("The Full Identification number is: " + letterDni+dni);
    
    }

}
