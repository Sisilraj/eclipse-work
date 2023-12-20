package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.RegistrationPage;


public class TC_RegisterPage_002 extends BaseClass {
	
	@Test(priority = 1)
	public void test01() {
		TC_linkTest_001 tc1 = new TC_linkTest_001();
		tc1.linkTest();
	}
	
	@Test(priority = 2)
	public void test02() {
		RegistrationPage rp = new RegistrationPage(driver);
		
		rp.registerUser("Sisil", "Raj", "test_27_440@gmail.com");
		
		rp.userPassword("Test@1234", "Test@1234");
		
		rp.register();
		
	}
	
	@Test(priority = 3)
	public void testUserVerify() {
		RegistrationPage rp = new RegistrationPage(driver);
		String actualUser = rp.user();
		System.out.println("Actual Message: "+actualUser);
		
		String expectUser = "test_27_440@gmail.com";
		System.out.println("Expected Message: "+expectUser);
		
		Assert.assertEquals(actualUser, expectUser);
	}
}
