package loja.desconto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	public BigDecimal calcular(Orcamento orcamento) {
		return new DescontoParaOrcamentoMaisDeCincoItens(
				new DescontoOrcamentoMaiorDe500(
						new SemDesconto())).calcular(orcamento);			 
	}
}
