package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class RegistrationPage extends BaseClass {
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	WebElement registerButton;
	
	@FindBy(xpath = "//input[@id='gender-male']")
	WebElement radio;
	
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='LastName']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@id='register-button']")
	WebElement regButton;
	
	@FindBy(linkText = "test_27_440@gmail.com")
	WebElement account;
	
	public void registerUser(String first, String last, String mail) {
		registerButton.click();
		radio.click();
		firstName.sendKeys(first);
		lastName.sendKeys(last);
		email.sendKeys(mail);
		
	}
	
	public void userPassword(String pass, String confirmPass) {
		password.sendKeys(pass);
		confirmPassword.sendKeys(confirmPass);
	}
	
	public void register() {
		regButton.click();
	}
	
	public String user() {
		String acc = account.getText();
		return acc;
	}
	
}
