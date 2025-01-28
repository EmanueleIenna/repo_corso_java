package org.example;

public class Student {
    String nome;
    int eta;
    int vot;
    int id;

    public Student(String nome, int eta, int vot, int id) {
        this.nome = nome;
        this.eta = eta;
        this.vot = vot;
        this.id = id;
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

    public int getVot() {
        return vot;
    }

    public void setVot(int vot) {
        this.vot = vot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
