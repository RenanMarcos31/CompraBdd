package br.com.rsi.hub.steps;

import org.openqa.selenium.WebDriver;

import br.com.rsi.hub.pages.OrdemPagamento;
import br.com.rsi.hub.pages.PaginaInicial;
import br.com.rsi.hub.utils.DriveFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CompraStep {

	private WebDriver driver;
	private PaginaInicial Inicial;
	private OrdemPagamento pagamento;
	
		@Dado("^que estou na pagina inicial")
		public void que_estou__na_pagina_inicial() {
			driver = new DriveFactory().createChrome();
		}
		
		@Quando("^clico no produto")
		public void clico_no_produto() {
			Inicial.clickBtnMice();
			Inicial.clickMouse();
		}
		
		@E("^adiciono no carrinho")
		public void adiciono_no_carrinho() {
			Inicial.clickAddCarrinho();
			Inicial.clickChecarCarrinho();
		}
		
		@E("^faco login")
		public void faco_login() {
			pagamento = new OrdemPagamento(driver);
			pagamento.boxTxtUsuario("RenanMarcos10");
			pagamento.boxTxtSenha("Test@123");
			pagamento.clickBtnConectar();
			pagamento.clickBtnProximo();
		}
		
		@E("^escolho a forma de pagamento")
		public void escolho_a_forma_de_pagamento() {
			pagamento.boxSafepayUser("RenanMarcos123");
			pagamento.boxSafepaySenha("Senha@123");
		}
		
		@Entao("^finalizo a compra")
		public void finalizo_a_compra() {
			pagamento.clickPlayNow();
		}
}
