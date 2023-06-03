package poo.desafioBanco;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Conta c;

		System.out.print("Informe o seu nome: ");
		String nome = entrada.next();
		System.out.print("Informe o número da conta: ");
		int numConta = entrada.nextInt();

		System.out.println("Deseja inciar um depósito incial?\n Digite s-sim\n n-não ");
		char resp = entrada.next().charAt(0);

		if (resp == 's') {
			System.out.print("Digite o valor do depósito inicial: ");
			double depositoInicial = entrada.nextDouble();
			c = new Conta(nome, numConta, depositoInicial);
		} else {
			c = new Conta(nome, numConta);
		}
		System.out.println(c);

		System.out.println("Entre com o valor do depósito: ");
		double valorDeposito = entrada.nextDouble();
		c.deposito(valorDeposito);
		System.out.println("Valor atualizado " + c);
		System.out.println("Entre com o valor do saque: ");
		double valorSaque = entrada.nextDouble();
		c.saque(valorSaque);
		System.out.println("Valor atualizado " + c);

		entrada.close();
	}

}
