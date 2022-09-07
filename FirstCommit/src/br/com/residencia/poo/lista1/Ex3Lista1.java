/*
3. Crie o programa “mini calculadora”, que após ler dois números inteiros
    apresenta as operações de soma, subtração, multiplicação e divisão com
    eles.
    Obs.: Trate o maior número possível de erros (ex: operações com números
    negativos, divisão por zero, uso de letras, etc).
    Obs.2: AINDA PRECISO ADICIONAR ESSA SEGUNDA PARTE COM OS ERROS
*/

package br.com.residencia.poo.lista1;

import java.util.Scanner;

public class Ex3Lista1 {
    public static void main(String[] args) {

        Scanner ler= new Scanner(System.in);
        double N1, N2;
        double soma, subtracao, multiplicacao, divisao;

        System.out.println("========Mini Calculadora========");
        System.out.println("Digite o primeiro número:");
        N1= ler.nextDouble();
        System.out.println("Digite o segundo número:");
        N2= ler.nextDouble();

        soma= N1+N2;
        subtracao= N1-N2;
        multiplicacao= N1*N2;
        divisao= N1/N2;


        System.out.println("Soma: "+soma);
        System.out.println("Subtração: "+subtracao);
        System.out.println("Multiplicação: "+multiplicacao);
        if(N2 != 0){
            System.out.println("Divisão: "+divisao);
        }
        else{
            System.out.println("Não é possível dividir por 0");
        }
        

        ler.close();
    }
}
