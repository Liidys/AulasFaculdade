package loja;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
	private Date momentoCompra;
	private Status status;
	private Cliente cliente;

	List<ItensPedidos> itens = new ArrayList<>();

	public Pedido(Date momentoCompra, Status status, Cliente cliente) {
		this.cliente = cliente;
		this.momentoCompra = momentoCompra;
		this.status = status;
	}

	public void adicionarItem(ItensPedidos item) {
		this.itens.add(item);
	}

	public void removerItem(ItensPedidos item) {
		this.itens.remove(item);
	}

	public double total() {
		double total = 0.0;
		for (ItensPedidos i : itens) {
			total += i.valorToltal();
		}
		return total;
	}

	public Date getMomentoCompra() {
		return momentoCompra;
	}

	public void setMomentoCompra(Date momentoCompra) {
		this.momentoCompra = momentoCompra;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		StringBuilder sb = new  StringBuilder();
		sb.append("Data do pedido: ");
		sb.append(sdf.format(momentoCompra));
		sb.append("\nStatus do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens pedidos: ");
		for(ItensPedidos item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Preço total: R$:");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
