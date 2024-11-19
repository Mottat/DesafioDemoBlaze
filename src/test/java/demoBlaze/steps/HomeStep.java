package demoBlaze.steps;

import demoBlaze.TestBase;
import demoBlaze.tasks.HomeTasks;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class HomeStep extends TestBase {

    HomeTasks homeTasks = new HomeTasks(getDriver());

    public HomeStep() {
    }

    @Dado("que acesso site do DemoBlaze")
    public void queAcessoSiteDoDemoBlaze() {

    }
    @Quando("pesquiso um monitor")
    public void pesquisoUmMonitor() {
        homeTasks.clicarMenu();
        homeTasks.clicarMonitor();
    }
    @Quando("adiciono monitor no carrinho")
    public void adicionoMonitorNoCarrinho() {
        homeTasks.addcarrinho();
        homeTasks.clicarOK();
        homeTasks.clicarCarrinho();
    }
    @Entao("realizo compra do monitor")
    public void realizoCompraDoMonitor() {
        homeTasks.clicarOrder();
        homeTasks.informarNome();
        homeTasks.informarPais();
        homeTasks.informarCidade();
        homeTasks.informarCartao();
        homeTasks.informarMes();
        homeTasks.informarAno();
    }
    @E("finalizo a compra")
    public void finalizoACompra() {
        homeTasks.clicarPurchase();
        homeTasks.okFinal();
    }
}
