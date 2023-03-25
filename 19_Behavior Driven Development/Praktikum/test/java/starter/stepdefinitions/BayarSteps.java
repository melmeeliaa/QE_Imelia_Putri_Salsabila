package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pembayaran.Pembayaran;

public class BayarSteps {
    @Steps
    Pembayaran pembayaran;
    @Given("I'm on the payment method page")
    public void onThePaymentMethodPage() {

    }

    @When("I choose a payment method")
    public void chooseAPaymentMethod() {

    }

    @And("I click pay now")
    public void clickPayNow() {

    }

    @Then("I managed to make a payment")
    public void managedToMakePayment() {
    }
}
