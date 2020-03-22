package br.com.rsi.hub.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrdemPagamento {

	private WebDriver driver;

	public OrdemPagamento(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "usernameInOrderPayment")
	private static WebElement txtUsuario;

	@FindBy(how = How.NAME, using = "passwordInOrderPayment")
	private static WebElement txtSenha;

	@FindBy(how = How.ID, using = "login_btnundefined")
	private static WebElement btnConectar;

	@FindBy(how = How.ID, using = "next_btn")
	private static WebElement btnProximo;

	@FindBy(how = How.NAME, using = "safepay_username")
	private static WebElement txtSafepayUsername;

	@FindBy(how = How.NAME, using = "safepay_password")
	private static WebElement txtSafepaySenha;

	@FindBy(how = How.ID, using = "pay_now_btn_SAFEPAY")
	private static WebElement btnPlayNow;

	public void boxTxtUsuario(String usernameS) {
		txtUsuario.sendKeys(usernameS);
	}
	
	public void boxTxtSenha(String senhaS) {
		txtSenha.sendKeys(senhaS);
	}
	
	public void clickBtnConectar() {
		btnConectar.click();
	}

	public void clickBtnProximo() {
		btnProximo.click();
	}
	
	public void boxSafepayUser(String safepayUserS) {
		txtSafepayUsername.sendKeys(safepayUserS);
	}
	
	public void boxSafepaySenha(String safepaySenhaS) {
		txtSafepayUsername.sendKeys(safepaySenhaS);
	}
	
	public void clickPlayNow() {
		btnPlayNow.click();
	}
	
	public WebElement getTxtUsuario() {
		return txtUsuario;
	}
	
	public WebElement getTxtSenha() {
		return txtSenha;
	}
	
	public WebElement getBtnConectar() {
		return btnConectar;
	}
	
	public WebElement getBtnProximo() {
		return btnProximo;
	}
	
	public WebElement getSafepayUser() {
		return txtSafepayUsername;
	}
	
	public WebElement getSafepaySenha() {
		return txtSafepaySenha;
	}
	
	public WebElement getBtnPlayNow() {
		return btnPlayNow;
	}
}
