package poo;

public class Retangulo { // bin -> não executável

	public double width;
	public double heigth;

	public double area() {
		return this.width * this.heigth;
	}

	public double diagonal() {
		return Math.sqrt((this.width * this.width) + (this.heigth * this.heigth));
	}

	public double perimetro() {
		return 2 * (this.width * this.heigth);
	}

}
