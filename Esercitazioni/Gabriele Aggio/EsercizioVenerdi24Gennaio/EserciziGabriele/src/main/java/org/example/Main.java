package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Esercizi ex = new Esercizi();
        List<Integer> lista = new ArrayList<>();

        while (true){
            try {
                for(int i : ex.leggiNumeriPerLista()){
                    System.out.print(i + " ");
                    lista.add(i);
                }
                break;
            } catch (InputMismatchException exception){
                System.out.println("Errore di inserimento");
            }
        }
        System.out.println();
        Map<List<Integer>, List<Integer>> mappa = ex.pariDispariConMap(lista);
        ex.stampaMappa(mappa);
        System.out.println("Media matematica della lista: " + Esercizi.mediaMatematica(lista));
        System.out.println("Numero Maggiore: " + Esercizi.numMaggiore(lista));
        System.out.println("Numero Minore: " + Esercizi.numMinore(lista));

        Esercizi.stampaListaEMapInJSON(lista, mappa);



    }
}