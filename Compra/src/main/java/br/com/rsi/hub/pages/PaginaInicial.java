package br.com.rsi.hub.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaginaInicial {

	private WebDriver driver;
	
	public PaginaInicial(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
		@FindBy(how = How.ID, using = "miceImg")
		private static WebElement btnMice;
		
		@FindBy(how = How.ID, using = "30")
		private static WebElement productMouse;
		
		@FindBy(how = How.NAME, using = "save_to_cart")
		private static WebElement btnAddCarrinho;
		
		@FindBy(how = How.ID, using = "checkOutPopUp")
		private static WebElement btnChecarCarrinho;
		
		public void clickBtnMice() {
			btnMice.click();
		}
		
		public void clickMouse() {
			productMouse.click();
		}
		
		public void clickAddCarrinho() {
			btnAddCarrinho.click();
		}
		
		public void clickChecarCarrinho() {
			btnChecarCarrinho.click();
		}
		
		public WebElement getBtnMice() {
			return btnMice;
		}
		
		public WebElement getMouse() {
			return productMouse;
		}
		
		public WebElement getAddCarrinho() {
			return btnAddCarrinho;
		}
		
		public WebElement getChecarCarrinho() {
			return btnChecarCarrinho;
		}
}
