package loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import loja.orcamento.Orcamento;
import loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {
	
	private List<AcaoAposGerarPedido> acoes;
		
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	} 
	
	@SuppressWarnings("unused")
	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtItens());
		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		acoes.forEach(a -> a.executarAcao(pedido));
	}
}
