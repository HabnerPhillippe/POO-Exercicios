package br.com.residencia.poo.pessoas;

public class Funcionario {
	//declaracao de atributos
	//modificador de acesso - tipo da variavel - nome da variavel
	private String nome;
	private String cpf;
	private double salario;
	private int senha;
	private String login;
	private String agencia;
	
//	gerando construtor default
	public Funcionario() {
		super();
	}
	
//	gerando construtor parametrizado
	public Funcionario(String nome, String cpf, double salario, int senha, String login, String agencia) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.senha = senha;
		this.login = login;
		this.agencia = agencia;
	}

//	gerando get e set
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public String getLogin() {
		return login;
	}
	
	public double bonificacao() {
		return this.salario * 0.10;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
