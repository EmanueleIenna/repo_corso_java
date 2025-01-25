package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class InputManager {

// l'utente deve scrivere exit per uscirne
// prende solo stringhe dall'utente e le converte solo se possibile
// un console log fa controllare quali numeri l'utente ha scelto
public Collection<Integer> getInputsFromUser(){
    Scanner input = new Scanner(System.in);
    Collection<Integer> userNumbers = new ArrayList<>();
    while(true){
        System.out.println(InputPrompt.START.message);
        String obj = input.nextLine();
        if (isInputANumber(obj)){
            userNumbers.add(Integer.parseInt(obj));
        } else {
            if (obj.equalsIgnoreCase("exit")){
                break;
            }
            System.out.println(InputPrompt.REQUIRENUMBER.message);
        }
        System.out.println(userNumbers);
    }
    input.close();
    return userNumbers;
}

// userò questo metodo per prendere dall'utente solo stringhe e determinare quale di esse è un numero
public boolean isInputANumber(String strNum){

        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
}
// ho pensato di raggruppare i prompt che legge l'utente sotto un enum in modo da usarne
// i messaggi all'occorrenza
private enum InputPrompt{

    START("inserisci un numero o premi exit per uscire"),
    REQUIRENUMBER("input stringa non valido");

    public String message;

    InputPrompt(String message){
        this.message = message;
    }
}




}
