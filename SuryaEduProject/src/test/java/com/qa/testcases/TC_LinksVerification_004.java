package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;

public class TC_LinksVerification_004 extends BaseClass {
	@Test(priority = 1)
	public void test1() {
		TC_linkTest_001 tc1 = new TC_linkTest_001();
		tc1.linkTest();
	}
	
	@Test(priority = 2)
	public void test2() {
		HomePage hp = new HomePage(driver);
		hp.verifyLinks();
	}
}
