package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import pages.SignInPage;

import static app_context.RunContext.*;

public class SignInPageDef {
    SignInPage signInPage = new SignInPage();

    @Then("Input email")
    public void inputEmail() {
        String email = "Auto_" + RandomStringUtils.randomAlphabetic(5) + "@mail.com";
        signInPage.inputEmail(email);
        put("email", email);
    }

    @Then("Input password")
    public void inputPassword() {
        signInPage.inputPassword(UserConfig.USER_PASSWORD);
    }

    @Then("Input First Name")
    public void inputFirstName() {
        String firstName = UserConfig.USER_FIRST_NAME;
        signInPage.inputFirstName(firstName);
        put("firstName", firstName);
    }

    @Then("Input Last Name")
    public void inputLastName() {
        String lastName = UserConfig.USER_LAST_NAME;
        signInPage.inputLastName(lastName);
        put("lastName", lastName);
    }

    @Then("Check First Name")
    public void checkFirstName() {
        String expectName = get("firstName", String.class);
        String actualName = signInPage.getFirstName();
        Assert.assertEquals(expectName, actualName);
    }

    @Then("Check Last Name")
    public void checkLastName() {
        String expectName = get("lastName", String.class);
        String actualName = signInPage.getLastName();
        Assert.assertEquals(expectName, actualName);
    }
}
