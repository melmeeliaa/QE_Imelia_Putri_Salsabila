package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.editprofil.EditProfil;

public class EditprofilSteps {
    @Steps
    EditProfil editProfil;
    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
    }

    @When("click my profile icon")
    public void clickMyProfileIcon() {

    }

    @And("click view profile")
    public void clickViewProfile() {

    }

    @Then("click Edit your public profile")
    public void clickEditYourPublicProfile() {

    }

    @And("Customize Your Public Profile")
    public void customizeYourPublicProfile() {
    }
}
