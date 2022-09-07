/*
 5. O programa “Riuju” escreve na tela o resultado das expressões abaixo:
    a. 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66
    b. 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9
 */

package br.com.residencia.poo.lista1;

import java.util.Scanner;

public class Ex5Lista1 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
            int contaA, contaB;
    
            System.out.println("========Programa 'Riuju'========");
    
            //letra A:
            System.out.println("Riuju, resolva esta conta: 2 + 3 - 5 x 8 - 4 + 354 - 521 + 7 x 66");
            contaA= 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66;
            System.out.println("O resultado desta expressão é: "+contaA);
    
            //letra B:
            System.out.println("Riuju, resolva esta também: 2 + 7 x (14 - 21) + 28 x 3 x 42 + 740 - (156 + 4 + 40) x 9");
            contaB= 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9;
            System.out.println("O resultado da expressão é: "+contaB);
    
    
            ler.close();
        }
}
