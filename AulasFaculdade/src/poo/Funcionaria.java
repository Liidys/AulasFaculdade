package poo;

public class Funcionaria {

	public String nome;
	public double salarioBruto;
	public double imposto;

	public double salarioLiquido() {
		return this.salarioBruto - this.imposto;
	}

	public void aumentoSalario(double porcentagem) {
		this.salarioBruto += (this.salarioBruto * porcentagem) / 100;
	}

	public String toString() {
		return this.nome + ", $ " + String.format("%.2f", this.salarioLiquido());

	}

}
