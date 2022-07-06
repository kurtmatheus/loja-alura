package loja.orcamento;

import java.util.Map;

import loja.DomainException;
import loja.http.HttpAdapter;

public class RegistroDeOrcamento {
	
	private HttpAdapter http;
	
	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}
	
	public void registrar(Orcamento orcamento) {
		/*Chamada de API externa:
		 * URL Connection
		 * Http Client
		 * lib Rest*/
		
		if(!orcamento.isFinalizado()) {
			throw new DomainException("Orçamento não finalizado!"); 
		}
		
		String url = "http://api.externa/registroOrcamento";
		Map<String, Object> dados = Map.of(
				"valor", orcamento.getValor(),
				"quantidadeItens", orcamento.getQntItens()
				);
		
		http.post(url, dados); 
	}
}
