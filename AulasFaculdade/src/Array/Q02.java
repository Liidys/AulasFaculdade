package Array;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double[] notas = new double[4];
		double somaNotas = 0;
		for (int i = 0; i <= 3; i++) {
			System.out.print("Informe a nota: ");
			notas[i] = entrada.nextDouble();

			somaNotas += notas[i];
		}

		double media = somaNotas / notas.length;

		System.out.println("A média total é " + media);

		entrada.close();

	}
}
