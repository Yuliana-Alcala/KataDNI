package dev.katadni.controllers;

import dev.katadni.models.DniLetterModel;
import dev.katadni.models.DniModel;
import dev.katadni.views.DniView;

public class DniController {

    public DniController(){
        startProgram();
    }

    public static void startProgram(){
        String dniNumber = DniView.askNumberDni();
        DniModel dni = new DniModel(dniNumber);
        DniLetterModel.calculateLetterDni(dni);
        //showsLetterDni();

    }
}
