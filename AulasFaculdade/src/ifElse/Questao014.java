package ifElse;

import java.util.Scanner;

public class Questao014 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual idade de João ?");
		int joao = entrada.nextInt();
		System.out.println("Qual idade de Maria ?");
		int maria = entrada.nextInt();
		System.out.println("Qual idade de José ?");
		int jose = entrada.nextInt();
		
		if ((joao < jose) && (joao < maria)) {
			System.out.println("João é o caçula");
		} else if ((jose < jose) && (jose < maria)){
			System.out.println("José é o caçula");
		}else {
			System.out.println("Maria é a caçula");
		}
		entrada.close();
	}

}
