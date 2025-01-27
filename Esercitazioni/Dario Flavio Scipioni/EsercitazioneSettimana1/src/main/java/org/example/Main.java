package org.example;


import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> listaNumeri = InputReader.getNumberList(System.in, 3);

        List <Integer> listaPari = new ArrayList<>();
        List<Integer> listaDispari = new ArrayList<>();

        int somma= 0;
        int media= 0;

        int grande = listaNumeri.get(0);
        int piccolo = listaNumeri.get(0);

        System.out.println("La tua lista è composta da " );
        Map<String, List<Integer>> map = new HashMap<>();
        for(int k=0; k<listaNumeri.size(); k++){

            int numeroCorrente = listaNumeri.get(k);
            if(Calculate.isPari(numeroCorrente)){
                listaPari.add(numeroCorrente);
                map.put("Pari", listaPari);
            }
            else if (Calculate.isDispari(numeroCorrente)){
                listaDispari.add(numeroCorrente);
                map.put("Dispari", listaDispari);
            }
            if (grande < listaNumeri.get(k)) {
                grande = listaNumeri.get(k);

            } else if (piccolo > listaNumeri.get(k)) {
                piccolo = listaNumeri.get(k);

            }

            somma=listaNumeri.get(k)+somma;
            media=somma/(k+1);
            System.out.println(" " +listaNumeri.get(k));
        }

        System.out.println("Numeri inseriti: " + listaNumeri);
        System.out.println("Numeri pari inseriti: " + listaPari);
        System.out.println("Numeri dispari inseriti: " + listaDispari);
        System.out.println("La somma dei numeri inseriti è: " +somma);
        System.out.println("La media dei numeri inseriti è: " + media);
        System.out.println("Il numero più grande della lista è: " +grande);
        System.out.println("Il numero più piccolo della lista è: " +piccolo);

        // Struttura dati per il salvataggio
       String dettaglio = JsonWriter.mostraRisultati(listaNumeri,map, somma, media,grande,piccolo);

        // Scrivi i dati in un file JSON
        JsonWriter.scriviJson(dettaglio);

    }
}