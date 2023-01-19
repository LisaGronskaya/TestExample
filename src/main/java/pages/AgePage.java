package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AgePage extends BasePage {

    @FindBy(css = "[class=\"form_auth_style\"]")
    WebElement title;

    public AgePage(WebDriver driver) {
        super(driver);
    }

    public void validateTitle(String expectedText) {
        String titleText = getElementText(title);
        Assert.assertEquals(titleText, expectedText);
    }

    public String getTitle() {
        return getElementText(title);
    }
}
