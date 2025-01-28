package org.example;

public class Studente {
    private String nome;
    private int eta;
    private double voto;


    public Studente(String nome, int eta, double voto) {
        this.nome = nome;
        this.eta = eta;
        this.voto = voto;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public double getVoto() {
        return voto;
    }

    public void setVoto(double voto) {
        this.voto = voto;

    }

    public String toString() {
        return "Nome: " + this.nome + " Età: " + this.eta + " Voto: " + this.voto;
    }
}
