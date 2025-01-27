package org.example;

import java.util.ArrayList;

public class ArrayListTarocco<T> extends ArrayList<T> {

    public void rouletteRussa() {
        if(size() > 0){
            int numeroRandomDaFareAlSugo = (int) (Math.random() * size()); //num casuale tra 0 e size dell'array.
            T numeroRimosso = remove(numeroRandomDaFareAlSugo);            //cast a int perchè torna un double di base
            System.err.println("Ti sei sparato nel piede, il numero " + numeroRimosso + " è stato rimosso");
        } else {
            System.out.println("Non ci sono numeri nell'arraylist");
        }
    }

    public void stampaLista(){
        forEach(System.out::println);
    }


}
