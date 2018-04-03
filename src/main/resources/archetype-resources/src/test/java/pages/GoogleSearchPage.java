#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class GoogleSearchPage extends PageObject{

	@FindBy(id = "lst-ib")
	private WebElement campoPesquisa;

	@FindBy(id = "hdtb-msb")
	private WebElement elementoValidacaoPesquisaConcluida;

	public WebElement getCampoPesquisa() {
		return campoPesquisa;
	}

	public WebElement getElementoValidacaoPesquisaConcluida() {
		return elementoValidacaoPesquisaConcluida;
	}
}
