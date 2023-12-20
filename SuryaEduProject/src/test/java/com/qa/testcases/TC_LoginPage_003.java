package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.LoginPage;

public class TC_LoginPage_003 extends BaseClass {
	
	@Test(priority = 1)
	public void test1() {
		TC_linkTest_001 tc1 = new TC_linkTest_001();
		tc1.linkTest();
	}
	
	@Test(priority = 2)
	public void test2() {
		LoginPage lp = new LoginPage(driver);
		lp.enterLoginField("thavarasaraaju1215@gmail.com", "Test@1234");
		lp.clickLogin();
	}
	
	@Test(priority = 3)
	public void countinueLogin() {
		LoginPage lp = new LoginPage(driver);
		String actualUser = lp.accLogin();
		System.out.println("Actual Message: "+actualUser);
		
		String expectUser = "thavarasaraaju1215@gmail.com";
		System.out.println("Expected Message: "+expectUser);
		
		Assert.assertEquals(actualUser, expectUser);
	}
}
