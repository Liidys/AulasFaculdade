package Switch;


import java.util.Scanner;

public class ExSwitchCase3003 {

	// comando de escolha

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe Sexo M ou F : ");
		String sexo = entrada.next();

		switch (sexo.toUpperCase()) {
		case "M":
			System.out.println("Masculino");
			break;

		case "F":
			System.out.println("Feminino");
			break;

		default:
			System.out.println("Sexo inválido");

		}

		entrada.close();
	}

}
