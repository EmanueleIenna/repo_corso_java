package org.example;

import java.util.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;


public class Esercizi {


    public static List<Integer> leggiNumeriPerLista() {
        List<Integer> listaNumeri = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanti numeri vuoi inserire?");
        int quantiNum = 0;

        // Validazione input per il numero di elementi
        while (true) {
            try {
                quantiNum = sc.nextInt();
                if (quantiNum > 0) {
                    break;
                } else {
                    System.out.println("Inserisci un numero maggiore di 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Errore: Inserisci un numero valido.");
                sc.next(); //in caso di errore utente
            }
        }

        // Inserimento dei numeri nella lista
        while (listaNumeri.size() < quantiNum) {
            System.out.println("Inserisci un numero positivo:");
            try {
                int sceltaNumero = sc.nextInt();
                if (sceltaNumero > 0) {
                    listaNumeri.add(sceltaNumero);
                } else {
                    System.out.println("Numero non valido. Deve essere positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Errore: Inserisci un numero valido.");
                sc.next(); // in caso errore utente
            }
        }

        System.out.println("Hai inserito tutti i numeri.");
        return listaNumeri;
    }


    public static Map<String, List<Integer>> pariDispariConMap(List<Integer> lista) {

        Map<String, List<Integer>> mappaPariDispari = new HashMap<>();

        List<Integer> numeriPari = new ArrayList<>();
        List<Integer> numeriDispari = new ArrayList<>();

        for (int num : lista) {
            if (num % 2 == 0) {
                numeriPari.add(num);
            } else {
                numeriDispari.add(num);
            }
        }

        if (!numeriPari.isEmpty()) {
            mappaPariDispari.put("Pari", numeriPari);
        }
        if (!numeriDispari.isEmpty()) {
            mappaPariDispari.put("Dispari", numeriDispari);
        }

        return mappaPariDispari;
    }

    //Metodo per stampare la map
    public static void stampaMappa(Map<String, List<Integer>> mappa){

        List<Integer> numeriPari = mappa.get("Pari");
        List<Integer> numeriDispari = mappa.get("Dispari");

        if (numeriPari == null) {
            numeriPari = new ArrayList<>();
        }
        if (numeriDispari == null) {
            numeriDispari = new ArrayList<>();
        }

        System.out.println("Numeri Pari: ");

        for (int i : numeriPari){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Numeri Dispari: ");
        for (int i : numeriDispari){
            System.out.print(i + " ");
        }
        System.out.println();

    }

    //Controllo da fare dopo rimozione variabile risultato.
    public static double mediaMatematica(List<Integer> lista){
        double media = 0;
        for(int i : lista){
            media += i;
        }
        return media / lista.size();
    }

    //Maggiore
    public static int numMaggiore(List<Integer> lista){
        int numMagg = 0;
        for (int i : lista){

            if (i > numMagg) numMagg = i;
        }
        return numMagg;
    }

    public static int numMinore(List<Integer> lista){
        int numMin = Integer.MAX_VALUE;
        for (int i : lista){
            if (i < numMin) numMin = i;
        }
        return numMin;
    }

    public static void stampaListaEMapInJSON(List<Integer> lista, Map<String, List<Integer>> mappa) {

        //Pari e dispari presi dalla map passata (Esercizi.pariDispariConMap per usarla nel main)
        List<Integer> numeriPari = mappa.get("Pari");
        List<Integer> numeriDispari = mappa.get("Dispari");

        if (numeriPari == null) {
            numeriPari = new ArrayList<>();
        }
        if (numeriDispari == null) {
            numeriDispari = new ArrayList<>();
        }

        // Calcola le statistiche (media, numero maggiore e minore)
        double media = mediaMatematica(lista);
        int numeroMaggiore = numMaggiore(lista);
        int numeroMinore = numMinore(lista);

        // Crea la mappa per i dati da inserire nel file JSON
        Map<String, Object> analisi = new HashMap<>();
        analisi.put("numeroPiuGrande", numeroMaggiore);
        analisi.put("numeroPiuPiccolo", numeroMinore);
        analisi.put("media", media);

        // Crea la mappa per la classificazione dei numeri
        Map<String, List<Integer>> classificazione = new HashMap<>();
        classificazione.put("Pari", numeriPari);
        classificazione.put("Dispari", numeriDispari);

        /*
         TODO Struttura finale da inserire nel file JSON ordinata giusta (COSI NUMERI ORIGINALI è IN FONDO
         POSSIBILMENTE SENZA USARE LINKED HASH MAPS
         */
        Map<String, Object> datiAnalizzati = new HashMap<>();
        datiAnalizzati.put("numeriOriginali", lista);
        datiAnalizzati.put("analisi", analisi);
        datiAnalizzati.put("classificazione", classificazione);


        //TODO Gson per convertire la mappa in formato JSON con una visualizzazione leggibile (NON ANCORA ORIZZONTALI)
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonOutput = gson.toJson(datiAnalizzati);

        // Scrivi i dati nel file JSON
        try (FileWriter writer = new FileWriter("risultati_v2.json")) {
            gson.toJson(datiAnalizzati, writer);
            System.out.println("Dati salvati con successo in risultati_v2.json");
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura del file JSON: " + e.getMessage());
        }



    }




}
