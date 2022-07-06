package loja.pedido;

import loja.pedido.acao.AcaoAposGerarPedido;

public class LogDePedido implements AcaoAposGerarPedido{

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Pedido Gerado com sucesso: " + pedido);
	}

}
