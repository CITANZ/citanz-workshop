package nz.net.citnz.yourproject.ui.steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import nz.net.citnz.yourproject.ui.pages.HomePage;

public class LoadSteps {
    @Steps
    HomePage homePage;

    @Given("^user has launched a browser$")
    public void userHasLaunchedABrowser() {
        homePage.open();
        homePage.getDriver().manage().window().maximize();
    }

    @When("^user wants to load Google home page$")
    public void userWantsToLoadGoogleHomePage() {
        homePage.getDriver().navigate().to("https://www.google.com");
    }

    @Then("^the Google home page should be loaded$")
    public void theGoogleHomePageShouldBeLoaded() {
        homePage.googleSearchField.sendKeys("Hello World!");
        assertEquals(homePage.googleSearchField.getAttribute("value"), "Hello World!");
    }

}
