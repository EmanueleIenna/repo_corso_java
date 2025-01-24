import java.util.*;

public class PlaygrondHashmap {

    //90%, da finire i casi di imput mismatch + il 3 e il 4
    public void testHashmap(){

        HashMap<String, Integer> mappaStudenti = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        try {
            while(true){
                System.out.println("Scegli un'opzione:\n" +
                        "1) Aggiungi uno studente\n" +
                        "2) Modifica il voto\n" +
                        "3) Delete studente dalla lista\n" +
                        "4) Visualizza tutti gli studenti\n" +
                        "5) Esci dal programma");

                int scelta = 0;
                scelta = sc.nextInt();
                sc.nextLine(); //Mangia altra riga maledetta consSSSole.

                if (scelta == 5) break;

                switch (scelta){
                    case 1:
                        System.out.println("Inserisci il nome dello studente: ");
                        String nome = sc.nextLine();
                        System.out.println("Inserisci il voto dello studente: ");
                        int voto = sc.nextInt();
                        sc.nextLine(); //Mangia linea
                        mappaStudenti.put(nome, voto);
                        System.out.println(nome + " " + voto);
                        break;
                    case 2:
                        System.out.println("Indica il nome dello studente a cui cambiare il voto: ");
                        nome = sc.nextLine();
                        if(mappaStudenti.containsKey(nome)){
                            System.out.println("Inserisci il voto: ");
                            voto = sc.nextInt();
                            mappaStudenti.put(nome, voto);
                        } else {
                            System.out.println("Studente non trovato, riprova\n");
                        }
                        break;
                    case 3:
                        System.out.println("Inserisci il nome dello studente da rimuovere: ");
                        nome = sc.nextLine();
                        mappaStudenti.remove(nome);
                        break;
                    case 4:
                        for (String stud : mappaStudenti.keySet()){
                            int mostraVoto = mappaStudenti.get(stud);
                            System.out.println("Studente: " + stud + " - Voto: " + mostraVoto);
                        }
                        break;
                    default:
                        System.out.println("Errore generale");
                }
            }
        } catch (InputMismatchException inex) {
            System.out.println("Inserimento non valido, riprova");
            inex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Errore");
            ex.printStackTrace();
        }
        sc.close();

    }

    //Finito
    public void casiUtilizzoHashmap(){
        HashMap<String, String> mappaCapitali = new HashMap<>();
        mappaCapitali.put("Italia", "Roma");
        mappaCapitali.put("Francia", "Parigi");
        mappaCapitali.put("Germania", "Berlino");

        //Stampo capitali
        for(String capitali : mappaCapitali.values()){
            System.out.println(capitali);
        }



    }

    //Finito
    public void casoHashmapAndLista(){
        HashMap<String, List<String>> corsi = new HashMap<>();
        corsi.put("Analista Programmatore", Arrays.asList("Giuseppe", "Gabriele", "Vittorio"));

        for(Map.Entry<String, List<String>> entry : corsi.entrySet()){
            String corso = entry.getKey();
            List<String> studenti = entry.getValue();

            System.out.println("Corsi: " + corso);
            System.out.println("Studenti " + studenti);
        }
    }

    //Finito noioso
    public void testSintassiListe(){
        List<String> nomi = new ArrayList<>();
        nomi.add("Gabriele");
        nomi.add("Massimo");
        nomi.add("Giovanni");

        for(String nome : nomi){
            System.out.println(nome);
        }
    }

    //Carina con lamba e quell'esempio del method reference
    public void giocoDiLista(){
        List<Integer> numeri = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            numeri.add(i);
        }
        //Lambda, Intellij consiglia di sostituirlo con un method reference
        numeri.forEach(numero -> System.out.print(numero + " "));
        System.out.println();

        //Come vorrebbe farmelo fare Intellij
        //numeri.forEach(System.out::println);
    }






}
