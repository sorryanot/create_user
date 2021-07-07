package steps;

import io.cucumber.java.en.Then;
import pages.BasicPage;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

    @Then("Click {string} button div")
    public void clickButtonDiv(String arg0) {
        basicPage.clickButtonDiv(arg0);
    }

    @Then("Click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickButton(arg0);
    }

    @Then("Click {string} button span")
    public void clickButtonSpan(String arg0) {
        basicPage.clickButtonSpan(arg0);
    }

    @Then("Click {string} button li")
    public void clickButtonLi(String arg0) {
        basicPage.clickButtonLi(arg0);
    }
}
