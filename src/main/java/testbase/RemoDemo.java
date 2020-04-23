package testbase;

import org.openqa.selenium.Alert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RemoDemo extends TestBrowser{

	
	public RemoDemo() {
		super();
	}
	
	
	@BeforeMethod
	@Parameters("Browser")
	public void setUp(String browser){
		test1(browser);
			
	}
	
	@Test 
	public void  launchPage() {
		driver.get("http://www.google.com");
		
	}
	
	@AfterMethod
	public void  tearDown() {
		driver.quit();
	}
}
