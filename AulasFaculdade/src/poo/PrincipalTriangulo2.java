package poo;

import java.util.Scanner;

public class PrincipalTriangulo2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();

		System.out.println("Informe o lados do triangulo X ");
		System.out.print("Informe o lado A: ");
		x.a = entrada.nextDouble();
		System.out.print("Informe o lado B: ");
		x.b = entrada.nextDouble();
		System.out.print("Informe o lado C: ");
		x.c = entrada.nextDouble();

		System.out.println("Informe o lados do triangulo Y ");
		System.out.print("Informe o lado A: ");
		y.a = entrada.nextDouble();
		System.out.print("Informe o lado B: ");
		y.b = entrada.nextDouble();
		System.out.print("Informe o lado C: ");
		y.c = entrada.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triângulo X área: %.2f%n", areaX);
		System.out.printf("Triângulo Y área: %.2f%n", areaY);

		entrada.close();
	}

}
