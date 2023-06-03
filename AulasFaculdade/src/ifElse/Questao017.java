package ifElse;

import java.util.Scanner;

public class Questao017 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha uma opção: \nC-Sabor Chocolate " + "\nM-Sorvete de morango");
		String sabor = entrada.nextLine();
		System.out.println("Quantas bolas você quer?");
		int qntBolas = entrada.nextInt();

		if (sabor.equalsIgnoreCase("C")) {
			if (qntBolas >= 3) {
				System.out.println("Você terá desconto de 10%");
			} else {
				System.out.println("Você terá desconto de 5%");
			}
		} else if (sabor.equalsIgnoreCase("M")) {
			System.out.println("Sem desconto");
		} else {
			System.out.println("Sabor inválido");

			entrada.close();
		}	

	}

}
