package com.company;

public class Monster {
    private String nome;
    private int puntiFerita;
    private int danno;

    public Monster(String nome, int puntiFerita, int danno) {
        this.nome = nome;
        this.puntiFerita = puntiFerita;
        this.danno = danno;
    }

    public int attacca(){
        return danno;
    }

    public void subisci(int dannoSubito){
        puntiFerita = puntiFerita - dannoSubito;
    }

    public boolean vivo(){
        if (puntiFerita > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Il nome del mostro è " + nome + "\nI punti vita del mostro sono: " + puntiFerita +
                "\nIl danno che infligge è: " + danno;
    }
}
