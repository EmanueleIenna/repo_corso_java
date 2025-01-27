package org.example;


import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//Scrivi un programma in Java che:
//Legga una lista di numeri interi forniti dall'utente e li memorizzi in una <code>List</code> (ad
//esempio, ArrayList).
//Classifichi i numeri come "Pari" o "Dispari" utilizzando una <code>Map</code> con due chiavi: "Pari"
//e "Dispari".</li>
//Calcoli e stampi il numero più grande, il numero più piccolo e la media dei numeri.</li>
//Salvi i numeri originali, la classificazione e le statistiche in un file JSON chiamato
//<code>risultati.json</code>.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listNumeri = new ArrayList<>();
        Map<String, List<Integer>> mapNumeri = new HashMap<>();

        // Richiesta all'utente di digitare dei numeri
        System.out.println("Dimmi quanti numeri vuoi digitare: ");
        int numUtente = scanner.nextInt();
        int somma = 0;
        double media;

        // Ciclo per inserire i numeri nella Lista
        for (int i = 0; i < numUtente; i++) {
            System.out.println("Digita un numero: ");
            int numForniti = scanner.nextInt();
            listNumeri.add(numForniti);
            somma += numForniti;
        }

        // Ciclare la lista per scoprire il numero minimo e massimo
        media = (double) somma / numUtente;
        int nMax = listNumeri.get(0);
        for (Integer tuttaLaLista : listNumeri) {
            if (tuttaLaLista > nMax) {
                nMax = tuttaLaLista;
            }
        }
        int nMin = listNumeri.get(0);
        for (Integer tuttaLaLista : listNumeri) {
            if (tuttaLaLista < nMin) {
                nMin = tuttaLaLista;
            }
        }

        // Divisione nell'HashMap di numeri pari e dispari
        mapNumeri.put("Pari", new ArrayList<>());
        mapNumeri.put("Dispari", new ArrayList<>());

        for (Integer numeriLista : listNumeri) {
            if (numeriLista % 2 == 0) {
                mapNumeri.get("Pari").add(numeriLista);
            } else {
                mapNumeri.get("Dispari").add(numeriLista);
            }
        }
        for (Map.Entry<String, List<Integer>> entry : mapNumeri.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Media: " + media);
        System.out.println("Numero massimo: " + nMax);
        System.out.println("Numero minimo: " + nMin);

        Map<String, Object> risultati = new HashMap<>();
        risultati.put("Numeri originali", listNumeri);
        risultati.put("Pari", mapNumeri.get("Pari"));
        risultati.put("Dispari", mapNumeri.get("Dispari"));
        risultati.put("Media", media);
        risultati.put("Numero massimo", nMax);
        risultati.put("Numero minimo", nMin);


        try (FileWriter writer = new FileWriter("risultati.json")) {
            Gson gson = new Gson();
            gson.toJson(risultati, writer);
            System.out.println("Dati salvati con successo nel file risultati.json");
        } catch (IOException e) {
            System.err.println("Errore durante il salvataggio del file JSON: " + e.getMessage());
        }
    }
}
