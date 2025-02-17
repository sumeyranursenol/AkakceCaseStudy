package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By loginButton = By.id("login-button");

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}
