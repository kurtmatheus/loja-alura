package loja.pedido.acao;

import loja.pedido.Pedido;

public class SalvarPedidoBancoDeDados implements AcaoAposGerarPedido {
	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando Pedido no Banco de Dados!");		
	}
}
