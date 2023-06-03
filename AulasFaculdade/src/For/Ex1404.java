package For;

import java.util.Scanner;

public class Ex1404 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int valor = 0;

		do {

			System.out.print("Informe o primeiro número: ");
			int n1 = entrada.nextInt();

			System.out.print("Informe o segundo número: ");
			int n2 = entrada.nextInt();

			System.out.println("Qual operação quer fazer ? \n1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão");
			System.out.println("Para sair digite -999 ");
			valor = entrada.nextInt();

			int resultado = 0;
			boolean valido = true;

			switch (valor) {

			case 1:
				resultado = n1 + n2;
				break;
			case 2:
				resultado = n1 - n2;

				break;
			case 3:
				resultado = n1 * n2;
				break;
			case 4:
				resultado = n1 / n2;
				break;

			default:
				System.out.println("Opção inválida");
				valido = false;
				break;
			}

			if (valido) {
				System.out.println("Resultado: " + resultado);
				if (resultado > 0) {
					System.out.println("Número positivo");
				} else if (resultado < 0) {
					System.out.println("Número negativo");
				} else {
					System.out.println("Resultado igual a zero");
				}
				if (resultado % 2 == 0) {
					System.out.println("Número par");
				} else {
					System.out.println("Número ímpar");
				}
			}

		} while (valor != -999);

		System.out.println("Finalizado!");

		entrada.close();
	}
}
