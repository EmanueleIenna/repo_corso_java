package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        StudentManager stuManager = new StudentManager();
        LibroManager libroManager = new LibroManager();

        stuManager.aggiungStudente(1, new Student("Gabriele", 29, 90));
        stuManager.aggiungStudente(2, new Student("Marco", 12, 65));
        stuManager.aggiungStudente(3, new Student("Massimo", 44, 50));
        stuManager.aggiungStudente(4, new Student("Luciano", 55, 80));

        stuManager.stampaStudenti();

        System.out.println("-------------------------------");

        libroManager.aggiungiLibro(new Libro("De bello gallico", "Giulio Cesare"));
        libroManager.aggiungiLibro(new Libro("De bello gallico", "Giulio Cesare")); //Test duplicato
        libroManager.aggiungiLibro(new Libro("Il codice da Vinci", "Dan Brown"));
        libroManager.aggiungiLibro(new Libro("Angeli e demoni", "Dan Brown"));

        System.out.println();
        System.out.println("LISTA LIBRI: ");
        libroManager.leggiListaLibri();
        System.out.println("-----------------");

        ArrayListTarocco<Integer> listaTarocca = new ArrayListTarocco<>();
        listaTarocca.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));

        System.out.println("Lista prima della roulette russa: ");
        listaTarocca.stampaLista();
        listaTarocca.rouletteRussa();
        System.out.println("------");
        System.out.println("ROULETTE RUSSA");
        System.out.println("Lista dopo la roulette russa: ");
        listaTarocca.stampaLista();



    }
}