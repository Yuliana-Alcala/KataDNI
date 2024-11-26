package dev.katadni.controllers;

import dev.katadni.models.DniLetterModel;
import dev.katadni.models.DniModel;
import dev.katadni.views.DniView;

public class DniController {

    public DniController(){
        startProgram();
    }

    public static void startProgram(){
        int dniNumber = DniView.askNumberDni();
        DniModel dni = new DniModel(dniNumber);
        char letter = DniLetterModel.calculateLetterDni(dni);
        showsLetterDni(letter, dniNumber);

    }

    public static void showsLetterDni(char letter, int dniNumber) {
        DniView.showsLetterDni(letter, dniNumber);
        
    }

}
