package starter.pembayaran;

import net.thucydides.core.annotations.Step;

public class Pembayaran {
    @Step("I'm on the payment method page")
    public void onThePaymentMethodPage() {

        System.out.println("I'm on the payment method page");
    }

    @Step("I choose a payment method")
    public void chooseAPaymentMethod() {
        System.out.println("I choose a payment method");
    }
    @Step("I click pay now")
    public void clickPayNow()  {
        System.out.println("I click pay now");
    }
    @Step("I managed to make a payment")
    public void managedToMakePayment() {
        System.out.println("I managed to make a payment");
    }
}
