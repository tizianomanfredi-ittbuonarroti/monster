package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nome;
        int vita, danno;

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

        Monster m1 = new Monster(nome,vita, danno);

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

        Monster m2 = new Monster(nome,vita, danno);

        System.out.println("\n---");
        System.out.println("Fine creazione secondo mostro");

    }
}
