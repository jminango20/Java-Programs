package entities;

public class Conta {
	
	private int conta;
	private String nome;
	private double saldoConta;
	private final int taxa = 5;
	
	
	public Conta(int conta, String nome, double initialDeposit) {
		this.conta = conta;
		this.nome = nome;
		deposit(initialDeposit);
	}

	public Conta(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSaldoConta() {
		return saldoConta;
	}



	public void deposit(double valor) {
		saldoConta += valor;
	}
	
	public void withdraw(double valor) {
		double valorFinal = valor + taxa;
		saldoConta -= valorFinal;
	}
	
	
	@Override
	public String toString() {
		return "Account: " 
				+ conta + ", Holder: " 
				+ nome + ", Balance: $ " 
				+ String.format("%.2f", saldoConta);
	}
		

}
