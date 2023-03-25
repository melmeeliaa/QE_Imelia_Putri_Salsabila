package starter.editprofil;

import net.thucydides.core.annotations.Step;


public class EditProfil {
    @Step("I am on the home page")
    public void iAmOnTheHomePage() {
        System.out.println("I am on the home page");
    }

    @Step("click my profile icon")
    public void clickMyProfileIcon() { System.out.println("click my profile icon");

    }

    @Step("click view profile")
    public void clickViewProfile() { System.out.println("click view profile");

    }

    @Step("click Edit your public profile")
    public void clickEditYourPublicProfile() { System.out.println("click Edit your public profile");

    }

    @Step("Customize Your Public Profile")
    public void customizeYourPublicProfile() { System.out.println("Customize Your Public Profile");
    }
}
