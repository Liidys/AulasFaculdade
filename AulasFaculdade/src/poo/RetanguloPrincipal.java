package poo;

import java.util.Scanner;

public class RetanguloPrincipal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		Retangulo x = new Retangulo();
		
		System.out.print("Informe a largura: ");
		x.width = entrada.nextDouble();
		
		System.out.println("Informe a altura: ");
		x.heigth = entrada.nextDouble();

		System.out.printf("A área do retângulo é: %.2f \n",  x.area());
		System.out.printf("A diagonal do retângulo é: %.2f \n", x.diagonal());
		System.out.printf("O perimetro do retângulo é: %2.f \n" , x.perimetro());

		entrada.close();

	}

}
