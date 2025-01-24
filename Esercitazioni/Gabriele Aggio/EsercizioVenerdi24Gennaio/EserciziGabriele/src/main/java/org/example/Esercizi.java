package org.example;

import java.util.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;


public class Esercizi {

    List<Integer> listaNumeri = new ArrayList<>();
//    String PARI = "Pari";
//    String DISP = "Dispari";

    //Metodo per leggere i numeri dall'utente ed inserirli in una lista.
    public List<Integer> leggiNumeriPerLista(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanti Numeri vuoi inserire?");
        int quantiNum = sc.nextInt();

        while(listaNumeri.size() < quantiNum){

            System.out.println("Inserisci un numero: ");
            int sceltaNumero = sc.nextInt();

            if(sceltaNumero > 0){
                listaNumeri.add(sceltaNumero);
            } else {
                System.out.println("Seleziona un numero valido: ");
            }
        }
        System.out.println();

        return listaNumeri;
    }

    //Metodo per leggere la lista e dividere pari e dispari
    public Map<List<Integer>, List<Integer>> pariDispariConMap(List<Integer> lista){
        Map<List<Integer>, List<Integer>> mappaPariDispari = new HashMap<>();

        List<Integer> numeriPari = new ArrayList<>();
        List<Integer> numeriDispari = new ArrayList<>();

        for(int num : lista){
            if(num % 2 == 0){
                numeriPari.add(num);
            } else {
                numeriDispari.add(num);
            }
        }
        mappaPariDispari.put(numeriPari, numeriDispari);

        return mappaPariDispari;
    }

    //Metodo per stampare la map
    public void stampaMappa(Map<List<Integer>, List<Integer>> mappa){

        List<Integer> numeriPari = new ArrayList<>();
        List<Integer> numeriDispari = new ArrayList<>();

        for(Map.Entry<List<Integer>, List<Integer>> entry : mappa.entrySet()){

            numeriPari.addAll(entry.getKey());
            numeriDispari.addAll(entry.getValue());

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

    public static double mediaMatematica(List<Integer> lista){
        double media = 0;
        for(int i : lista){
            media += i;
        }
        double risultato = media / lista.size();

        return risultato;
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

    public static void stampaListaEMapInJSON(List<Integer>lista, Map<List<Integer>, List<Integer>> mappa){

        List<Integer> numeriPari = new ArrayList<>();
        List<Integer> numeriDispari = new ArrayList<>();

        for (Map.Entry<List<Integer>, List<Integer>> entry : mappa.entrySet()) {

            //numeriPari.addAll(mappa.get(entry.getKey()));

            numeriPari.addAll(entry.getKey());
            numeriDispari.addAll(entry.getValue());
        }

        Map<String, Object> dataDaInserire = new HashMap<>();

        dataDaInserire.put("lista", lista);
        dataDaInserire.put("numeriPari", numeriPari);
        dataDaInserire.put("numeriDispari", numeriDispari);
        dataDaInserire.put("MediaMatematica", mediaMatematica(lista));
        dataDaInserire.put("NumeroMaggiore", numMaggiore(lista));
        dataDaInserire.put("NumeroMinore", numMinore(lista));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonOutput = gson.toJson(dataDaInserire);

        // Scrivi i dati in un file JSON
        try (FileWriter writer = new FileWriter("risultati_v2.json")) {
            gson.toJson(dataDaInserire, writer);
            System.out.println("Dati salvati con successo in risultati.json");
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura del file JSON: " + e.getMessage());
        }

    }



}
