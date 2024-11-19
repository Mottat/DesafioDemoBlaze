package demoBlaze.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(css = "a[onclick=\"byCat('monitor')\"]")
    public static WebElement menuMonitor;

    @FindBy(css = "a[href='prod.html?idp_=10']")
    public static WebElement selectMonitor;

    @FindBy(css = "a[onclick=\"addToCart(10)\"]")
    public static WebElement addCart;

    @FindBy(id = "cartur")
    public static WebElement clicarCart;

    @FindBy(css = "button[class=\"btn btn-success\"]")
    public static WebElement botaoOrder;

    @FindBy(css = "input[id=\"name\"]")
    public static WebElement name;

    @FindBy(css = "input[id=\"country\"]")
    public static WebElement pais;

    @FindBy(css = "input[id=\"city\"]")
    public static WebElement cidade;

    @FindBy(css = "input[id=\"card\"]")
    public static WebElement cartaoCredito;

    @FindBy(css = "input[id=\"month\"]")
    public static WebElement mes;

    @FindBy(css = "input[id=\"year\"]")
    public static WebElement ano;

    @FindBy(css = "button[onclick=\"purchaseOrder()\"]")
    public static WebElement purchase;

    @FindBy(css = "button[class=\"confirm btn btn-lg btn-primary\"]")
    public static WebElement ultimoOK;

}
