package poo.desafioBanco;

public class Conta {
	private String nome;
	private Integer numConta;
	private Double saldo = 0.0;

	Conta(String nome, Integer numConta) {
		this.nome = nome;
		this.numConta = numConta;
	}

	public Conta(String nome, Integer numConta, Double depositoInicial) {
		this.nome = nome;
		this.numConta = numConta;
		deposito(depositoInicial);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void deposito(Double quantia) {
		saldo += quantia;
	}

	public void saque(Double quantia) {
		saldo -= (quantia + 5.0);
	}

	@Override
	public String toString() {
		return String.format("\nNome: %s \nConta: %d \nSaldo R$:%.2f", this.nome, this.numConta, this.saldo);
	}

}
