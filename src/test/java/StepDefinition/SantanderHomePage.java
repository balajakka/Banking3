package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static StepDefinition.HookTest.myDriver;

/**
 * Created by balajakka on 13/12/2018.
 */
public class SantanderHomePage {
    //WebElement loginButton = myDriver.findElement(By.xpath("//a[@class='buttonLogin2 noresponsive']"));
    @FindBy(xpath = "//a[@class='buttonLogin2 noresponsive']")
    WebElement loginButton;

    public SantanderHomePage(WebDriver driver){
        myDriver = driver;
        PageFactory.initElements(driver,this);
    }

    public Boolean isLoginButtonDisplayed(){
        return loginButton.isDisplayed();
    }

    public String getHomePageTitle(){
        return myDriver.getTitle();
    }
}
