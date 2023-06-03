package Array;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int[] notas = new int[5];

		for (int i = 0; i <= 4; i++) {
			System.out.print("Informe um valor: ");
			notas[i] = entrada.nextInt();
		}
		for (int i : notas) { // percorre o vetor
			System.out.println(i);
		}
		for (int i = 0; i <= 4; i++) {
			if (notas[i] % 2 == 0) {
				notas[i] = notas[i] * 3;
			} else {
				notas[i] = notas[i] + 1;
			}
		}
		System.out.println("Vetor alterado:");
		for (int i : notas) {
			System.out.println(i);
		}

		entrada.close();
	}
}
