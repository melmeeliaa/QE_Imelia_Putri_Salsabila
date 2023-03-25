package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.thucydides.core.annotations.Steps;
import starter.darkmode.DarkMode;

public class DarkModeSteps {
    @Steps
    DarkMode darkMode;
    @Given("I am on the home page.")
    public void iAmOnTheHomePage() {

    }

    @When("click my profile icon.")
    public void clickMyProfileIcon() {

    }

    @And("click settings and privacy")
    public void clickSettingsAndPrivacy() {

    }

    @Then("click the arrow on the display")
    public void clickTheArrowOnTheDisplay() {

    }

    @And("select dark mode")
    public void selectDarkMode() {
    }
}
