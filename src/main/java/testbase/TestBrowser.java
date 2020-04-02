package testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {
	public static WebDriver driver;

	
	public void test1(String browser) {

		if (browser.equalsIgnoreCase("FF")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
			driver.get("http://www.facebook.com");
			
			
		} /*else if (browser.equalsIgnoreCase("chrom")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
			driver.get("https://www.rsystems.com/");
		
			
		}
	*/	
		/*else if (browser.equalsIgnoreCase("IE")) {

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
			driver.get("https://www.rsystems.com/");
			
		}*/
	}

}