package ifElse;

import java.util.Scanner;

public class Questao09 {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Qual sua altura?");
		double altura = entrada.nextDouble();
		
		entrada.nextLine();
		System.out.println("Você é? \nH-Homem \nM-Mulher ");
		String pessoa = entrada.nextLine();

		if (pessoa.equalsIgnoreCase("H")) {
			double alturaMan = (72.7 * altura) - 58;
			System.out.printf("Seu peso ideal é: %.2f", alturaMan);
		} else if (pessoa.equalsIgnoreCase("M")) {
			double alturaWoman = (62.1 * altura) - 44.4;
			System.out.printf("Seu peso ideal é: %.2f", alturaWoman);
		} else {
			System.out.println("Opção inválida ");
		}

		entrada.close();
	}

}
