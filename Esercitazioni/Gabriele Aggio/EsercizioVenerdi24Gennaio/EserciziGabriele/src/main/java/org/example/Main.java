package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Legge la lista dei numeri dall'utente
        List<Integer> lista = Esercizi.leggiNumeriPerLista();

        // Stampa i numeri inseriti
        System.out.println("Numeri inseriti:");
        for (int i : lista) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Stampo mappa divisa in pari e dispari
        Esercizi.stampaMappa(Esercizi.pariDispariConMap(lista));

        //Stampo la media matematica, il numero maggiore ed il numero minore.
        System.out.println("Media matematica della lista: " + Esercizi.mediaMatematica(lista));
        System.out.println("Numero Maggiore: " + Esercizi.numMaggiore(lista));
        System.out.println("Numero Minore: " + Esercizi.numMinore(lista));

        //Creo il file JSON
        Esercizi.stampaListaEMapInJSON(lista, Esercizi.pariDispariConMap(lista));



    }
}