package br.com.residencia.poo.exerciciosdeintroducao;

import java.util.Scanner;

public class Exercicio4 {        //programa{
    public static void main(String[] args) {   //funcao inicio(){}
        
        Scanner ler= new Scanner(System.in);
        double nota, totalNotas = 0.0, media;   //real
        String disciplina, nome;    //cadeia

        System.out.println("Digite seu nome:");   //escreva()
        nome= ler.nextLine();     //leia(nome)
        System.out.println("Digite sua disciplina:");   
        disciplina= ler.nextLine();
        
            for(int cont = 1; cont<=3; cont++){   //para
                System.out.println("insira a nota "+cont+":");
                nota= ler.nextDouble();
                totalNotas += nota;
            }
        media= totalNotas/3;
        System.out.println("Olá, "+nome);
        System.out.println("Na disciplina "+disciplina+" a média é "+media); 

            ler.close();
            //observações: a ',' (vírgula) é trocada pelo '+'
            //o programa lê com vírgula (7,5) e responde com ponto ('totalNotas =' 10.0)
    }
}
