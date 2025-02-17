package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSteps {

    WebDriver driver;

    @Given("User opens akakce.com site")
    public void userOpensAkakceComSite() {
        driver = new ChromeDriver();
        driver.get("https://www.akakce.com");
    }

    @Given("User Logs in")
    public void UserLogsIn() {

        WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Giriş Yap')]"));
        loginButton.click();
        WebElement usernameField = driver.findElement(By.id("login-username"));
        usernameField.sendKeys("sumeyrasenol123@gmail.com");

        WebElement passwordField = driver.findElement(By.id("login-password"));
        passwordField.sendKeys("sumeyra524");

        WebElement submitButton = driver.findElement(By.id("login-submit"));
        submitButton.click();
    }

    @When("User searches for {string} product")
    public void userSearches(String productName) {
        WebElement searchBox = driver.findElement(By.id("search-input"));
        searchBox.sendKeys(productName);
        WebElement searchButton = driver.findElement(By.id("search-button"));
        searchButton.click();
    }


    @When("User selects product")
    public void userSelectsProduct(String productName) {
        WebElement product = driver.findElement(By.xpath("//a[contains(@href, 'iphone')]"));
        product.click();
    }

    @Then("User adds the product to the watch list")
    public void userAddsTheProductToTheWatchList() {
        WebElement addToFollowListButton = driver.findElement(By.id("add-to-follow"));
        addToFollowListButton.click();
        driver.quit();
    }
}
