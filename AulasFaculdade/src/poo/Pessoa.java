package poo;

public class Pessoa {

	public String nome;
	public String sobrenome;
	public int anoNascimento;
	public int idadeAtual;
	
	public String nomeCompleto() {
		return this.nome + " " + this.sobrenome ;
	}
	
	public void idadeAtual (int anoAtual) {
		idadeAtual =  anoAtual - this.anoNascimento;
	}
	
}
