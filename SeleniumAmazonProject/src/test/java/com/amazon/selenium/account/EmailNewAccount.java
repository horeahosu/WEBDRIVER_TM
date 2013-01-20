package com.amazon.selenium.account;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.amazon.selenium.util.Constants;

public class EmailNewAccount {
	
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
	public void TestEmail1()
	{
		
		driver.findElement(By.id("nav-signin-text")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/div/ul/li/a")).click();

		
		driver.findElement(By.id("ap_email")).sendKeys("");
	
		driver.findElement(By.id("ap_signin_create_radio")).click();
		
		driver.findElement(By.id("signInSubmit")).click();
		
		String error_message = driver.findElement(By.id("message_error")).getText();
		assertTrue(error_message.contains(Constants.MISSING_EMAIL_MESSAGE));
		
	}
	
	@Test
	public void TestEmail2()
	{
		
		driver.findElement(By.id("nav-signin-text")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/div/ul/li/a")).click();

		
		driver.findElement(By.id("ap_email")).sendKeys(Constants.WRONG_EMAIL_ACCOUNT1);
	
		driver.findElement(By.id("ap_signin_create_radio")).click();
		
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.findElement(By.id("ap_customer_name")).sendKeys(Constants.NAME_ACCOUNT);
		driver.findElement(By.id("ap_email_check")).sendKeys(Constants.WRONG_EMAIL_ACCOUNT1);
		driver.findElement(By.id("ap_password")).sendKeys(Constants.PASS_ACCOUNT);
		driver.findElement(By.id("ap_password_check")).sendKeys(Constants.PASS_ACCOUNT);
		driver.findElement(By.id("continue")).click();
		
		String error_message = driver.findElement(By.id("message_error")).getText();
		assertTrue(error_message.contains(Constants.WRONG_EMAIL_MESSAGE));
		
	}
	
	@Test
	public void TestEmail3()
	{
		
		driver.findElement(By.id("nav-signin-text")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/div/ul/li/a")).click();

		
		driver.findElement(By.id("ap_email")).sendKeys(Constants.WRONG_EMAIL_ACCOUNT2);
	
		driver.findElement(By.id("ap_signin_create_radio")).click();
		
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.findElement(By.id("ap_customer_name")).sendKeys(Constants.NAME_ACCOUNT);
		driver.findElement(By.id("ap_email_check")).sendKeys(Constants.WRONG_EMAIL_ACCOUNT2);
		driver.findElement(By.id("ap_password")).sendKeys(Constants.PASS_ACCOUNT);
		driver.findElement(By.id("ap_password_check")).sendKeys(Constants.PASS_ACCOUNT);
		driver.findElement(By.id("continue")).click();
		
		String error_message = driver.findElement(By.id("message_error")).getText();
		assertTrue(error_message.contains(Constants.WRONG_EMAIL_MESSAGE));
		
	}
	
	@Test
	public void TestEmail4()
	{

		driver.findElement(By.id("nav-signin-text")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/div/ul/li/a")).click();

		
		driver.findElement(By.id("ap_email")).sendKeys(Constants.WRONG_EMAIL_ACCOUNT3);
	
		driver.findElement(By.id("ap_signin_create_radio")).click();
		
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.findElement(By.id("ap_customer_name")).sendKeys(Constants.NAME_ACCOUNT);
		driver.findElement(By.id("ap_email_check")).sendKeys(Constants.WRONG_EMAIL_ACCOUNT3);
		driver.findElement(By.id("ap_password")).sendKeys(Constants.PASS_ACCOUNT);
		driver.findElement(By.id("ap_password_check")).sendKeys(Constants.PASS_ACCOUNT);
		driver.findElement(By.id("continue")).click();
		
		String error_message = driver.findElement(By.id("message_error")).getText();
		assertTrue(error_message.contains(Constants.WRONG_EMAIL_MESSAGE));
		
	}
	
	@After
	public void quitDriver()
	{
		driver.quit();
	}
}
