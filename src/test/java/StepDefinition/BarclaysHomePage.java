package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static StepDefinition.HookTest.myDriver;

/**
 * Created by balajakka on 13/12/2018.
 */
public class BarclaysHomePage {

//    WebElement loginButton = myDriver.findElement(By.xpath("//a[@class='login btn btn-primary btn-sm']"));
//    WebElement registerButton = myDriver.findElement(By.xpath("//a[@class='btn-none']"));
//    WebElement contactusButton = myDriver.findElement(By.xpath("//div[@id='menu-screen']"));
//
//    public Boolean isLoginButtonDisplayed(){
//        return loginButton.isDisplayed();
//    }

    @FindBy(xpath = "//a[@class='login btn btn-primary btn-sm']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@class='btn-none']")
    public WebElement registerButton;

    @FindBy(xpath = "//div[@id='menu-screen']")
    public WebElement contactusButton;

    public BarclaysHomePage(WebDriver driver){
        myDriver = driver;
        PageFactory.initElements(driver,this);
    }

    public Boolean isLoginButtonDisplayed(){
        return loginButton.isDisplayed();
    }

    public Boolean isRegisterButtonDisplayed(){
        return loginButton.isDisplayed();
    }

    public Boolean isContactUsButtonDisplayed(){
        return loginButton.isDisplayed();
    }

    public String getHomePageTitle(){
        return myDriver.getTitle();
    }

}
