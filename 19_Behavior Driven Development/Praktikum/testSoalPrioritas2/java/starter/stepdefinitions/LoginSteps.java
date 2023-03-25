package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Login;

public class LoginSteps {
    @Steps
    Login login;
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        
    }

    @When("I enter my username and password correctly")
    public void iEnterMyUsernameAndPasswordCorrectly() {
        
    }

    @And("I click login button")
    public void iClickLoginButton() {
        
    }

    @Then("I am on the home page")
    public void iAmOnTheHomePage() {
    }
}
