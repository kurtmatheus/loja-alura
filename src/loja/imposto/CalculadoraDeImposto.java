package loja.imposto;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class CalculadoraDeImposto {
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);	
	}		
}