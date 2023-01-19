package login;

import helpers.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.AgePage;

public class SuccessTest extends BaseTest {

    @Test
    public void successTest_01() {
        LoginPage loginPage = new LoginPage(driver);
        AgePage productsPage = new AgePage(driver);

        loginPage.loginToApp(Credentials.STANDARD_USER, Credentials.PASSWORD);

        String productsPageTitle = productsPage.getTitle();
        Assert.assertEquals(productsPageTitle, "Сколько Вам лет?\nмладше 18\nот 18 до 24\nот 25 до 35\nболее 35");
    }

}