package login.just;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Authorization_Positive {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.get("http://u920152e.beget.tech/");

        driver.findElement(By.cssSelector("[type=\"email\"]")).sendKeys("test@gmail.com");
        driver.findElement(By.cssSelector("[type=\"password\"]")).sendKeys("123");
        driver.findElement(By.cssSelector("[type=\"next\"]")).click();
        driver.findElement(By.cssSelector("[class=\"form_auth_button\"]")).click();

        driver.quit();
    }
}
//just. not seriously