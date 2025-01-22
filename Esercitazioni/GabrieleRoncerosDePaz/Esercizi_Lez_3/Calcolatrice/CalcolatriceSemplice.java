package Calcolatrice;

import java.util.Scanner;

/**
 * Classe: CacolatriceSemplice
 * Scopo: Permette all'utente di eseguire operazioni matematiche di base
 * (somma, sottrzione, moltiplicazione, divisione, modulo).
 *
 * Funzionamento:
 * 1. L'utente inserisce due numeri (accettati sia come interi che decimali).
 * 2. L'utente sceglie un'operazione tra quelle disponibili:
 * - Somma
 * - Sottrazione
 * - Moltiplicazione
 * - Divisione
 * - Modulo
 * 3. Viene calcolato il risultato e mostrato a schermo.
 *
 * Gestione degli errori:
 * - Input non numerico: il programma richiede di reinserire un valore valido.
 * - Divisione/modulo per zero: viene lanciata un'eccezione gestita con un
 * messaggio d'errore.
 *
 * Dipendenze:
 * - Classe InputCalcolatrice per la gestione dell'input utente.
 * - Classe Operazioni che implementa i metodi delle operazioni matematiche.
 */

public class CalcolatriceSemplice {
    public static void main(String[] args) {
        // Creazione di un oggetto Scanner per leggere l'input dell'utente.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto nella Calcolatrice Semplice!");

        // Lettura del primo numero dall'utente.
        System.out.println("Inserisci il primo numero:");
        double numero1 = InputCalcolatrice.leggiNumero(scanner);

        // Lettura del secondo numero dall'utente.
        System.out.println("Inserisci il secondo numero:");
        double numero2 = InputCalcolatrice.leggiNumero(scanner);

        // Mostra il menu delle operazioni disponibili e chiede all'utente di scegliere.
        System.out.println("Scegli un'operazione:");
        System.out.println("1. Somma (+)");
        System.out.println("2. Sottrazione (-)");
        System.out.println("3. Moltiplicazione (*)");
        System.out.println("4. Divisione (/)");
        System.out.println("5. Modulo (%)");

        // Lettura della scelta dell'utente.
        int scelta = InputCalcolatrice.leggiOperazione(scanner);

        // Variabile per salvare il risultato dell'operazione.
        double risultato = 0;

        // Gestione delle operazioni con il costrutto switch.
        try {
            switch (scelta) {
                case 1:
                    // Esegue la somma.
                    risultato = Operazioni.somma(numero1, numero2);
                    break;
                case 2:
                    // Esegue la sottrazione.
                    risultato = Operazioni.sottrazione(numero1, numero2);
                    break;
                case 3:
                    // Esegue la moltiplicazione.
                    risultato = Operazioni.moltiplicazione(numero1, numero2);
                    break;
                case 4:
                    // Esegue la divisione.
                    // Se numero2 è 0, verrà lanciata un'eccezione gestita nel blocco catch.
                    risultato = Operazioni.divisione(numero1, numero2);
                    break;
                case 5:
                    // Esegue l'operazione modulo.
                    // Se numero2 è 0, verrà lanciata un'eccezione gestita nel blocco catch.
                    risultato = Operazioni.modulo(numero1, numero2);
                    break;
                default:
                    // Gestisce il caso in cui l'utente inserisca un'operazione non valida.
                    System.out.println("Operazione non valida!");
                    return; // Termina il programma.
            }
            // Stampa il risultato dell'operazione.
            System.out.println("Risultato: " + risultato);
        } catch (ArithmeticException e) {
            // Gestisce eventuali errori matematici, come divisione per zero.
            System.out.println(e.getMessage());
        }
    }
}
