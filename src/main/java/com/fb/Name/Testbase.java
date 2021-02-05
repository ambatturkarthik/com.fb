package com.fb.Name;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Testbase
{
   Properties pro;
   public static WebDriver driver;
   
	public void Openbrowser()
	{
        String browsername= pro.getProperty("browsername");
		
		browsername.equalsIgnoreCase("Chrome");	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
        driver.get(pro.getProperty("url"));			
		
		
	}
	
}
