package ternario;

import javax.swing.JOptionPane;

public class Ex {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe um número");
		int num1 = Integer.parseInt(valor);
		
		String resultado = (num1 % 2 ==0) ? "Par" : "Ímpar";
		
		JOptionPane.showMessageDialog(null, "O número informado é:\n " +  resultado);
		
	}

}
