package ifElse;

import java.util.Scanner;

public class Questao010 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Informe sua primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Informe sua segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		System.out.println("Informe sua terceira nota: ");
		double nota3 = entrada.nextDouble();
		
		double media = (nota1 + nota2 + nota3)/3;
		
		if(media>= 7) {
			System.out.println(nome.toUpperCase() + " Você está aprovado(a)!");
		} else if((media >= 5.1) && (media <= 6.9)) {
			System.out.println(nome.toUpperCase() + " Você está na final!");
		} else {
			System.out.println(nome.toUpperCase() + " Você está reprovado! ");
		}
		
		entrada.close();
	}

}
