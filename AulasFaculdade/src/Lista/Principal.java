package Lista;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		Aluno a1 = new Aluno();
		System.out.println("Informe o nome do aluno: ");
		a1.setNome(entrada.next()); 
		
		System.out.println("Informe a idade do aluoo:  ");
		a1.setIdade(entrada.nextInt());
		
		System.out.println("Informe a faculdade do aluno: ");
		a1.setFaculdade(entrada.next());
		
		
		
//		Disciplina d1 = new Disciplina();
//		d1.setNome(null);
		entrada.close();
		
	}
}
