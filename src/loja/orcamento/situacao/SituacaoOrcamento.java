package loja.orcamento.situacao;

import java.math.BigDecimal;

import loja.DomainException;
import loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {
	
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Orçamento não pode ser Aprovado!");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Orçamento não pode ser Reprovado!");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Orçamento não pode ser Finalizado!");
	}
}
