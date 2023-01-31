package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginStep {
    @Dado("que eu esteja na pagina: {string}")
    public void queEuEstejaNaPagina(String arg0) {
    }

    @Quando("preencher email: {string} e senha: {string}")
    public void preencherEmailESenha(String arg0, String arg1) {
    }

    @E("clicar em fazer login")
    public void clicarEmFazerLogin() {
    }

    @Entao("valido que a pagina Minha Conta foi carregada")
    public void validoQueAPaginaMinhaContaFoiCarregada() {
    }
}
