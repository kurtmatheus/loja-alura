package loja.imposto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public interface Imposto {
	public BigDecimal calcular(Orcamento orcamento);
}
