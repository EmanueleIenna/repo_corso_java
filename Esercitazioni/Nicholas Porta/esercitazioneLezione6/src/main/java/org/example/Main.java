package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //creo e inizializzo studente
        Studente studente1 = new Studente("Mario Rossi", 20, 28.5);
        Studente studente2 = new Studente("Luisa Bianchi", 22, 30.0);
        Studente studente3 = new Studente("Giovanni Verdi", 19, 27.0);
        Studente studente4 = new Studente("Anna Neri", 21, 29.0);
        Studente studente5 = new Studente("Paolo Blu", 23, 25.0);
        Studente studente6 = new Studente("Carla Viola", 20, 26.5);
        //creo una mappa chiave valore dove inserisco studenti°
        //uso LinkedHashMap perche mi restituisce la mappa in modo ordinato
        HashMap<Integer, Studente> studenti = new LinkedHashMap<>();

        studenti.put(1, studente1);
        studenti.put(2, studente2);
        studenti.put(3, studente3);
        studenti.put(4, studente4);
        studenti.put(5, studente5);
        studenti.put(6, studente6);

        //con un ciclo e usando il kaySet itero solo tramite id
        //usando poi il .get restituisco i valori tramite id cosi da stamparli
        for (int id : studenti.keySet()) {
            System.out.print("Studente id: " + id + " ");
            System.out.println(studenti.get(id));


        }
    }
}