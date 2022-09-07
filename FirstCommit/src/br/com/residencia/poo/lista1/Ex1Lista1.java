/*
 1. O programa “bem-vindo” pergunta seu nome e sobrenome, e depois
    gentilmente te cumprimenta.
    - 1º etapa: perguntar o nome;
    - 2º etapa: perguntar o sobrenome;
    - 3º etapa: junta o nome com o sobrenome e forma uma frase.
 */


package br.com.residencia.poo.lista1;

import java.util.Scanner;


public class Ex1Lista1 {
    public static void main(String[] args) {
        
        Scanner ler= new Scanner(System.in);
        String nome, sobrenome;
        System.err.println("========Bem-vindo!========");
        System.out.println("Qual seu nome?");
        nome= ler.nextLine();
        System.out.println("E qual seu sobrenome?");
        sobrenome= ler.nextLine();
        System.err.println("Olá, "+nome+" "+sobrenome+". Muito obrigado por participar!");

        ler.close();
    }
}
