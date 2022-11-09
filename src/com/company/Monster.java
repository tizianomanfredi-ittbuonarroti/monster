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

    public String attacca(){
        return "Ti ho inflitto un danno di "+danno+" punti";
    }

    public void subisci(int dannoSubito){
        puntiFerita = puntiFerita - dannoSubito;
    }

    @Override
    public String toString() {
        return "Il nome del mostro è " + nome + "\nI punti vita del mostro sono: " + puntiFerita +
                "\nIl danno che infligge è: " + danno;
    }
}
