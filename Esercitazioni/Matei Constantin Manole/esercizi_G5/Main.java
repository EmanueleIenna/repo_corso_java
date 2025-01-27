// 1) Legga una lista di numeri interi forniti dall'utente e li memorizzi in una List (ad esempio, ArrayList).
// 2) Classifichi i numeri come "Pari" o "Dispari" utilizzando una Map con due chiavi: "Pari" e "Dispari".
// 3) Calcoli e stampi il numero più grande, il numero più piccolo e la media dei numeri.
// 4) Salvi i numeri originali, la classificazione e le statistiche in un file JSON chiamato risultati.json.

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// creazione input per ricevere la quantita di numeri che si vuole inserire
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantitaNumeri;
        do {
            System.out.print("quanti numeri vuoi inserire? : ");
            if (scanner.hasNextInt()) {
                quantitaNumeri = scanner.nextInt();
                if (quantitaNumeri > 0) {
                    break;
                } else {
                    System.out.println("inserisci un numero maggiore di 0");
                }
            } else {
                System.out.println("errore devi inserire un numero intero.");
                scanner.next();
            }
        } while (true);

        int somma = 0;

        ArrayList<Integer> tuttiNumeri = new ArrayList<>();
        // ciclo for per inserire la quantita di numeri che abbiamo inserito

        for (int i = 1; i <= quantitaNumeri; i++) {
            System.out.print("Inserisci il numero " + i + ": ");
            if (scanner.hasNextInt()) {
                tuttiNumeri.add(scanner.nextInt());
            } else {
                System.out.println("Errore: devi inserire un numero intero.");
                scanner.next();
                i--;
            }
        }
//map per dividere i numeri in pari e dispari
        Map<String, ArrayList<Integer>> classificaNumeri = new HashMap<>();
        classificaNumeri.put("Pari", new ArrayList<>());
        classificaNumeri.put("Dispari", new ArrayList<>());

        for (int numero : tuttiNumeri) {
            if (numero % 2 == 0) {
                classificaNumeri.get("Pari").add(numero);
            } else {
                classificaNumeri.get("Dispari").add(numero);
            }
        }

        for (String chiave : classificaNumeri.keySet()) {
            System.out.println(chiave + "= " + classificaNumeri.get(chiave));
        }
// somma dei numeri e la media
        for (int numero : tuttiNumeri) {
            somma += numero;
        }
        double media = (double) somma / quantitaNumeri;
        System.out.println("La media dei numeri è: " + media);
// troviamo il max e il min
        int max = tuttiNumeri.get(0);
        int min = tuttiNumeri.get(0);

        for (int i = 1; i < tuttiNumeri.size(); i++) {
            if (tuttiNumeri.get(i) > max) {
                max = tuttiNumeri.get(i);
            }
            if (tuttiNumeri.get(i) < min) {
                min = tuttiNumeri.get(i);
            }
        }

        System.out.println("Il numero più grande è: " + max);
        System.out.println("Il numero più piccolo è: " + min);

// map per media max e min
        Map<String, Object> risultati = new HashMap<>();
        risultati.put("Numeri originali", tuttiNumeri);
        risultati.put("Classificazione", classificaNumeri);
        Map<String, Object> statistiche = new HashMap<>();
        statistiche.put("Media", media);
        statistiche.put("Max", max);
        statistiche.put("Min", min);
        risultati.put("Statistiche", statistiche);

// scrive i risultati in un file json
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter("risultati.json")) {
            gson.toJson(risultati, writer);
            System.out.println("risultati salvati in risultati.json");
        } catch (IOException e) {
            System.out.println("errore durante il salvataggio del file");
        }
    }
}


