package com.crossbrowser.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sample.test.base.TestBase;

public class GetTitle extends TestBase {
	

/*	public GetTitle() {
		super();
	}*/
	
/*	@BeforeMethod	
	public void setUp(String browser) {
		initialization(browser);
		
	}*/

	
	@Test
	@Parameters ("Browser")
	public void loginPageTitleTest(String browser) {
		String title = "test";
		initialization(browser);
		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
	}

}
