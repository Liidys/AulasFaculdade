package poo;

public class Triangulo {
	
	public double a;
	public double b;
	public double c;


	public double p() {
		return (this.a + this.b + this.c) / 2;
	}
	
	public double area() {
		double p = p();
		return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
	}
	
	public void tamanho(double x, double y) {
		double areaX = x, areaY = y;
		if(areaX > areaY) {
			System.out.println("Larger área: ");
			
		}else {
			System.out.println("Larger área: ");
		}
	}
}

