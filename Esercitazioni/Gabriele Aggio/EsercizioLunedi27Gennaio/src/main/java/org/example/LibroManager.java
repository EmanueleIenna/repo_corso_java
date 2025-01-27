package org.example;

import java.util.HashSet;

public class LibroManager {

    private HashSet<Libro> setLibri;

    public LibroManager() {
        this.setLibri = new HashSet<>();
    }

    public void aggiungiLibro(Libro libro){
        boolean duplicato = false;

        for(Libro l : setLibri){
            if(l.getTitolo().equals(libro.getTitolo())){
                duplicato = true;
                break;
            }
        }
        if(duplicato){
            System.out.println("Libro già presente del database - " +  libro.getTitolo() + " - " + libro.getAutore());
        } else {
            setLibri.add(libro);
            System.out.println("Libro correttamente inserito -  " + libro.getTitolo() + " - " + libro.getAutore());
        }
    }

    public void leggiListaLibri(){
        if(setLibri.isEmpty()){
            System.out.println("La lista dei libri è vuota");
        } else {
            setLibri.forEach( libro ->
            {
                System.out.println("Titolo: " + libro.getTitolo() + " - Autore: " + libro.getAutore());
            });
        }
    }
}
