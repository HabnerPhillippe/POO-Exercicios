package br.com.residencia.poo.pessoas;

public class OperadorCaixa extends Funcionario {

	//declaracao de atributos
	//modificador de acesso - tipo da variavel - nome da variavel
	private double inicioCaixa;
	private double fechamentoCaixa;
	
//	gerando construtor default
	public OperadorCaixa() {
		super();
	}

//	gerando construtor parametrizado
	public OperadorCaixa(double inicioCaixa, double fechamentoCaixa, String nome, String cpf, double salario, int senha, String login, String agencia) {
		super(nome, cpf, salario, senha, login, agencia);
		this.inicioCaixa = inicioCaixa;
		this.fechamentoCaixa = fechamentoCaixa;
	}

//	gerando get e set
	public double getInicioCaixa() {
		return inicioCaixa;
	}
	
	public void setInicioCaixa(double inicioCaixa) {
		this.inicioCaixa = inicioCaixa;
	}
	
	public double getFechamentoCaixa() {
		return fechamentoCaixa;
	}
	
	public void setFechamentoCaixa(double fechamentoCaixa) {
		this.fechamentoCaixa = fechamentoCaixa;
	}
	
}
