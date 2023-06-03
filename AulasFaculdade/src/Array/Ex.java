package Array;

import java.util.Arrays;

public class Ex {
	public static void main(String[] args) {

		int[] notas = new int[5];
		notas[0] = 2;
		notas[1] = 5;
		notas[2] = 6;
		notas[3] = 9;
		notas[4] = 10;

		System.out.println(Arrays.toString(notas));

		for (int n : notas) {
			System.out.println(n);
		}
	}

}
