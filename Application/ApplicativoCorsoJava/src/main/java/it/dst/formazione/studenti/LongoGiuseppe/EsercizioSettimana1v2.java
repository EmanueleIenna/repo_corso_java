package it.dst.formazione.studenti.LongoGiuseppe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EsercizioSettimana1v2 {

    public static void inserimento_manuale() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeri = new ArrayList<>();
        int somma = 0;
        int numeroPiuGrande = Integer.MIN_VALUE;
        int numeroPiuPiccolo = Integer.MAX_VALUE;
        ArrayList<Integer> numeriPari = new ArrayList<>();
        ArrayList<Integer> numeriDispari = new ArrayList<>();

        while (true) {
            System.out.print("Inserisci un numero (0 per terminare): ");

            try {
                int numero = scanner.nextInt();

                // Condizione ciclo
                if (numero == 0) {
                    break;
                }

                numeri.add(numero);
                somma += numero;

                // Numero più grande
                if (numero > numeroPiuGrande) {
                    numeroPiuGrande = numero;
                }

                // Numero più piccolo
                if (numero < numeroPiuPiccolo) {
                    numeroPiuPiccolo = numero;
                }

                // Pari e dispari
                if (numero % 2 == 0) {
                    numeriPari.add(numero);
                } else {
                    numeriDispari.add(numero);
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("Puoi inserire solo numeri!");
                scanner.nextLine(); // Pulizia scanner
            }
        }

        //  media
        double media = somma / (double) numeri.size();

        // Visualizzazione risultati
        System.out.println("Numero più grande: " + numeroPiuGrande);
        System.out.println("Numero più piccolo: " + numeroPiuPiccolo);
        System.out.println("Media: " + media);
        System.out.println("Numeri pari: " + numeriPari);
        System.out.println("Numeri dispari: " + numeriDispari);

        // Creazione JSON
        try {
            ObjectMapper mapper = new ObjectMapper();

            HashMap<String, Object> jsonAnalisi = new HashMap<>();

            // Numeri originali
            jsonAnalisi.put("numeriOriginali", numeri);

            // Analisi
            HashMap<String, Object> analisiObj = new HashMap<>();
            analisiObj.put("numeroPiuGrande", numeroPiuGrande);
            analisiObj.put("numeroPiuPiccolo", numeroPiuPiccolo);
            analisiObj.put("media", media);
            jsonAnalisi.put("analisi", analisiObj);

            // Risultato esercitazione settimana
            HashMap<String, Object> risultatoSettimanaObj = new HashMap<>();
            risultatoSettimanaObj.put("info", "risultato esercitazione settimana 20-1-25");
            jsonAnalisi.put("Risultati esercitazioni ", risultatoSettimanaObj);

            // Classificazione
            HashMap<String, Object> classificazioneObj = new HashMap<>();
            classificazioneObj.put("Pari", numeriPari);
            classificazioneObj.put("Dispari", numeriDispari);
            jsonAnalisi.put("classificazione", classificazioneObj);

            // Scrittura su file
            mapper.writerWithDefaultPrettyPrinter().writeValue(
                    new File("src/main/java/it/dst/formazione/studenti/LongoGiuseppe/risultato_esercitazione_settimana_1.json"),
                    jsonAnalisi
            );
            System.out.println("File JSON creato con successo con il nome 'risultato esercitazione settimana 1.json'!");

        } catch (IOException e) {
            System.out.println("Errore nella creazione del file JSON: " + e.getMessage());
        }

        // Somma dei numeri pari
        int sumPari = 0;
        for (int numero : numeriPari) {
            sumPari += numero;
        }
        System.out.println("Somma dei numeri pari: " + sumPari);

        // Somma dei numeri dispari
        int sumDispari = 0;
        for (int numero : numeriDispari) {
            sumDispari += numero;
        }
        System.out.println("Somma dei numeri dispari: " + sumDispari);

        System.out.println("Lunghezza lista dei numeri pari: " + numeriPari.size());
        System.out.println("Lunghezza lista dei numeri dispari: " + numeriDispari.size());

        // Somma delle lunghezze
        int sommaIndici = numeriPari.size() + numeriDispari.size();
        System.out.println("Somma delle lunghezze delle liste di numeri pari e dispari: " + sommaIndici);
    }
}
