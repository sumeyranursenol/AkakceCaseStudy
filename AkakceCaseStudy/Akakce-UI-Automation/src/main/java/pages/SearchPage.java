package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By searchBox = By.name("search-box");
    private final By searchButton = By.id("search-button");

    public void enterSearchQuery(String query) {
        driver.findElement(searchBox).sendKeys(query);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }
}
