package org.acc.Testng;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Testngsample {
	static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\Project Class\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.flysas.com/nl-en/");
		driver.manage().window().maximize();
		}
	@AfterClass
	public static void quit() {
		driver.quit();
}
	@Test
	public void flight() throws InterruptedException, IOException {
	Thread.sleep(2000);
		
	//One Way
		WebElement oneway=driver.findElement(By.xpath("//button[@id='OW']"));
		oneway.click();
		
		//Source
		WebElement origin=driver.findElement(By.xpath("//input[@id='origin']"));
		origin.clear();
		origin.sendKeys("Las Vegas, NV LAS",Keys.ENTER);
		String a=origin.getAttribute("value");
		
		
		//Destination
        WebElement desti=driver.findElement(By.xpath("//input[@id='destination']"));
        desti.sendKeys("Amsterdam AMS",Keys.ENTER);
        String b=desti.getAttribute("value");
       
		WebElement outbound=driver.findElement(By.xpath("//input[@id='Outbound']"));
		outbound.click();
		
		//Start Date
		WebElement startdate=driver.findElement(By.xpath("//td[@data-input='mon, 10 feb']"));
	startdate.click();
		
		//End Date
		WebElement enddate=driver.findElement(By.xpath("//td[@data-input='thu, 13 feb']"));
		enddate.click();
		// Number of passenger Details
		WebElement passenger=driver.findElement(By.xpath("//input[@id='passengers']"));
		passenger.click();
		WebElement searchbox=driver.findElement(By.xpath("//button[@id='search-button']"));
		searchbox.click();
		Thread.sleep(10000);
		//Flight Selection
		WebElement flight=driver.findElement(By.xpath("(//li[@class='col-md-6 col-sm-6 col-xs-6 relative up-grid-bar'])[1]"));
		flight.click();
		WebElement continuebtn=driver.findElement(By.id("return-button-cart"));
		continuebtn.click();
		Thread.sleep(6000);
		//Passenger Information
		WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName_ADT0']"));
		firstname.sendKeys("Sangeetha");
		String c=firstname.getAttribute("value");
		Assert.assertEquals("verify firstname", "Sangeetha",c);
WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName_ADT0']"));
	lastname.sendKeys("Pv");
		String d=lastname.getAttribute("value");
		Assert.assertEquals("verify lastname", "Pv",d);
		WebElement gender=driver.findElement(By.xpath("//select[@id='gender_ADT0']"));
		gender.click();
		Select s=new Select(gender);
		s.selectByVisibleText("Female");
		String e=gender.getAttribute("value");
		Assert.assertEquals("verify female", "Female",e);
		WebElement dob=driver.findElement(By.xpath("//input[@id='dateOfBirth_ADT0']"));
		dob.sendKeys("1995-11-05");
		String f=dob.getAttribute("value");
		Assert.assertEquals("verify dob", "1995-11-05",f);
		WebElement email=driver.findElement(By.xpath("//input[@id='email_ADT0']"));
		email.sendKeys("sangeethaashley@gmail.com");
		String g=email.getAttribute("value");
		Assert.assertEquals("verify email", "sangeethaashley@gmail.com",g);
		WebElement phnum=driver.findElement(By.xpath("//input[@id='mobile_ADT0']"));
		phnum.clear();
		phnum.sendKeys("9094169322");
		System.out.println(phnum);
		String h=phnum.getAttribute("value");
		Assert.assertEquals("verify number", "319094169322",h);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement continuebtn1=driver.findElement(By.id("return-button-cart"));
		continuebtn1.click();
		//seat selection
				List<WebElement>  seats= driver.findElements(By.className("outbound-22-seat free-seat ng-star-inserted"));
				for (WebElement x : seats) {
					System.out.println(x);
				}
				
        WebElement continuebtn2=driver.findElement(By.xpath("//button[@id='cart-button']"));
	continuebtn2.click();
		Thread.sleep(2000);
		WebElement continuebtn3=driver.findElement(By.xpath("//button[@id='cart-button']"));
		continuebtn3.click();

	
	}


