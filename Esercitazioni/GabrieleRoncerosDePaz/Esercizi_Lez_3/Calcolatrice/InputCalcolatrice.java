package Calcolatrice;

import java.util.Scanner;

/**
 * La classe InputCalcolatrice gestisce l'acquisizione e la validazione degli
 * input dell'utente
 * per un'applicazione calcolatrice. Fornisce metodi per leggere numeri
 * decimali o interi
 * e per selezionare un'operazione da un menu.
 */
public class InputCalcolatrice {

    /**
     * Metodo per leggere un numero (intero o decimale) dall'utente.
     * Accetta input con punto o virgola come separatore decimale e ignora eventuali
     * spazi superflui.
     *
     * @param scanner Oggetto Scanner utilizzato per leggere l'input dalla console.
     * @return Un numero di tipo double, convertito dall'input dell'utente.
     */
    public static double leggiNumero(Scanner scanner) {
        while (true) { // Ciclo infinito finché l'utente non inserisce un input valido.
            try {
                // Legge l'intero input come stringa
                String input = scanner.nextLine();

                // Rimuove eventuali spazi iniziali o finali
                input = input.trim();

                // Sostituisce la virgola (',') con il punto ('.'), rendendo il formato
                // compatibile
                input = input.replace(",", ".");

                // Converte la stringa elaborata in un numero double.
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                // Gestisce l'errore se l'input non è un numero valido
                System.out.println("Errore: inserire un numero intero o decimale valido. Riprova:");
            }
        }
    }

    /**
     * Metodo per leggere l'operazione scelta dall'utente.
     * L'utente deve inserire un numero intero compreso tra 1 e 5, altrimenti viene
     * richiesto di riprovare.
     *
     * @param scanner Oggetto Scanner utilizzato per leggere l'input dalla console.
     * @return Un numero intero che rappresenta l'operazione scelta (1-5).
     */
    public static int leggiOperazione(Scanner scanner) {
        while (true) { // Ciclo infinito finché l'utente non inserisce un input valido.
            try {
                // Legge l'input come un numero intero
                int scelta = scanner.nextInt();

                // Controlla che il numero inserito sia compreso tra 1 e 5
                if (scelta >= 1 && scelta <= 5) {
                    return scelta; // Ritorna il numero se è valido
                } else {
                    System.out.println("Errore: scegli un numero tra 1 e 5. Riprova:");
                }
            } catch (Exception e) {
                // Gestisce l'errore se l'input non è un numero valido
                System.out.println("Errore: inserisci un numero valido per l'operazione. Riprova:");
                scanner.next(); // Pulisce l'input non valido, evitando un loop infinito
            }
        }
    }
}
