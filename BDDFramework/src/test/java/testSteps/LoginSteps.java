package testSteps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class LoginSteps {
	
	public static WebDriver driver;
	
	@Given("User is on login page")
	public void userIsOnLoginPage() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.saucedemo.com/");
	}
	@When("User enter valid user name and password")
	public void userEnterValidUserNameAndPassword() {
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	@And("Click on login Button")
	public void clickOnLoginButton() {
	    driver.findElement(By.id("login-button")).click();
	}
	@Then("User is navigated to Home page")
	public void userIsNavigatedToHomePage() {
	    String actualTittle = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
	    Assert.assertEquals(actualTittle, "Swag Labs");
	}
	@Then("close the browser")
	public void closeTheBrowser() {
	    driver.quit();
	}
	
	@When("User enter invalid user name and password")
	public void userEnterInvalidUserNameAndPassword() {
		driver.findElement(By.id("user-name")).sendKeys("standard_use");
	    driver.findElement(By.id("password")).sendKeys("secret_sauc");
	}
	@Then("Login should fail")
	public void loginShouldFail() {
	    String actualError = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
	    Assert.assertEquals(actualError, "Epic sadface: Username and password do not match any user in this service");
	    driver.quit();
	}

}
