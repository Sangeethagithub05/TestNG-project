package org.acc.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class SAssert {
	public static WebDriver driver;
	@BeforeClass
	private void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\Project Class\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@AfterClass
	private void quit() {
		driver.quit();

	}
	@Test
	private void login() {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("Sangeetha");
		String s=username.getAttribute("value");
		SoftAssert ass=new SoftAssert();
		ass.assertEquals(ass, "Sangeeth");
		String tittle=driver.getTitle();
		
		Boolean b=tittle.contains("sign u");
		ass.assertTrue(b);

	}

}
