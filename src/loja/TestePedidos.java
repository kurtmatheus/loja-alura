package loja;

import java.math.BigDecimal;
import java.util.Arrays;

import loja.pedido.GeraPedido;
import loja.pedido.GeraPedidoHandler;
import loja.pedido.acao.EnviarEmailPedido;
import loja.pedido.acao.SalvarPedidoBancoDeDados;

public class TestePedidos {
	public static void main(String[] args) {
		String cliente = "Marcelle de Nazaré";
		BigDecimal valorOrcamento = new BigDecimal("600");
		int qtItens = 4;
		
		GeraPedido pedido = new GeraPedido(cliente, valorOrcamento, qtItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoBancoDeDados(), new EnviarEmailPedido()));
		handler.execute(pedido);
	}	
}
