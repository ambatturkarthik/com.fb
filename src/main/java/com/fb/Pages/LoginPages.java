package com.fb.Pages;

import org.openqa.selenium.support.PageFactory;

import com.fb.Name.Testbase;

public class LoginPages extends Testbase
{

	public LoginPages()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String gettitle()
	{
		String s=driver.getTitle();
		return s;
	}
	public String  getcurrenturl()
	{
		String url= driver.getCurrentUrl();
		return url;
	}
	
}
