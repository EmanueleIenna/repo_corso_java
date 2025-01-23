package Calcolatrice;

/**
 * Classe: Operazioni
 *
 * Desrizione:
 * Questa classe ha dei metodi che eseguono le operazioni matematiche di base:
 * - Somma
 * - Sottrazione
 * - Moltiplicazione
 * - Divisione
 * - Modulo (resto della divisione)
 *
 * Ogni metodo prende deu numeri (double) e restituisce un risultato come
 * double.
 * Se c'è un errorem, come la divisione o il modulo per zero, viene lanciata
 * un'eccezione.
 *
 * Metodi:
 * 1. somma(double a, double b):
 * Fa la somma di due numeri.
 *
 * 2. sottrazione(double a, double b):
 * Fa la sottrazione di due numeri.
 *
 * 3. moltiplicazione(double a, double b):
 * Fa la moltiplicazione di due numeri.
 *
 * 4. divisione(double a, double b):
 * Fa la divisione tra due numeri. Se il secondo numero è zero, lancia un
 * errore.
 *
 * 5. modulo(double a, double b):
 * Restituice il resto della divisione tra due numeri. Se il secondo numro è
 * zero, lancia un errore.
 *
 * Esempio di utilizzo:
 * ...
 * double risultato = Operazioni.somma(5.0, 3.0); // risultato = 8.0
 * double risultato2 = Operazioni.divisione(10.0, 2.0); // risultato2 = 5.0
 * ...
 *
 * Gestione degli errori:
 * - Se provi a dividere o fare il modulo per zero, il programma lancerà un
 * errore (`ArithmeticException`).
 * Puoi prenderlo con un `try-catch` se vuoi gestirlo nel tuo codice.
 */

public class Operazioni {

    /**
     * Metodo per calcolare la somma di due numeri.
     *
     * @param a Il primo operando.
     * @param b Il secondo operando.
     * @return La somma di a e b.
     */
    public static double somma(double a, double b) {
        return a + b; // Restituisce il risultato della somma.
    }

    /**
     * Metodo per calcolare la sottrazione di due numeri.
     *
     * @param a Il primo operando.
     * @param b Il secondo operando.
     * @return La differenza tra a e b.
     */
    public static double sottrazione(double a, double b) {
        return a - b; // Restituisce il risultato della sottrazione.
    }

    /**
     * Metodo per calcolare la moltiplicazione di due numeri.
     *
     * @param a Il primo operando.
     * @param b Il secondo operando.
     * @return Il prodotto di a e b.
     */
    public static double moltiplicazione(double a, double b) {
        return a * b; // Restituisce il risultato della moltiplicazione.
    }

    /**
     * Metodo per calcolare la divisione tra due numeri.
     * Gestisce il caso di divisione per zero lanciando un'eccezione.
     *
     * @param a Il dividendo.
     * @param b Il divisore.
     * @return Il risultato della divisione a / b.
     * @throws ArithmeticException Se il divisore b è uguale a zero.
     */
    public static double divisione(double a, double b) {
        if (b == 0) {
            // Lancia un'eccezione se il divisore è zero.
            throw new ArithmeticException("Errore: divisione per zero!");
        }
        return a / b; // Restituisce il risultato della divisione.
    }

    /**
     * Metodo per calcolare il resto della divisione (modulo) tra due numerre
     * Gestisce il caso di modulo per zero lanciando un'eccezione.
     *
     * @param a Il dividendo.
     * @param b Il divisore.
     * @return Il resto della divisione a % b.
     * @throws ArithmeticException Se il divisore b è uguale a zero.
     */
    public static double modulo(double a, double b) {
        if (b == 0) {
            // Lancia un'eccezione se il divisore è zero.
            throw new ArithmeticException("Errore: modulo per zero!");
        }
        return a % b; // Restituisce il risultato del modulo.
    }
}
