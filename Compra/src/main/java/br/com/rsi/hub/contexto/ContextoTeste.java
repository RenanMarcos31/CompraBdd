package br.com.rsi.hub.contexto;

import br.com.rsi.hub.managers.WebDriverManager;
import br.com.rsi.hub.utils.PageManager;

public class ContextoTeste {

	private WebDriverManager webDriverManager;
	private PageManager pageObjectManager;

	public ContextoTeste() {
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageManager(webDriverManager.getDriver());
	}

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public PageManager getPageObjectManager() {
		return pageObjectManager;
	}
}
