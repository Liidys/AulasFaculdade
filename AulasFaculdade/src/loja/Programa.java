package loja;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner entrada = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		System.out.print("Digite com o seu nome: ");
		String nome = entrada.next();
		System.out.print("Digite com o seu E-mail: ");
		String email = entrada.next();
		System.out.print("Digite sua data de nascimento: ");
		Date nascimento = sdf.parse(entrada.next());

		Cliente cliente = new Cliente(nome, email, nascimento);
		System.out.print("Entre com a data do pedido: ");
		@SuppressWarnings("unused")
		Date momentoCompra = sdf.parse(entrada.next());
		System.out.print("Status: ");
		Status status = Status.valueOf(entrada.next().toUpperCase());

		Pedido pedido = new Pedido(new Date(), status, cliente);
		System.out.println("Quantos itens tem no pedido?");
		int n = entrada.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Entre #" + i + " data do item: ");
			System.out.print("Nome do produto: ");
			String produtoNome = entrada.next();
			System.out.print("Preço do produto: ");
			double produtoPreco = entrada.nextDouble();
			Produto produto = new Produto(produtoNome, produtoPreco);

			System.out.print("Quantidade: ");
			int quantidade = entrada.nextInt();

			ItensPedidos itensPedidos = new ItensPedidos(quantidade, produtoPreco, produto);
			pedido.adicionarItem(itensPedidos);
		}

		System.out.println("\nResumo do pedido: " + pedido);

		entrada.close();

	}

}
