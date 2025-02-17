package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FollowProductPage {
    private WebDriver driver;

    public FollowProductPage(WebDriver driver) {
        this.driver = driver;
    }

    private By followButton = By.id("follow-button");

    public void followProduct() {
        driver.findElement(followButton).click();
    }
}
