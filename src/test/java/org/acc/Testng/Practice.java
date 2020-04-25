package org.acc.Testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice {
	static WebDriver driver;
@BeforeMethod
private void startTime() {
	Date d= new Date();
	System.out.println(d);
}
@AfterMethod
private void endDate() {
	Date d= new Date();
	System.out.println();
	}
@Parameters({"emil","pss"})
@Test
private void data(@Optional("nandhini")String s1,@Optional("fgthyugfhfjgkg")String s2) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\Project Class\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
	username.sendKeys(s1);
    WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
    pass.sendKeys(s2);
	}
@Test
private void login() {
	WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
	login.click();
}
}
