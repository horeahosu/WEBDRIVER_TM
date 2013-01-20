package com.amazon.selenium.account;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.amazon.selenium.util.Constants;

public class LoginAccount {
	
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
	public void TestSuccessLogin()
	{
		driver.findElement(By.id("nav-signin-text")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/div/ul/li/a")).click();

		
		driver.findElement(By.id("ap_email")).sendKeys(Constants.EMAIL_ACCOUNT);
		driver.findElement(By.id("ap_password")).sendKeys(Constants.PASS_ACCOUNT);
		
		driver.findElement(By.id("signInSubmit")).click();
		
		
		String name = driver.findElement(By.id("nav-signin-text")).getText();
		Assert.assertTrue(name.contains(Constants.NAME_ACCOUNT));
			
	}
	
	@Test
	public void TestFailLogin1()
	{
		driver.findElement(By.id("nav-signin-text")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/div/ul/li/a")).click();

		
		driver.findElement(By.id("ap_email")).sendKeys(Constants.EMAIL_ACCOUNT);
		driver.findElement(By.id("ap_password")).sendKeys(Constants.WRONG_PASS_ACCOUNT);
		
		driver.findElement(By.id("signInSubmit")).click();
		
		
		String error_message = driver.findElement(By.id("message_error")).getText();
		Assert.assertTrue(error_message.contains(Constants.WRONG_PASS_LOGIN_MESSAGE));
			
	}
	
	@Test
	public void TestFailLogin2()
	{
		driver.findElement(By.id("nav-signin-text")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/div/ul/li/a")).click();

		
		driver.findElement(By.id("ap_email")).sendKeys(Constants.WRONG_EMAIL_ACCOUNT1);
		driver.findElement(By.id("ap_password")).sendKeys(Constants.PASS_ACCOUNT);
		
		driver.findElement(By.id("signInSubmit")).click();
		
		
		String error_message = driver.findElement(By.id("message_error")).getText();
		Assert.assertTrue(error_message.contains(Constants.WRONG_PASS_LOGIN_MESSAGE));
			
	}
	
	@Test
	public void TestFailLogin3()
	{
		driver.findElement(By.id("nav-signin-text")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/div/ul/li/a")).click();

		
		driver.findElement(By.id("ap_email")).sendKeys(Constants.WRONG_EMAIL_ACCOUNT2);
		driver.findElement(By.id("ap_password")).sendKeys(Constants.PASS_ACCOUNT);
		
		driver.findElement(By.id("signInSubmit")).click();
		
		
		String error_message = driver.findElement(By.id("message_error")).getText();
		Assert.assertTrue(error_message.contains(Constants.WRONG_PASS_LOGIN_MESSAGE));
			
	}
	
	@Test
	public void TestFailLogin4()
	{
		driver.findElement(By.id("nav-signin-text")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/div/ul/li/a")).click();

		
		driver.findElement(By.id("ap_email")).sendKeys(Constants.WRONG_EMAIL_ACCOUNT3);
		driver.findElement(By.id("ap_password")).sendKeys(Constants.PASS_ACCOUNT);
		
		driver.findElement(By.id("signInSubmit")).click();
		
		
		String error_message = driver.findElement(By.id("message_error")).getText();
		Assert.assertTrue(error_message.contains(Constants.WRONG_PASS_LOGIN_MESSAGE));
			
	}
	
	@After
	public void quitDriver()
	{
		driver.quit();
	}
	
}
