package StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static StepDefinition.HookTest.myDriver;

/**
 * Created by balajakka on 13/12/2018.
 */
public class BankingAccess {

    BarclaysHomePage bhp = new BarclaysHomePage(myDriver);
    SantanderHomePage shp = new SantanderHomePage(myDriver);

    @Given("^I am a Chrome User$")
    public void i_am_a_Chrome_User() {
        //System.setProperty("Webdriver.chromedriver","./src/test/java/StepDefinition/chromedriver");
        System.out.println(" I am in Given");


    }

    @When("^I open Barclays Web Site$")
    public void i_open_Barclays_Web_Site() {
        System.out.println(" I am in When");
        getHomepage("https://www.barclays.co.uk/");

    }

    @Then("^Barclays home page display$")
    public void barclays_home_page_display() {
        System.out.println(" I am in Then");


        Assert.assertEquals(true, bhp.getHomePageTitle().contains("Barclays"));


    }

    @And("^I see Login button$")
    public void i_see_Login_button() {
        System.out.println(" I am in And");
        Assert.assertEquals(true, bhp.isLoginButtonDisplayed());


    }

    @And("^I see Register button$")
    public void i_see_Register_button() {
        System.out.println(" I am in And");
        Assert.assertEquals(true, bhp.isRegisterButtonDisplayed());


    }

    @And("^I see ContactUs button$")
    public void i_see_ContactUs_button() {
        System.out.println(" I am in And");
        Assert.assertEquals(true, bhp.isContactUsButtonDisplayed());


    }

    @When("^I open Santander Web Site$")
    public void i_open_Santander_Web_Site() {
        getHomepage("https://www.santander.co.uk/uk/");

    }

    @Then("^Santander home page display$")
    public void santander_home_page_display() {
        Assert.assertEquals(true,shp.getHomePageTitle().contains("Santander"));

    }

    @And("^I see Santander Login button$")
    public void i_see_Santander_Login_button() {

        Assert.assertEquals(true,shp.isLoginButtonDisplayed());

    }


    public void getHomepage(String bankURL) {
        myDriver.get(bankURL);
    }
}

