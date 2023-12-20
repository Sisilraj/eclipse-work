package com.qa.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Project {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/excutables/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(priority = 0)
	public void linkTest() {
		driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
	}
	
	@Test(priority = 1)
	public void username() {
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("sisil");
	}
	
	@Test(priority = 2)
	public void password() {
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("sis123");
	}
	
	@Test(priority = 3)
	public void comments() {
		WebElement comments = driver.findElement(By.name("comments"));
		comments.clear();
	}
	
	@Test(priority = 4)
	public void comment() {
		WebElement comment = driver.findElement(By.name("comments"));
		comment.sendKeys("I'm registered");
	}
	
	@Test(priority = 5)
	public void radioButtons() {
		List <WebElement> buttons = driver.findElements(By.xpath("//*[@type='radio']"));
		int totalButtons = buttons.size();
		System.out.println("the total radio buttons: "+totalButtons);
		
		int expect = 3;
		int actual = totalButtons;
		Assert.assertEquals(actual, expect);
	}
	
	@Test(priority = 6)
	public void radioButton() {
		WebElement button = driver.findElement(By.xpath("(//*[@type='radio'])[1]"));
		button.click();
		
		boolean expect = true;
		boolean actual = button.isSelected();
		Assert.assertEquals(actual, expect);
	}
	
	@Test(priority = 7)
	public void dropDown() {
		WebElement dropdown = driver.findElement(By.name("dropdown"));
		Select select = new Select(dropdown);
		select.selectByIndex(4);
	}
	
	@Test(priority = 8)
	public void submit() {
		driver.findElement(By.xpath("(//input[@name='submitbutton'])[2]")).submit();
	}
	
	
	@AfterTest
	public void teardown() {
		System.out.println("Program was completed...");
		driver.quit();
	}
}
