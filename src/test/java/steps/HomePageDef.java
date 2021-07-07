package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.BasicPage;

public class HomePageDef {
    BasicPage basicPage = new BasicPage();

    @Then("Click avatar button")
    public void clickAvatarButton() {
        String avatarName = UserConfig.USER_FIRST_NAME;
        basicPage.clickButtonSpan(avatarName);


    }
}
