package While;

import java.util.Scanner;

public class WhileQ03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Qual tabuada quer saber: ");
		int mult = entrada.nextInt();

		int cont = 0;

		while (cont <= 10) {
			System.out.println(mult + "x" + cont + " = " + cont * mult);
			cont++;

		}
		entrada.close();
	}

}
