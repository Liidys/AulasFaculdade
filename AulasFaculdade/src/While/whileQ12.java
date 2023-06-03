package While;

import java.util.Scanner;

public class whileQ12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int x1 = entrada.nextInt();
		int maior = x1;
		int menor = x1;

		int n = 1;

		while (n <= 4) {
			System.out.print("Informe um novo número: ");
			int x2 = entrada.nextInt();

			if (x2 > maior) {
				maior = x2;
			}
			
			if (x2 < menor) {
				menor = x2;
			}
			n++;
		}

		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		
		
		entrada.close();

	}

}
