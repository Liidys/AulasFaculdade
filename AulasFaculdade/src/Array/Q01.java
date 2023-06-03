package Array;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int[] notas = new int[4];
		
		for (int i = 0; i <= 3; i++) {
			System.out.print("Informe a nota: ");
			notas[i] = entrada.nextInt();
		}
		for (int i = 0; i <= 3; i++) {
			System.out.println("Posição [ " + i + " ] : " + notas[i]);
		}

		entrada.close();
	}

}
