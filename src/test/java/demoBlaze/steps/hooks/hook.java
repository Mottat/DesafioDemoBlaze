package demoBlaze.steps.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import static demoBlaze.TestBase.getDriver;
import static demoBlaze.TestBase.quitDriver;
//import static demoBlaze.TestBase.quitDriver;

public class hook {

    private WebDriver driver;

    @Before
    public void setUp(){
        driver = getDriver();
        driver.get("https://www.demoblaze.com/index.html");
    }

    @After
    public void finish(){
        quitDriver();
    }

}
