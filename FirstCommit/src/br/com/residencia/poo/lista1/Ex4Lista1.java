/*
 4. O programa “termômetro” lê uma temperatura em graus celsius, e devolve
    sua equivalência na escala fahrenheit. (Use: F = C * 1, 8 + 32)
 */

package br.com.residencia.poo.lista1;

import java.util.Scanner;

public class Ex4Lista1 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        double temp1, tempTotal;

        System.out.println("========Conversor de temperatura básico========");
        System.out.print("Digite a temperatura em °C: ");
        temp1= ler.nextDouble();

        tempTotal= ((temp1*1.8)+32);

        System.out.println("A temperatura em  Fahrenheit é: "+tempTotal+"°");

        ler.close();
    }
}
