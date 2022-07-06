package loja.pedido.acao;

import loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{
	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando E-mail com dados do Pedido");		
	}
}
