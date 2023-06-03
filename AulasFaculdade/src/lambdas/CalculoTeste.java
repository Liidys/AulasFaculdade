package lambdas;

public class CalculoTeste {
	
	public static void main(String[] args) {
		
		Calculo cauculo = new Somar();
		System.out.println(cauculo.executar(2, 6));
		
		cauculo = new Multiplicar();
		System.out.println(cauculo.executar(2, 8));
		
		
	}

}
