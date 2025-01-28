package it.dst.formazione.studenti.maurosiciliano.esercitazione1;

import java.util.Scanner;

public class PariDispari {

        public static void separatore() {

        Scanner immissionenumeri = new Scanner(System.in);

        System.out.println("inserisci 5 numeri:");
        int numero1 = immissionenumeri.nextInt();
        int numero2 = immissionenumeri.nextInt();
        int numero3 = immissionenumeri.nextInt();
        int numero4 = immissionenumeri.nextInt();
        int numero5 = immissionenumeri.nextInt();

        System.out.println("i numeri inseriti sono: " + numero1 + " " + numero2 + " " + numero3 + " " + numero4 + " " + numero5);

        if (numero1 % 2 == 0) {
            System.out.println("Il numero " +numero1+ " e' pari\n");
        } else
            System.out.println("Il numero "+numero1+ " e' dispari\n");

        if (numero2 % 2 == 0) {
            System.out.println("Il numero " +numero2+ " e' pari\n");
        } else
            System.out.println("Il numero "+numero2+ " e' dispari\n");

        if (numero3 % 2 == 0) {
            System.out.println("Il numero " +numero3+ " e' pari\n");
        } else
            System.out.println("Il numero "+numero3+ " e' dispari\n");

        if (numero4 % 2 == 0) {
            System.out.println("Il numero " +numero4+ " e' pari\n");
        } else
            System.out.println("Il numero "+numero4+ " e' dispari\n");

        if (numero5 % 2 == 0) {
            System.out.println("Il numero " +numero5+ " e' pari\n");
        } else
            System.out.println("Il numero "+numero5+ " e' dispari\n");


    }
}