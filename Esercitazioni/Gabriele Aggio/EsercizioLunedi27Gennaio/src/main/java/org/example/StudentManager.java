package org.example;

import java.util.HashMap;

public class StudentManager {

    private HashMap<Integer, Student> mappaStudenti;

    public StudentManager(){
        this.mappaStudenti = new HashMap<>();
    }

    public void aggiungStudente(int id, Student studente){
        if(mappaStudenti.containsKey(id)){
            System.out.println("Errore, id già esistente");
        } else {
            mappaStudenti.put(id, studente);
        }
    }

    public void stampaStudenti(){
        mappaStudenti.forEach((id, student) -> {
            System.out.println("ID: " + id + " --- " + student.getNome() + " - Età:  " + student.getEta() + " - Voto: " + student.getVoto());
        });
    }


}
