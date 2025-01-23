package org.example;

import java.util.Scanner;

public class InserisciElementi {

    public static void test_inserisciNumeriInteri(){
        Scanner scanner = new Scanner(System.in);
        int somma=0;
        int media=0;


        for(int i=1; i<=5; i++) {

            System.out.println("Inserisci elemento: ");
            int elemento = scanner.nextInt();
            somma = somma+elemento;
            media = somma/i;
            System.out.println("Elemento inserito: " + elemento);
            System.out.println("La somma degli elementi è: " + somma);




        }
        System.out.println("La media degli elemeenti inseriti fino ad ora è : " + media);



    }

}
