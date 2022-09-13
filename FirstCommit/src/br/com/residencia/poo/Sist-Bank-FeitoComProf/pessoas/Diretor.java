package br.com.residencia.poo.pessoas;

public class Diretor extends Funcionario {

	//declaracao de atributos
	//modificador de acesso - tipo da variavel - nome da variavel
	private String listaAgencias;
	private double capitalBruto;

//	gerando construtor default
	public Diretor() {
		super();
	}
	
//	gerando construtor parametrizado
	public Diretor(String listaAgencias, double capitalBruto, String nome, String cpf, double salario, int senha, String login, String agencia) {
		super(nome, cpf, salario, senha, login, agencia);
		this.listaAgencias = listaAgencias;
		this.capitalBruto = capitalBruto;
	}

//	gerando get e set
	public String getListaAgencias() {
		return listaAgencias;
	}
	
	public double getCapitalBruto() {
		return capitalBruto;
	}
	
	public double bonificacao() {
		return getSalario() * 0.20;
	}
	
}
