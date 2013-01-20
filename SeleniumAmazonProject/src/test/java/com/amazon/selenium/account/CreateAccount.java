package com.amazon.selenium.account;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.amazon.selenium.util.AmazonUtil;
import com.amazon.selenium.util.Constants;

public class CreateAccount {
	
	private WebDriver driver;
	private FirefoxProfile profile;
	
	
	@Before
	public void doSetup()
	{	
		profile = new FirefoxProfile();
		driver = new FirefoxDriver(profile);
		driver.get("http://www.amazon.com/");	
	}
	
	@Test
	public void CreateNewAccount()
	{

		
		driver.findElement(By.id("nav-signin-text")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/div/ul/li/a")).click();
		
		String new_email = "horea"+AmazonUtil.getUniqueValue();
		
		driver.findElement(By.id("ap_email")).sendKeys(new_email+"@yahoo.com");
	
		driver.findElement(By.id("ap_signin_create_radio")).click();
		
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys(Constants.NAME_ACCOUNT);
		driver.findElement(By.id("ap_email_check")).sendKeys(new_email+"@yahoo.com");
		System.out.println(new_email+"@yahoo.com");
		
		driver.findElement(By.id("ap_password")).sendKeys(Constants.PASS_ACCOUNT);
		driver.findElement(By.id("ap_password_check")).sendKeys(Constants.PASS_ACCOUNT);
		driver.findElement(By.id("continue")).click();
		
	}

	@After
	public void quitDriver()
	{
		driver.quit();
	}
}
