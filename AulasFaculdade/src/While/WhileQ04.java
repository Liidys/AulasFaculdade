package While;

public class WhileQ04{ 

	public static void main(String[] args) {

		int cont = 1;
		while (cont <= 28) {

			if (cont % 4 == 0) {
				System.out.print(" PI");
			} else {
				System.out.print(" " + cont);
			}

			cont++;

		}
	}
}
