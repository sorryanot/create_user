package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicPage {
    public void clickButtonDiv(String text) {
        $(By.xpath("//div//a[text()='" + text + "']")).click();
    }

    public void clickButton(String text) {
        $(By.xpath("//button[text()='" + text + "']")).click();
    }

    public void clickButtonSpan(String text) {
        $(By.xpath("//span[text()='" + text + "']/..")).click();
    }

    public void clickButtonLi(String text) {
        $(By.xpath("//li[text()='" + text + "']/..")).click();
    }
}
