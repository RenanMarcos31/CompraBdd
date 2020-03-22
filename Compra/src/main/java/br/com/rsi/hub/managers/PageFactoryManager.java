package br.com.rsi.hub.managers;

import org.openqa.selenium.WebDriver;

import br.com.rsi.hub.pages.OrdemPagamento;
import br.com.rsi.hub.pages.PaginaInicial;

public class PageFactoryManager {

	private WebDriver driver;
	private PaginaInicial paginaInicial;
	private OrdemPagamento pagamento;

	public PageFactoryManager(WebDriver driver) {
		this.driver = driver;
	}

	public PaginaInicial getPaginaInicial() {
		return (paginaInicial == null) ? paginaInicial = new PaginaInicial(driver) : paginaInicial;
	}

	public OrdemPagamento getPaginaDeProdutos() {

		return (pagamento == null) ? pagamento = new OrdemPagamento(driver) : pagamento;

	}
}
