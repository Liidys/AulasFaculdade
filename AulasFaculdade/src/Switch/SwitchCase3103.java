package Switch;

import java.util.Scanner;

public class SwitchCase3103 { // Questão 6 switch-case

	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o valor do produto: ");
		double valor = entrada.nextDouble();
		System.out.print("Informe a categoria: ");
		String cat = entrada.next();

		switch (cat.toUpperCase()) {
		case "A":
			double d1 = valor - (valor * 0.20);
			System.out.println("Seu produto com desconto de 20% é: " + d1);
			break;
		case "B":
			double d2  = valor - (valor * 0.17);
			System.out.println("Seu produto com desconto de 17% é: " + d2);
			break;
		case "C":
			double d3 = valor - (valor * 0.12);
			System.out.println("Seu prduto com desconto de 12% é: " + d3);
			break;
		case "D":
			double d4 = valor - (valor * 0.08);
			System.out.println("Seu produto com desconto de 8% é: " + d4);
			break;

		default:
			System.out.println("Não possui reajuste");

		}

		entrada.close();
	}

}
