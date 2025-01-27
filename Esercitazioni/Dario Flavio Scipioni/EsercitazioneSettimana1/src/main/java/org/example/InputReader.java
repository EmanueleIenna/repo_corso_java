package org.example;

import java.io.InputStream;
import java.util.*;

public class InputReader {


    public static List<Integer> getNumberList(InputStream input, int maxNumeri)
    {
        Scanner scanner = new Scanner(input);
        List<Integer> listaNumeri = new ArrayList<>();
        System.out.

                println("Inserisci " +maxNumeri + " numeri da aggiungere alla lista!");
        for (
                int i = 0;
                i < maxNumeri; i++) {
            int numeroDaInserire = scanner.nextInt();
            listaNumeri.

                    add(numeroDaInserire);
        }
        return listaNumeri;
    }
}
