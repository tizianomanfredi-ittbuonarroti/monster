package com.company;

public class Arma {
    private int danno;
    private String nome;

    public Arma(int danno, String nome) {
        this.danno = danno;
        this.nome = nome;
    }

    //costruttore di copia
    public Arma(Arma a) {
        this.danno = a.danno;
        this.nome = a.nome;
    }

    public int getDanno() {
        return danno;
    }

    public String getNome() {
        return nome;
    }
}
