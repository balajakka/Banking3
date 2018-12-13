package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by balajakka on 13/12/2018.
 */
public class HookTest {

    public static WebDriver myDriver;

    @Before
    public void beforeScenario(){
        System.setProperty("webdriver.chrome.driver","./src/test/java/StepDefinition/chromedriver");
        myDriver = new ChromeDriver();
    }

    @After
    public void afterScenario(){
        myDriver.quit();
    }
}
