package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(css = "[type=\"email\"]")
    private WebElement usernameInput;
    @FindBy(css = "[type=\"password\"]")
    private WebElement passwordInput;
    @FindBy(css = "[class=\"form_auth_button\"]")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginToApp(String username, String password) {
        fillText(usernameInput, username);
        fillText(passwordInput, password);
        clickElement(loginButton);
    }

}