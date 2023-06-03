package poo;

import java.util.Scanner;

public class FuncionariaPrincipal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Funcionaria f = new Funcionaria();

		System.out.println("Qual o nome do funcionário(a)? ");
		f.nome = entrada.nextLine();
		System.out.println("Informe o seu salário: ");
		f.salarioBruto = entrada.nextDouble();
		System.out.println("Qual o valor do imposto: ");
		f.imposto = entrada.nextDouble();

		System.out.println("Qual a porcetagem de aumento: ");
		f.aumentoSalario(entrada.nextDouble());

		System.out.println(f);

		entrada.close();
	}

}
