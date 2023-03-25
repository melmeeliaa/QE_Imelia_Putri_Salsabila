package starter.darkmode;

import net.thucydides.core.annotations.Step;

public class DarkMode {
    @Step("I am on the home page.")
    public void iAmOnTheHomePage() {
        System.out.println("I am on the home page.");

    }

    @Step("click my profile icon.")
    public void clickMyProfileIcon() {
        System.out.println("click my profile icon.");
    }

    @Step("click settings and privacy")
    public void clickSettingsAndPrivacy() {
        System.out.println("click settings and privacy");
    }

    @Step("click the arrow on the display")
    public void clickTheArrowOnTheDisplay() {
        System.out.println("click the arrow on the display");
    }

    @Step("select dark mode")
    public void selectDarkMode() {
        System.out.println("select dark mode");
    }
}
