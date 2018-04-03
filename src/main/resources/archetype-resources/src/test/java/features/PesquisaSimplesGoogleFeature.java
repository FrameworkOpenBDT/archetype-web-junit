#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.features;

import org.junit.Test;

import ${package}.steps.GoogleSearchSteps;
import io.openbdt.support.Feature;
import net.thucydides.core.annotations.Steps;

public class PesquisaSimplesGoogleFeature extends Feature{

    @Steps
    GoogleSearchSteps search;

    @Test
    public void pesquisa() {
    	search.abrirNavegador("https://www.google.com");
    	search.preencherCampoPesquisa("java");
    	search.iniciarPesquisa();
    	search.validarPesquisaConcluida();
    }
}

