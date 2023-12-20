 package com.qa.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.qa.base.BaseClass;

public class TC_linkTest_001 extends BaseClass {
	
	@Test
	public void linkTest() {
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}
}
