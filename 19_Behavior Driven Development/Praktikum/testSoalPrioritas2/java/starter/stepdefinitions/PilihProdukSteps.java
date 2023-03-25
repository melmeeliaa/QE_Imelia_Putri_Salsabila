package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pilihproduk.PilihProduk;

public class PilihProdukSteps {

    @Steps
    starter.pilihproduk.PilihProduk pilihProduk;
    @Given("I am on the product page")
    public void iAmOnTheProductPage() {

    }

    @When("I select a product")
    public void iSelectAProduct() {

    }

    @And("I entered the phone number")
    public void iEnteredThePhoneNumber() {

    }

    @Then("I chose nominal")
    public void iChoseNominal() {

    }

    @And("I go to the payment page")
    public void iGoToThePaymentPage() {

    }
}
