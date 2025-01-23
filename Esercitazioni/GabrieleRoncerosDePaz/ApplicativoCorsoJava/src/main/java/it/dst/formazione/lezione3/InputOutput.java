package it.dst.formazione.lezione3;

import java.util.Scanner;

public class InputOutput {

    public static void test_inputoutput() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        System.out.print("\nInserisci la tua età: ");
        // uso del parseInt per evitare possibili errori
        int eta = Integer.parseInt(scanner.nextLine());

        System.out.print("\nscrivimi un numero intero");
        int numeraccio = Integer.parseInt(scanner.nextLine());

        System.out.println(
                String.format("\nCiao %s. Hai %d anni.\nPoi hai inserito questo numeraccio senza valore %d", nome,
                        eta, numeraccio));
        // aggiunta la chiusura dello scanner
        scanner.close();
    }
}
