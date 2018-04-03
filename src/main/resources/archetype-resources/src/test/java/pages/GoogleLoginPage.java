#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class GoogleLoginPage extends PageObject{

	@FindBy(id="gb_70")
	private WebElement loginButton;
	
	@FindBy(id="identifierId")
	private WebElement campoEmail;
	
	@FindBy(id="identifierNext")
	private WebElement nextEmail;

	@FindBy(xpath="//*[@id=\"password\"]/div[1]/div/div[1]/input")
	private WebElement campoSenha;
	
	@FindBy(id="passwordNext")
	private WebElement nextPassword;

	@FindBy(xpath="//*[@id=\"password\"]/div[2]/div[2]")
	private WebElement falhaNoLogin;
	
	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getCampoEmail() {
		return campoEmail;
	}

	public WebElement getNextEmail() {
		return nextEmail;
	}

	public WebElement getCampoSenha() {
		return campoSenha;
	}

	public WebElement getNextPassword() {
		return nextPassword;
	}

	public WebElement getMensagemDeFalhaNoLogin() {
		return falhaNoLogin;
	}
}
