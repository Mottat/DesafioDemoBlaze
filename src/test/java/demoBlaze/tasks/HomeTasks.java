package demoBlaze.tasks;

import demoBlaze.pages.HomePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeTasks extends HomePage {

    private final WebDriver driver;

    public HomeTasks(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public void clicarMenu(){
        menuMonitor.click();
    }

    public void clicarMonitor(){
        selectMonitor.click();
    }

    public void addcarrinho(){
        addCart.click();
    }

    public void clicarOK(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void clicarCarrinho(){
        clicarCart.click();
    }

    public void clicarOrder(){
        botaoOrder.click();
    }

    public void informarNome(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id=\"name\"]")));
        name.click();
        name.sendKeys("Motta");
    }

    public void informarPais(){
        pais.click();
        pais.sendKeys("Brasil");
    }

    public void informarCidade(){
        cidade.click();
        cidade.sendKeys("Porto Alegre");
    }

    public void informarCartao(){
        cartaoCredito.click();
        cartaoCredito.sendKeys("12345");
    }

    public void informarMes(){
        mes.click();
        mes.sendKeys("Novembro");
    }

    public void informarAno(){
        ano.click();
        ano.sendKeys("2024");
    }

    public void clicarPurchase(){
        purchase.click();
    }

    public void okFinal(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class=\"sa-placeholder\"]")));
        ultimoOK.click();
    }

}
