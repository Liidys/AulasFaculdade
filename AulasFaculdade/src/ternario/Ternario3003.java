package ternario;

import java.util.Scanner;

public class Ternario3003 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num1 = entrada.nextInt();

		String resultado = (num1 % 2 == 0) ? "É par" : "É ímpar";

		System.out.println(resultado);

		entrada.close();
	}

}
