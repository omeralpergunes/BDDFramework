package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class LoginSteps {

    /*static WebDriver driver;

    @Given("User is on login page")
    public void user_is_on_login_page (){
        driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.saucedemo.com/");
    }

    //@When("User enters valid username and password")
    @When("User enters valid {string} and {string}")
    public void user_enters_valid_and(String username, String password) throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(2000);
    }

    @And("Clicks on Login Button")
    public void clicks_on_login_button(){
        driver.findElement(By.id("login-button")).click();

    }
    @Then("User is navigated to Home Page")
    public void user_is_navigated_to_home_page (){
        WebElement logo = driver.findElement(By.xpath("//div[@class='app_logo']"));
        Assert.assertTrue(logo.isDisplayed());

    }
    @And("Close the browser")
    public void close_the_browser(){
        driver.close();

    }*/
}
