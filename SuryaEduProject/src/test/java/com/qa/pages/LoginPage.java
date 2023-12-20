package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Log in')]")
	WebElement loginButton;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement login;
	
	@FindBy(linkText = "thavarasaraaju1215@gmail.com")
	WebElement successLogin;
	
	public void enterLoginField(String mail, String pass) {
		loginButton.click();
		email.sendKeys(mail);
		password.sendKeys(pass);
	}
	
	public void clickLogin() {
		login.click();
	}
	
	public String accLogin() {
		String acc = successLogin.getText();
		return acc;
	}
}
