package org.example;

public class Student {

    private String nome;
    private int eta;
    private double voto;


    public Student() {

    }

    public Student(String nome, int eta, double voto) {

        this.nome = nome;
        this.eta = eta;
        this.voto = voto;

    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void setVoto(double voto) {
        this.voto = voto;
    }

    public String getNome() {
        return nome;
    }


    public int getEta() {
        return eta;
    }


    public double getVoto() {
        return voto;
    }

    public String toString() {
        return "Nome: " + this.nome + " Età: " + this.eta + " Voto: " + this.voto;
    }

    /*
    public static void creaStudente() {
        Student studente1 = new Student();
        studente1.setVoto(30);
        studente1.setNome("Marco");
        studente1.setEta(22);

        System.out.println("Nome: " + studente1.getNome() + "\nEtà: " + studente1.getEta() + "\nVoto: " + studente1.getVoto());
    }

     */
}
