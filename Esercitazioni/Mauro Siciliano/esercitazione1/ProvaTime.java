package it.dst.formazione.studenti.maurosiciliano;


import java.time.LocalDateTime;

public class ProvaTime {
    public static void provaTime() {
        // Ottenere la data e l'ora attuale
        LocalDateTime now = LocalDateTime.now();

        // Creare una data e un orario specifici
        LocalDateTime specificDateTime = LocalDateTime.of(2025, 1, 27, 14, 30);

        // Aggiungere giorni e ore
        LocalDateTime futureDateTime = specificDateTime.plusDays(5).plusHours(3);

        System.out.println("Data e ora attuale: " + now);
        System.out.println("Data e ora specifica: " + specificDateTime);
        System.out.println("Data e ora futura: " + futureDateTime);
    }
}