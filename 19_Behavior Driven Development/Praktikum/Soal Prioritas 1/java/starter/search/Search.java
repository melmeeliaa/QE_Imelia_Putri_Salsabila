package starter.search;

import net.thucydides.core.annotations.Step;

public class Search {
    @Step("I am on the home page now")
    public void iAmOnTheHomePageNow() {
        System.out.println("I am on the home page now");

    }

    @Step("click field search")
    public void clickFieldSearch() {
        System.out.println("click field search");
    }

    @Step("type in the account name")
    public void typeInTheAccountName() {
        System.out.println("type in the account name");
    }

    @Step("click enter")
    public void clickEnter() {
        System.out.println("click enter");
    }

    @Step("select an account name")
    public void selectAnAccountName() {
        System.out.println("select an account name");
    }
}
