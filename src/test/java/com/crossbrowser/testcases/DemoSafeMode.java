package com.crossbrowser.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSafeMode {
	@Test
	public void safeMode() {
		DesiredCapabilities capabi = new DesiredCapabilities();
		ChromeOptions optn = new ChromeOptions();
		optn.addArguments("--incognito");
		capabi.setCapability(ChromeOptions.CAPABILITY, optn);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(capabi);
		driver.get("https://www.google.com");
	}

	@Test
	public void safeModefree() {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(capabilities);
		driver.get("http://www.google.com");
		WebElement ImageFile =driver.findElement(By.xpath(""));
		Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript(
				"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
				ImageFile);
		if (!ImagePresent) {
			System.out.println("Image not displayed.");
		} else {
			System.out.println("Image displayed.");
		}
	}
}
