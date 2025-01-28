package it.dst.formazione.EsercizioGiorno6.bo;

public class Student {


    // campo chiave
   private String nominativo;
   private int eta;
   private double voto;

    //Costruttore vuoto
    public Student (){

    }// Costruttore //con quali parametri voglio valorizzarlo
    public Student (String nominativo, int eta, double voto){
    this.nominativo = nominativo;
    this.eta = eta;
    this.voto = voto;

    }
    public String getNominativo() {
        return nominativo;
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
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
        return "Nome: '" + this.nominativo + "', Voto: '" + this.voto + "', Eta: '" + this.eta + "'";
    }



}
