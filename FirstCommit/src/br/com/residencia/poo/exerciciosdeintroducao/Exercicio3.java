package br.com.residencia.poo.exerciciosdeintroducao;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner ler= new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Digite seu nome: ");
        nome= ler.nextLine();
        System.out.println("Digite sua idade: ");
        idade= ler.nextInt();
        System.out.println("Olá, " +nome+" da idade "+idade+" anos");
        ler.close();
    }
}
