package org.acc.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice2 {
	WebDriver driver;
@Test(groups="smoke")
private void faceBook() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\Project Class\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
	username.sendKeys("sangeetha");
    WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
    pass.sendKeys("123456");
    driver.quit();
	}
@Test(groups="sanity")
private void login() {
	WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
	login.click();
}




}
