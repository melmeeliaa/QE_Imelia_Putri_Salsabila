package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.search.Search;

public class SearchSteps {

    @Steps
    Search search;
    @Given("I am on the home page now")
    public void iAmOnTheHomePageNow() {

    }

    @When("click field search")
    public void clickFieldSearch() {

    }

    @And("type in the account name")
    public void typeInTheAccountName() {

    }

    @Then("click enter")
    public void clickEnter() {

    }

    @And("select an account name")
    public void selectAnAccountName() {
    }
}
