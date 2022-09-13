package br.com.residencia.poo.principal;

import java.io.IOException;

import br.com.residencia.poo.IO.LeituraEscrita;
import br.com.residencia.poo.pessoas.Diretor;
import br.com.residencia.poo.pessoas.Funcionario;
import br.com.residencia.poo.pessoas.OperadorCaixa;

public class Principal {

	public static void main(String[] args) {
		
		try {
			LeituraEscrita.leitor("entrada2");
		} catch (IOException e) {
			e.printStackTrace();
		}

////		instanciando um objeto funcionario		
//		Funcionario objetoFuncionario = new Funcionario();
//		Funcionario objetoFunc = new Funcionario("Déby", "123", 1000.0, 111, "deby", "000");
//		
////		instanciando um objeto operadorCaixa		
//		OperadorCaixa objetoCaixa = new OperadorCaixa();
//		OperadorCaixa objetoOperCaixa = new OperadorCaixa(200.0, 10000.0, "Ana", "456", 5300.0, 222, "ana", "123-4");
//		System.out.println("Bonificação do Caixa " + objetoOperCaixa.bonificacao());
//		
////		instanciando um objeto diretor
//		Diretor objetoDir = new Diretor();
//		Diretor objetoDiretor = new Diretor("123-4", 500000.0, "Ana", "123", 3000.0, 111, "deby", "000");
//		System.out.println("Bonificação do Diretor " + objetoDiretor.bonificacao());
//		
////		instanciando um objeto diretor a partir do pai, funcionario
//		Funcionario objetoDiretorDois = new Diretor();

	}

}
