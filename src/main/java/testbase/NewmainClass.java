package testbase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class NewmainClass extends TestBrowser {
	
	public NewmainClass(){
		super();
	}
	
	@BeforeMethod
	@Parameters("Browser")
	public void setUp(String browser){
		test1(browser);
			
	}
	
	@Test
	public void loginPageTitleTest(){

		System.out.println();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
