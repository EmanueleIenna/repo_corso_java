package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


      /*
      Chiedi all'utente di inserire il numero di elementi.
      Utilizza un ciclo for per leggere i numeri e calcolare la somma.
      Calcola la media e stampala a schermo. */
        Collection<Integer> userNumbers = getUserInputs();

        System.out.println("la media di: " + userNumbers + " è: " + getAverageValue(userNumbers));

    }

    public static int getAverageValue(Collection<Integer> numbersToIterate){
        int result = 0;
        int numbersCounter = 0;
        for (Integer i : (ArrayList<Integer>) numbersToIterate) {
            result += i;
            numbersCounter++;
        }
        return result / numbersCounter;
    }

    public static Collection<Integer> getUserInputs(){
        Collection<Integer> userChoices = new ArrayList<>();
        while (true) {
            System.out.println("insert a number or write exit to end program");
            Object obj = inputGather();
            if (obj.getClass().toString().equalsIgnoreCase("class java.lang.Integer")){
                userChoices.add((Integer) obj);
            } else {
                if (obj.toString().equalsIgnoreCase("exit")){
                    break;
                }
                System.out.println("cannot add string to list");
            }
            System.out.println("chosed numbers are: ");
            System.out.println(userChoices);
        }
        return userChoices;
    }

    public static Object inputGather(){
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        if (isNumeric(userInput)){
            return Integer.parseInt(userInput);
        } else {
            return userInput;
        }
    }

    public static boolean isNumeric(String strNum) {
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
}