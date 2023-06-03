package ifElse;

import javax.swing.JOptionPane;

public class Questao3003 {
	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog("Informe o primeiro número: ");
		int valor1 = Integer.parseInt(num1);
		
		String num2 = JOptionPane.showInputDialog("Informe o segundo número: ");
		int valor2 = Integer.parseInt(num2);
		
		int soma = valor1 + valor2;
		
		int resultado = (soma >= 20) ? soma + 8 : soma -5;
		
		JOptionPane.showMessageDialog(null, resultado);
		
		
		
	}
	

}
