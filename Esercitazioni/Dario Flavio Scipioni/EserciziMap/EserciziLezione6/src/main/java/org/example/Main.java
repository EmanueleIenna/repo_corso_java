package org.example;


import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Student studente1 = new Student("Pluto", 23, 30);
        Student studente2 = new Student("Paperino", 34, 28);
        Student studente3 = new Student("Pippo", 25, 18);
        Student studente4 = new Student("Qui", 26, 26);
        Student studente5= new Student("Minnie",32,29);

        HashMap<Integer, Student> classeQuinta = new HashMap<>();
        classeQuinta.put(1, studente1);
        classeQuinta.put(2, studente2);
        classeQuinta.put(3, studente3);
        classeQuinta.put(4, studente4);
        classeQuinta.put(5,studente5);
        System.out.println("Gli studenti della classe quinta sono: \n");

        for (int count = 1; count <= classeQuinta.size(); count++) {
            System.out.print("Id: " + count + " ");
            System.out.println(classeQuinta.get(count));
        }
    }
}