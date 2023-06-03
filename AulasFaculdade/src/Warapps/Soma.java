package Warapps;

import javax.swing.JOptionPane;

public class Soma {
	
	public static void main(String[] args) {
		
	
	String valor1 = JOptionPane.showInputDialog("Informe um valor");
	int num1 = Integer.parseInt(valor1);
	
	String valor2 = JOptionPane.showInputDialog("Informe um valor");
	int num2 = Integer.parseInt(valor2);
	
	int soma = num1 + num2;
	
	JOptionPane.showMessageDialog(null,"O resultado é: " + soma);
	
	}
	

}
