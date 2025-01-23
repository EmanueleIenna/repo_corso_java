import java.util.Scanner;


public class Main {

    // Esercizio 1
    public static void esercizio1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome studente:");
        String nome = scanner.nextLine();

        System.out.println("Età:");
        int eta = scanner.nextInt();
        scanner.nextLine();  // Consuma la newline residua

        System.out.println("Voto medio:");
        double votoMedio = scanner.nextDouble();
        scanner.nextLine();  // Consuma la newline residua

        System.out.println("Lo studente è iscritto? (true/false):");
        boolean iscritto = scanner.nextBoolean();
        scanner.nextLine();  // Consuma la newline residua

        System.out.println("\nDettagli dello studente:");
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + eta);
        System.out.println("Voto medio: " + votoMedio);
        System.out.println("Stato di iscrizione: " + (iscritto ? "Iscritto" : "Non iscritto"));

        // scanner.close();  // Non chiudere scanner qui, lo faremo alla fine
    }

    // Esercizio 2
    public static void esercizio2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInserisci il primo numero:");
        double num1 = scanner.nextDouble();

        System.out.println("Inserisci il secondo numero:");
        double num2 = scanner.nextDouble();

        double somma = num1 + num2;
        double differenza = num1 - num2;
        double prodotto = num1 * num2;
        double modulo = num1 % num2;

        System.out.println("\nRisultati delle operazioni:");
        System.out.println("Somma: " + somma);
        System.out.println("Differenza: " + differenza);
        System.out.println("Prodotto: " + prodotto);
        System.out.println("Modulo: " + modulo);
    }

    // Esercizio 3
    public static void esercizio3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInserisci un numero per stampare la sua tabellina:");
        int numero = scanner.nextInt();

        System.out.println("Tabellina del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // Esercizio 4
    public static void esercizio4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQuanti numeri vuoi inserire?");
        int n = scanner.nextInt();

        double somma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Inserisci il " + i + "° numero:");
            double numero = scanner.nextDouble();
            somma += numero;
        }

        double media = somma / n;
        System.out.println("\nSomma: " + somma);
        System.out.println("Media: " + media);
    }

    public static void main(String[] args) {
        // Chiamata ai metodi per eseguire gli esercizi
        esercizio1();
        esercizio2();
        esercizio3();
        esercizio4();
    }
}
