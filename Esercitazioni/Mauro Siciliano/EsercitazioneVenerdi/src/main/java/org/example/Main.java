package org.example;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 10 20 15 14 1
        Scanner scanner = new Scanner(System.in);


        System.out.println("inserisci numeri interi separati da uno spazio");

        String numeriUtente = scanner.nextLine();
        // numeriUtente sarà = "10 20 15 14 1"


        String[] numeriSeparati = numeriUtente.split(" ");
        // [0] = "10"
        // [1] = "20"
        // Data la lista dei numeri inseriti
        //prendo il singolo numero e lo trasformo in intero
        //e lo aggiungo all lista numeri
        ArrayList<Integer> numeri = new ArrayList<Integer>();


        for (String convertitore : numeriSeparati) {
            numeri.add(Integer.parseInt(convertitore));
        }
        // [0] = 10
        // [1] = 20


        ArrayList<Integer> numeriPari = new ArrayList<>();
        ArrayList<Integer> numeriDispari = new ArrayList<>();

        // for(inizializzazione; condizione; incremento) {// ...}
        int media = 0;
        int somma = 0;
        int piuGrande = numeri.get(0);
        int piuPiccolo = numeri.get(0);

        // .size percorre l'array list per intero
        // numeri.size fa capire da quale array o arrayList il ciclo for serve per percorrerlo
        // numeri.size = tutto l'array

        for (int indiceArray = 0; indiceArray < numeri.size(); indiceArray++) {
            if (numeri.get(indiceArray) % 2 == 0) {
                numeriPari.add(numeri.get(indiceArray));
            } else {
                numeriDispari.add(numeri.get(indiceArray));
            }
            somma = somma + numeri.get(indiceArray);

            if (piuGrande < numeri.get(indiceArray)) {
                piuGrande = numeri.get(indiceArray);
            }
            if (piuPiccolo > numeri.get(indiceArray)) {
                piuPiccolo = numeri.get(indiceArray);
            }


        }

        media = somma / numeri.size();

        HashMap<String, ArrayList<Integer>> mappaNumeri = new HashMap<>();

        mappaNumeri.put("Numeri Pari", numeriPari);
        mappaNumeri.put("Numeri Dispari", numeriDispari);

        String dettaglio = " media " + media + " piu grande "+ piuGrande + " piu piccolo " + piuPiccolo;

        for (String chiave : mappaNumeri.keySet()) {
            System.out.println(chiave + ": " + mappaNumeri.get(chiave));

        }
        System.out.println("media: " + media);
        System.out.println("piu grande: " + piuGrande);
        System.out.println("piu piccolo " + piuPiccolo);

        // creo una mappa per inserire tutti i dati
        Map<String , Object > tuttiIDati = new HashMap<>();
        tuttiIDati.put("numeri", numeri);
        tuttiIDati.put("Dettaglio", dettaglio);
        tuttiIDati.put("Pari", numeriPari);
        tuttiIDati.put("Dispari", numeriDispari);

        Gson gson = new Gson();

        String json = gson.toJson(tuttiIDati);

        // con il filewriter vado a creare/modificare il file risultati.json
        try (FileWriter writer = new FileWriter("risultati.json")) {
            writer.write(json);
            System.out.println("Risultati salvati in 'risultati.json'.");
        } catch (IOException e) {
            System.out.println("Errore durante la scrittura del file: " + e.getMessage());
        }



    }

}