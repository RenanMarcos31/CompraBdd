package br.com.rsi.hub.utils;

import org.openqa.selenium.WebDriver;

import br.com.rsi.hub.pages.OrdemPagamento;
import br.com.rsi.hub.pages.PaginaInicial;

public class PageManager {

	private static WebDriver driver;
	private PaginaInicial paginaInicial;
	private OrdemPagamento pagamento;
	
	public PageManager(WebDriver driver) {
		PageManager.driver = driver;
	}

	public PaginaInicial getPaginaInicial() {
		return (paginaInicial == null) ? paginaInicial = new PaginaInicial(driver) : paginaInicial;
	}

	public OrdemPagamento getOrdemPagamento() {
		return (pagamento == null) ? pagamento = new OrdemPagamento(driver) : pagamento;
	}
}
