package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class JsonWriter {
    public static String mostraRisultati(List<Integer>listaNumeri, Map<String, List<Integer>> map, int somma, int media, int grande, int piccolo){
        String dettaglio = "";
        dettaglio+=("Numeri inseriti: " + listaNumeri);
        dettaglio+=("Numeri pari inseriti: " + map.get("Pari"));
        dettaglio+=("Numeri dispari inseriti: " + map.get("Dispari"));
        dettaglio+=("La somma dei numeri inseriti è: " +somma);
        dettaglio+=("La media dei numeri inseriti è: " + media);
        dettaglio+=("Il numero più grande della lista è: " +grande);
        dettaglio+=("Il numero più piccolo della lista è: " +piccolo);

        System.out.println(dettaglio);

        return dettaglio;
    }
    public static void scriviJson(String dettaglio){

        try (FileWriter writer = new FileWriter("risultati.json")) {

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            //scrivi questa riga invece di
            //Gson gson = new Gson();

            //Gson gson = new Gson();
            gson.toJson(dettaglio, writer);
            System.out.println("Dati salvati con successo in risultati.json");
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura del file JSON: " + e.getMessage());
        }
    }

}
