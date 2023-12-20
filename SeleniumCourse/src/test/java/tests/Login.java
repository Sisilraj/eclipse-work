package tests;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void testLogin() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/HP/eclipse-workspace/SeleniumCourse/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://tutorialsninja.com/demo/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		for(WebElement links:allLinks) {
			String t = links.getText();
			System.out.println(t);
		}
		
//		for(int i=0;i<allLinks.size();i++) {
//			System.out.println(allLinks.get(i).getText());
//		}
			
		
			
		
		 /*
		WebElement checkBox = driver.findElement(By.name("agree"));
		
		if(checkBox.isDisplayed()) {
			System.out.println("The check box is present in this page");
		}else {
			System.out.println("The check box is not present in this page");
		}
		
		//checkBox.click();
		
		if(checkBox.isSelected()) {
			System.out.println("The check box is selected in this page");
		}else {
			System.out.println("The check box is not selected in this page");
		}
		
		
		WebElement emailBox = driver.findElement(By.id("input-email"));
		String t = emailBox.getAttribute("");
		
		if(t.length()==0) {
			System.out.println("Textbox present in Facebook login page is empty");
		}else {
			System.out.println("Textbox present in Facebook login page is not empty");
		}
		*/
		
		//WebElement lt = driver.findElement(By.linkText("Account"));
		//System.out.println(lt.getText());
		
		/*
		WebElement emailBox = driver.findElement(By.id("input-email"));
		Dimension d = emailBox.getSize();
		int em = d.getHeight();
		System.out.println("height of the email box: "+em);
		
		WebElement pwBox = driver.findElement(By.id("input-password"));
		Dimension d1 = pwBox.getSize();
		int pw = d1.getHeight();
		System.out.println("height of the password box: "+pw);
		
		WebElement clbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		Dimension d2 = clbtn.getSize();
		int cb = d2.getHeight();
		System.out.println("height of the click btn: "+cb);		
		
		if(em==pw && pw==cb && em==cb) {
			System.out.println("height of the email box,password box and click btn are same.. "+em+","+pw+","+cb);
		}else {
			System.out.println("height of the email box,password box and click btn are not same..");
		}*/
		
		//System.out.println("height of the text box: "+d.getHeight());
		//System.out.println("width of the text box: "+d.getWidth());
		
		//Point p = emailBox.getLocation();
		
		//System.out.println("x coordinate (in px):"+p.getX());
		//System.out.println("y coordinate (in px):"+p.getY());
		//emailBox.sendKeys("test");
		//emailBox.sendKeys(Keys.CONTROL+"a");
		//emailBox.sendKeys(Keys.CONTROL+"c");
		//emailBox.clear();
		//emailBox.sendKeys("repeat text");
		//driver.findElement(By.id("input-password")).sendKeys(Keys.CONTROL+"v");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	                    //==================explicit wait===================\\
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.titleIs("My Account"));
		//driver.findElement(By.linkText("My Account")).click();
		//driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();
		
	}
}	
