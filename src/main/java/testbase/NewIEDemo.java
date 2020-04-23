package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewIEDemo {
	WebDriver driver;
	@Test
	public void getIE() {
		
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	}
}
