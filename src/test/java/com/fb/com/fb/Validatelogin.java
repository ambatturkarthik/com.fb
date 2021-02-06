package com.fb.com.fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Validatelogin
{
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "D:\\Karthik\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void verifyTitle()
	{
		//Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}


	
}
