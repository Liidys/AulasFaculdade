package poo;

import java.util.Scanner;

public class PessoaPrincipal {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		
		System.out.println("Qual seu nome? ");
		p.nome = entrada.next();
		System.out.println("Qual seu sobrenome? ");
		p.sobrenome = entrada.next();
		System.out.println("Qual o ano de nascimento? ");
		p.anoNascimento = entrada.nextInt();
		System.out.println("Qual é o ano atual? ");
		p.idadeAtual(entrada.nextInt());
		
		System.out.println("Seu nome é: " + p.nomeCompleto() + ", Sua idade atual é: " + p.idadeAtual);
		

		entrada.close();
		
	}

}
