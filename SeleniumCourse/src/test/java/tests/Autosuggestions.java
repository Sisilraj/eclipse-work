package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autosuggestions {

	@Test
	public void testAutosuggestion() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/HP/eclipse-workspace/SeleniumCourse/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("http://www.google.com/");
//		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
//		Thread.sleep(2000);
//		List<WebElement> options = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
//		String expectText = "selenium tutorial";
//		
//		for(WebElement option:options) {
//			System.out.println(option.getText());
//			String text = option.getText();
//			if(text.equals(expectText)) {
//				option.click();
//				break;
//			}
//		}
		
		driver.get("http://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Bang");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		WebElement expectText = driver.findElement(By.xpath("//p[text()='Bangkok, Thailand']"));
		
		for(WebElement option: options) {
			//System.out.println(option.getSize());
			System.out.println(option.getText());
			String actualtext = option.getText();
			if(actualtext.equals(expectText)) {
				option.click();
				break;
			}
		}
		
	}
}
