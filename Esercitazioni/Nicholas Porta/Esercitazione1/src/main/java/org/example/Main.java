package org.example;

import org.ietf.jgss.GSSContext;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // chiedo all'utente quanti numeri vuole inserire
        Scanner scanner = new Scanner(System.in);
        System.out.println("quanti numeri vuoi inserire?");
        int numero = scanner.nextInt();

        //creo una lista per salvare i numeri
        List<Integer> numeriInseriti = new ArrayList<>();
        System.out.println("inserisci i numeri");

        //qui  salvo i numeri
        for (int i = 0; i < numero; i++) {
            int num = scanner.nextInt();
            //li inserisco nella lista
            numeriInseriti.add(num);
        }
        System.out.println("I numeri inseriti sono:");
        for (int num : numeriInseriti) {
            System.out.println(num);
        }

        //creo un amppa chiave valore  dove aggiungo i pari e dispari
        Map<String, List<Integer>> calcolo = new HashMap<>();
        calcolo.put("Pari", new ArrayList<>());
        calcolo.put("Dispari", new ArrayList<>());

        //qui ciclo per verificare se sono pari e dispari
        for (int num : numeriInseriti) {
            //con questo  %2 se restituisce 0 e paro altrimeni 1 è disparo e li aggiungo nella loro lista
            if (num % 2 == 0) {
                calcolo.get("Pari").add(num);
                System.out.println("Il numero " + num + " è pari.");
            } else {
                calcolo.get("Dispari").add(num);
                System.out.println("Il numero " + num + " è dispari.");
            }
        }
        // creo delle variabili per andare a calcolare max,min e la media
        //anche la variabile somma per andare a sommare tutti i numeri per poi dividerli
        int nMax = numeriInseriti.get(0);
        int nMin = numeriInseriti.get(0);
        int nMedia = 0;
        int somma = 0;
       // qui il ciclo mi sostituisce ogni qualvolta trova un numero piu grande e piu piccolo e aggiorna il tutto
        for (int num : numeriInseriti) {
            if (num > nMax) {
                nMax = num;
            }
            if (num < nMin) {
                nMin = num;
            }

            somma = somma + num;
        }
        nMedia = somma / numeriInseriti.size();

        // qui stampo per far vedere all'utente i risulati opttenuti
        System.out.println("massimo " + nMax);
        System.out.println("minimo " + nMin);
        System.out.println("la media è " + nMedia);
        // creo una mappa con string , object cosi da salvare qualsiasi tipo di dato
        Map<String, Object> risultati = new HashMap<>();
        risultati.put("numeri_inseriti", numeriInseriti);
        risultati.put("pari", calcolo.get("Pari"));
        risultati.put("dispari", calcolo.get("Dispari"));
        risultati.put("massimo", nMax);
        risultati.put("minimo", nMin);
        risultati.put("media", nMedia);

        // qui creo un oggetto gson
        Gson gson = new Gson();
        String json = gson.toJson(risultati);

        // con il filewriter vado a creare/modificare il file risultati.json
        try (FileWriter writer = new FileWriter("risultati.json")) {
            writer.write(json);
            System.out.println("Risultati salvati in 'risultati.json'.");
        } catch (IOException e) {
            System.out.println("Errore durante la scrittura del file: " + e.getMessage());
        }
    }
}