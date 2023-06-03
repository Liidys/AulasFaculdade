package Array;

import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		
		for (int i = 0; i <= 4; i++) {
			System.out.print("Informe um valor: ");
			a[i] = entrada.nextInt();
			b[i] = a[i];
		}
		for(int i : a) {
			System.out.println(i);
		}
		for(int i : b) {
			System.out.println(i);
		}
		
		entrada.close();
	}

}
