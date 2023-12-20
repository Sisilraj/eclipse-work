package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;


public class TC_VerifyMainElements_005 extends BaseClass {
	@Test(priority = 1)
	public void test1() {
		TC_linkTest_001 tc1 = new TC_linkTest_001();
		tc1.linkTest();
	}
	
	@Test(priority = 2)
	public void test2() {
		HomePage hp = new HomePage(driver);
		hp.validateTexts();
	}
	
	@Test(priority = 3)
	public void test3() {
		HomePage hp = new HomePage(driver);
		int actualLinks = hp.elementsCount();
		int expectLinks = 7;
		
		Assert.assertEquals(actualLinks, expectLinks);
	}
}
