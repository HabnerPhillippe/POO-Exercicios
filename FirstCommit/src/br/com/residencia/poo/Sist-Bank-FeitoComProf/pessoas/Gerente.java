package br.com.residencia.poo.pessoas;

public class Gerente extends Funcionario {

	//declaracao de atributos
	//modificador de acesso - tipo da variavel - nome da variavel
	private int numeroFuncionarios;
	private boolean controleCaixa;
	
//	gerando construtor default
	public Gerente() {
		super();
	}

//	gerando construtor parametrizado
	public Gerente(int numeroFuncionarios, boolean controleCaixa, String nome, String cpf, double salario, int senha, String login, String agencia) {
		super(nome, cpf, salario, senha, login, agencia);
		this.numeroFuncionarios = numeroFuncionarios;
		this.controleCaixa = controleCaixa;
	}

	//	gerando get e set
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	public boolean isControleCaixa() {
		return controleCaixa;
	}
	public void setControleCaixa(boolean controleCaixa) {
		this.controleCaixa = controleCaixa;
	}
	
}
