package org.example;

public class Student {
    String nome;
    int eta;
    int voto;
    int id;

    public Student(String nome, int eta, int vot, int id) {
        this.nome = nome;
        this.eta = eta;
        this.voto = vot;
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

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString(){
        return "Studente {Nome: " + nome + " eta: " +eta + " voto: "+ voto + " id: " + id + "}" ;
    }
}
