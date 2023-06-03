package loja;

public class ItensPedidos {
	
	private int quantidade;
	private double preco;
	private Produto produto;
	
	ItensPedidos(int quantidade, double preco , Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double valorToltal() {
		return this.preco * this.quantidade;
	}
	
	@Override
	public String toString() {
		return produto.getNome() + ", R$ , Quantidade: " + quantidade + ", Subtotal: R$" +  valorToltal();
	}

}
