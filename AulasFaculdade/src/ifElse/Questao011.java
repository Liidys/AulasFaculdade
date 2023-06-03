package ifElse;

import java.util.Scanner;

public class Questao011 {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual seu sexo?  \nM- masculino \nF-Feminio");
		String sexo = entrada.nextLine();

		if (sexo.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		} else if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		} else {
			System.out.println("Opção inválida! ");
		}

		entrada.close();
	}

}
