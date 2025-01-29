package org.example.esercitazione1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.lang.Math;

public class Esercitazione1 {

    public static void test() {
        int[] array = {1, 43, 63, 8, 13, 15, 26, 65, 47, 98, 54};

        int min = array[0];
        int max = array[0];
        int somma = 0;

        stampaArray(array);
        HashMap<String, ArrayList<Integer>> mappa = new HashMap<String, ArrayList<Integer>>();
        mappa.put("pari", new ArrayList<Integer>() );
        mappa.put("dispari",new ArrayList<Integer>());
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0 ){
                mappa.get("pari").add(array[i]);
            }
            else {
                mappa.get("dispari").add(array[i]);
            }

            if(array[i] > max) {
                max = array[i];
            }

            if(array[i] < min) {
                min = array[i];
            }

            somma = somma + array[i];
        }

        stampaLista("pari", mappa.get("pari"));
        stampaLista("dispari", mappa.get("dispari"));

        System.out.println("Il numero maggiore e': " + max);
        System.out.println("Il numero minore e': " + min);
        System.out.println("La media e': " + somma/ array.length);
    }
    public static void stampaArray(int[] array)
    {
        for (int i = 0; i < array.length; i++) {

     System.out.println(array[i]);   }
    }
    public static void stampaLista(String nome, ArrayList array) {
        System.out.print("La mia lista " + nome + " è: ");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + ", ");
        }
        System.out.println();
    }
}