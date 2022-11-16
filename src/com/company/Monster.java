package com.company;

public class Monster {
    private String nome;
    private int puntiFerita;
    private int danno;
    private Arma[] armi;
    private int nArmi;

    public Monster(String nome, int puntiFerita, int danno, int numeroBraccia) {
        this.nome = nome;
        this.puntiFerita = puntiFerita;
        this.danno = danno;
        armi = new Arma[numeroBraccia];
    }

    public void aggiungiArma(Arma a) throws Exception{
        if(nArmi < armi.length){
            armi[nArmi] = new Arma(a);
        } else {
            throw new Exception("Hai già inserito il numero massimo di armi");
        }
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
        String str = "Il nome del mostro è " + nome + "\nI punti vita del mostro sono: " + puntiFerita +"\nIl danno che infligge è: " + danno;
        
        return str;
    }
}
