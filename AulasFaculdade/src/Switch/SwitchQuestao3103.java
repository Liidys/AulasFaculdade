package Switch;


import java.util.Scanner;

public class SwitchQuestao3103 {

	public static void main(String[] args) { // questão5 switch-case

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int num1 = entrada.nextInt();
		System.out.print("Digite o segundo número: ");
		int num2 = entrada.nextInt();

		System.out.println("Qual operação quer fazer? ");
		String op = entrada.next();
		switch (op) { // só informa variável / não informa condiçao
		case "+":
			int ad = num1 + num2;
			System.out.println("O resultado da sua adição é: " + ad);
			break;
		case "-":
			int sub = num1 - num2;
			System.out.println("O resultado da sua subtração é: " + sub);
			break;
		case "*":
			int mult = num1 * num2;
			System.out.println("O resultado da sua multiplicação é: " + mult);
			break;
		case "/":
			double div = (double)num1 / num2;
			System.out.printf("O resultado da sua divisão é: %.2f ", div);
			break;
		default:
			System.out.println("Operação inválida");
		}

		entrada.close();

	}

}
