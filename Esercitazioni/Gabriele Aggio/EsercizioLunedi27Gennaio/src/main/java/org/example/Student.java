package org.example;

import java.util.HashMap;

public class Student {

    private String nome;
    private int eta;
    private int voto;

    public Student() {};
    public Student(String nome, int eta, int voto){
        this.nome = nome;
        this.eta = eta;
        this.voto = voto;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
