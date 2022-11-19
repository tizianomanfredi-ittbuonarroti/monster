package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nome;
        int vita, danno, nBraccia, scelta;

        Scanner input = new Scanner(System.in);

        System.out.println("Creazione primo mostro");
        System.out.println("---");
        System.out.print("Inserisci il nome del mostro: ");
        nome = input.nextLine();
        do {
            System.out.print("Inserisci la vita del mostro: ");
            vita = input.nextInt();
        } while (vita < 1);

        do {
            System.out.print("Inserisci il danno del mostro: ");
            danno = input.nextInt();
        } while (danno < 1);

        do {
            System.out.print("Inserisci il numero delle braccia del mostro: ");
            nBraccia = input.nextInt();
        } while (nBraccia < 1);

        Monster m1 = new Monster(nome,vita, danno, nBraccia);

        System.out.println("\n---");
        System.out.println("Fine creazione primo mostro");


        System.out.println("Creazione secondo mostro");
        System.out.println("---");
        System.out.print("Inserisci il nome del mostro: ");
        nome = input.nextLine();
        do {
            System.out.print("Inserisci la vita del mostro: ");
            vita = input.nextInt();
        } while (vita < 1);

        do {
            System.out.print("Inserisci il danno del mostro: ");
            danno = input.nextInt();
        } while (danno < 1);

        do {
            System.out.print("Inserisci il numero delle braccia del mostro: ");
            nBraccia = input.nextInt();
        } while (nBraccia < 1);

        Monster m2 = new Monster(nome,vita, danno, nBraccia);

        System.out.println("\n---");
        System.out.println("Fine creazione secondo mostro");

        // crea oggetto Random
        Random random = new Random();

        int numero = random.nextInt(2);
        boolean continua = true;
        int turno;

        if(numero == 0){
            System.out.println("Inizia il mostro 1");
            turno = 1;
        } else {
            System.out.println("Inizia il mostro 2");
            turno = 2;
        }

        while(continua) {
            System.out.println("La situazione attuale del mosto 1 è: ");
            System.out.println(m1.toString());
            System.out.println("---");
            System.out.println("La situazione attuale del mosto 2 è: ");
            System.out.println(m2.toString());
            System.out.println("---");

            if (turno == 1) {
                System.out.println("Tocca al mostro 1");
            } else if (turno == 2) {
                System.out.println("Tocca al mostro 2");
            }

            do {
                System.out.println("---");
                System.out.println("Menù");
                System.out.println("---");
                System.out.println("1. Se vuoi attaccare");
                System.out.println("2. Se vuoi abbandonare un'arma");
                System.out.println("3. Se vuoi prendere un'arma");
                System.out.print("Inserisci la tua scelta: ");
                scelta = input.nextInt();
            }while(scelta < 0 || scelta > 3);

            switch (scelta){
                case 1: {
                    if (turno == 2) {
                        m1.subisci(m2.attacca());
                        turno = 1;
                    } else if (turno == 1) {
                        m2.subisci(m1.attacca());
                        turno = 2;
                    }
                    break;
                }

                case 2: {
                    System.out.print("Inserisci il nome dell'arma: ");
                    nome = input.nextLine();


                    if (turno == 2) {
                        try {
                            m2.abbandonaArma(nome);
                        } catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    } else if (turno == 1) {
                        try {
                            m1.abbandonaArma(nome);
                        } catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                }

                case 3: {
                    System.out.print("Inserisci il nome dell'arma: ");
                    nome = input.nextLine();

                    do {
                        System.out.print("Inserisci il danno del mostro: ");
                        danno = input.nextInt();
                    } while (danno < 1);

                    Arma a = new Arma(danno, nome);

                    if (turno == 2) {
                        try {
                            m2.raccogliArma(a);
                        } catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    } else if (turno == 1) {
                        try {
                            m1.raccogliArma(a);
                        } catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                }
            }

            if (m1.vivo() && m2.vivo()) {
                System.out.println("Lo scontro continua!");
                continua = true;
            } else if (m1.vivo()) {
                continua = false;
                System.out.println("Ha vinto il mostro 1");
            } else if (m2.vivo()) {
                System.out.println("Ha vinto il mostro 2");
            } else {
                System.out.println("Sono morti tutti");
            }
        }
    }
}
