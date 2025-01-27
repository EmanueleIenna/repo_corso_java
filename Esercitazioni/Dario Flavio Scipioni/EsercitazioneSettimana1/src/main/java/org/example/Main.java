package org.example;


import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> listaNumeri = new ArrayList<>() ;
        Map<String, List<Integer>> map = new HashMap<>();

        System.out.println("Inserisci 5 numeri da aggiungere alla lista!");
        for(int i=0; i<5; i++){
            int numeroDaInserire = scanner.nextInt();
            listaNumeri.add(numeroDaInserire) ;
        }


        List<Integer> listaPari = new ArrayList<>();
        List<Integer> listaDispari = new ArrayList<>();
        int somma= 0;
        int media= 0;
        int temporanea= 0;

        System.out.println("La tua lista è composta da " );
        for(int inserito:listaNumeri){
            if(inserito %2 == 0){
                listaPari.add(inserito);
                map.put("Pari", listaPari);
            }
            else {
                listaDispari.add(inserito);
                map.put("Dispari", listaDispari);
            }
            temporanea++;
            somma=inserito+somma;
            media=somma/temporanea;
            System.out.println(" " +inserito);
        }

        int grande = listaNumeri.get(0);
        for(int j=0; j<listaNumeri.size(); j++){
            if(grande<listaNumeri.get(j)){
                grande=listaNumeri.get(j);
            }
        }

        int piccolo= listaNumeri.get(0);
        for(int k=0; k<listaNumeri.size(); k++){
            if(piccolo>listaNumeri.get(k)){
                piccolo=listaNumeri.get(k);
            }
        }

        System.out.println("Numeri inseriti: " + listaNumeri);
        System.out.println("Numeri pari inseriti: " + listaPari);
        System.out.println("Numeri dispari inseriti: " + listaDispari);
        System.out.println("La somma dei numeri inseriti è: " +somma);
        System.out.println("La media dei numeri inseriti è: " + media);
        System.out.println("Il numero più grande della lista è: " +grande);
        System.out.println("Il numero più piccolo della lista è: " +piccolo);

        // Struttura dati per il salvataggio
        Map datiAnalizzati = new HashMap<>();
        datiAnalizzati.put("listaNumeri", listaNumeri);

        // Scrivi i dati in un file JSON
        try (FileWriter writer = new FileWriter("risultati.json")) {
            Gson gson = new Gson();
            gson.toJson(datiAnalizzati, writer);
            System.out.println("Dati salvati con successo in risultati.json");
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura del file JSON: " + e.getMessage());
        }
    }
}