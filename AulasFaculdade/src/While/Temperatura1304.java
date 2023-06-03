package While;

import java.util.Scanner;

public class Temperatura1304 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		char continua = 'S';
		double f;

		while (continua == 'S') {
			System.out.print("Informe a temperatura em celsius: ");
			double c = entrada.nextDouble();

			f = (9 * (c / 5)) + 32;

			System.out.printf("A temp em F : %.2f\n", f);

			System.out.println("Digite S- sim e N- Não");
			continua = entrada.next().toUpperCase().charAt(0);
		}
		System.out.println("Finalizado !");

		entrada.close();

	}

}
