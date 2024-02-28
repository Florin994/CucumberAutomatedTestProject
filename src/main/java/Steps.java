import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Steps {
    WebDriver driver = new FirefoxDriver();

    @Given("user navigate to login page by opening FireFox")
    public void goToLoginPage() {
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
    }

    @When("user inputs valid username and password")
    public void inputUsernameAndPassword() {
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
    }

    @And("user clicks on login button")
    public void clickLoginButton() {
        driver.findElement(By.cssSelector("#login-button")).click();
    }

    @Then("user is redirected to products page")
    public void userIsRedirectedToProductsPage() {
        String actual = driver.findElement(By.cssSelector(".product_label")).getText();
        assert actual.equalsIgnoreCase("products");
    }

    @When("user clicks on wanted product")
    public void clicksOnWantedProduct() {
        WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Backpack')]"));
        Utils.waitInSeconds(1);
        element.click();
    }

    @Then("user is redirected to wanted product's page")
    public void userIsRedirectedToWantedProductSPage() {
        assert driver.findElement(By.cssSelector(".header_label")).getText().equalsIgnoreCase("Swag");
    }

    @When("user clicks on add to cart button")
    public void clickOnAddToCartButton() {
        WebElement element = driver.findElement(By.cssSelector(".btn_primary"));
        element.click();
    }

    @And("user clicks on cart button")
    public void clickCartButton() {
        WebElement element = driver.findElement(By.cssSelector("#shopping_cart_container"));
        Utils.waitInSeconds(2);
        element.click();
    }

    @Then("user is redirected to cart's page")
    public void userIsRedirectedToCartPage() {
        assert driver.findElement(By.cssSelector(".subheader")).getText().contains("Your Cart");
    }

    @When("user clicks on checkout button")
    public void clickCheckoutButton() {
        WebElement element = driver.findElement(By.cssSelector(".btn_action"));
        element.click();
    }

    @Then("user is redirected to checkout page")
    public void userIsRedirectedToCheckoutPage() {
        assert driver.findElement(By.cssSelector(".subheader")).getText().contains("Checkout: Your Information");
    }

    @When("user inputs first name, last name and zip code fields")
    public void inputFirstNameLastNameAndZipCode() {
        driver.findElement(By.cssSelector("#first-name")).sendKeys(Constants.FIRST_NAME.getValue());
        driver.findElement(By.cssSelector("#last-name")).sendKeys(Constants.LAST_NAME.getValue());
        driver.findElement(By.cssSelector("#postal-code")).sendKeys(Constants.ZIP_CODE.getValue());
    }

    @And("user clicks on continue button")
    public void clickContinueButton() {
        WebElement element = driver.findElement(By.cssSelector(".btn_primary"));
        element.click();
    }

    @Then("user is redirected to checkout overview page")
    public void userIsRedirectedToCheckoutOverviewPage() {
        assert driver.findElement(By.cssSelector(".subheader")).getText().contains("Checkout: Overview");
    }

    @When("user clicks on finish button")
    public void clickFinishButton() {
        WebElement element = driver.findElement(By.cssSelector(".btn_action"));
        element.click();
    }

    @Then("user is redirected to finished order page")
    public void userIsRedirectedToFinishedOrderPage() {
        assert driver.findElement(By.cssSelector(".subheader")).getText().contains("Finish");
    }
}
