/*
2. O programa “Tempo de vida” irá imprimir a soma das idades de todos os
    colegas da sua equipe (6 pessoas). Pergunte a cada um a idade e não
    esqueça a sua! Depois faça a atribuição direta da expressão em uma
    variável inteira.
*/


package br.com.residencia.poo.lista1;

import java.util.Scanner;

public class Ex2Lista1 {
    public static void main(String[] args) {

        Scanner ler= new Scanner(System.in);
        int idade, soma=0, minhaIdade=0;

        System.out.println("========TEMPO DE VIDA========");

        for(int cont = 1; cont<=6; cont++){         
            System.out.println("Qual a idade do colega "+cont+":");
            idade= ler.nextInt();
            soma += idade;
        }
            System.out.println("Qual a minha idade?");
            minhaIdade= ler.nextInt();
            soma= soma+minhaIdade;
            System.out.println("O tempo de vida meu e dos meus colegas é "+soma);
        ler.close();
    }
}
