package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    private By productLink = By.xpath("//a[contains(text(),'iphone')]");

    public void selectProduct() {
        driver.findElement(productLink).click();
    }
}
