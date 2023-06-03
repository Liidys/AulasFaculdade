package While;

public class WhileQ07 {

	public static void main(String[] args) {

		int cont = 1;
		int contPar = 0;
		while (cont <= 100) {

			if (cont % 2 == 0) {
				contPar++;

			}
			cont++;
		}
		System.out.print("Quantidade de par é " + contPar);

	}
}