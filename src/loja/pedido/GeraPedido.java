package loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {
	private String cliente;
	private BigDecimal valorOrcamento;
	private int qtItens;
	
	//injecao de dependencias: PedidoRepository, EmailService
	public GeraPedido(String cliente, BigDecimal valorOrcamento, int qtItens) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.qtItens = qtItens;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}
	
	public int getQtItens() {
		return qtItens;
	}
}
