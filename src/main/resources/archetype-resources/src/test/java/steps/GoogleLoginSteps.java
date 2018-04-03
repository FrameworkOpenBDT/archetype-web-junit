#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.steps;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import io.openbdt.element.WebBrowserScreenElement;
import ${package}.pages.GoogleLoginPage;
import net.thucydides.core.annotations.Step;

@ContextConfiguration("/context.xml")
public class GoogleLoginSteps {

	private GoogleLoginPage loginPage;
	
	Logger LOG = Logger.getLogger(GoogleLoginSteps.class);
	
	@Autowired
	private WebBrowserScreenElement viewElement;
	
	@Step
	public void abrirNavegador(String url) {
		viewElement.open(url);
	}
	
	@Step
	public void clicarEmFazerLogin() {
		viewElement.click(loginPage.getLoginButton());
	}
	
	@Step
	public void aguardarCarregamentoDaPagina() {
		viewElement.waitForElementIsPresent(10, loginPage.getCampoEmail());
	}
	
	@Step
	public void inserirEmail(String email) {
		viewElement.sendText(loginPage.getCampoEmail(), email);
	}
	
	@Step
	public void inserirSenha(String senha) {
		viewElement.sendText(loginPage.getCampoSenha(), senha);
	}
	
	@Step
	public void avancarParaInserirASenha() {
		viewElement.click(loginPage.getNextEmail());
	}
	
	@Step
	public void avancarParaConfirmarLogin() {
		viewElement.click(loginPage.getNextPassword());
	}

	@Step
	public void verificarMensagemDeFalha() {
		viewElement.waitForElementIsPresent(5, loginPage.getMensagemDeFalhaNoLogin());
	}	
}
