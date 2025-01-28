package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //creo un hashset
        HashSet <String> libri = new HashSet();
        //aggiungo i libri
        libri.add("il gattopardo");
        libri.add("harry potter");//questo non verra aggiunto perche gia presente
        libri.add("lo hobbit");
        libri.add("in nome di dio");
        libri.add("harry potter");
        //ciclo per stampare tutti i libri
        for (String libro : libri) {
            System.out.println(libro);
        }

    }
}