package br.com.residencia.poo.exerciciosdeintroducao;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        String nome;
        
       nome= JOptionPane.showInputDialog("Digite seu nome: ");
       
        JOptionPane.showMessageDialog(null, "Olá, " + nome);
        
    }
}
