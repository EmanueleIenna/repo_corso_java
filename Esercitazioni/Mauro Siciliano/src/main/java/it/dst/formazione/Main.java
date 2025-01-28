package it.dst.formazione;


import it.dst.formazione.EsercizioGiorno6.bo.Student;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, World!");

        Student studente1 = new Student("pluto",18,4);
        studente1.setNominativo("nonna papera");
        Student studente2 = new Student("pippo",18,8);
        Student studente3 = new Student("paperino",18,3);
        Student studente4 = new Student("qui",18,5);

        //
        HashMap<Integer , Student> classe = new HashMap<Integer, Student>();
                    // cassetto1
            classe.put(1, studente1);
                    // cassetto2
            classe.put(2, studente2);
                    // cassetto3
            classe.put(3, studente3);
            classe.put(4, studente4);

            for (int count = 1; count <= classe.size(); count++ ){
                System.out.println(classe.get(count));
        }





    }
}