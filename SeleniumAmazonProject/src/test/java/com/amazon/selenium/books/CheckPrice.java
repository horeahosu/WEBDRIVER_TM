package com.amazon.selenium.books;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

import com.amazon.selenium.util.Constants;
import com.amazon.selenium.util.FileUtil;

public class CheckPrice {

	private WebDriver driver;
	private FirefoxProfile profile;
	FileUtil f;

	@Before
	public void doSetup()
	{	
		profile = new FirefoxProfile();
		driver = new FirefoxDriver(profile);
		driver.get("http://www.amazon.com/");	
		f = new FileUtil();
		f.loadPropertiesBundle("values");
	}
	
	@Test
	public void TestBook1Price()
	{
		driver.findElement(By.id("nav-signin-text")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/div/ul/li/a")).click();
		driver.findElement(By.id("ap_email")).sendKeys(Constants.EMAIL_ACCOUNT);
		driver.findElement(By.id("ap_password")).sendKeys(Constants.PASS_ACCOUNT);	
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("nav-your-amazon")).click();
		new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Books");
		driver.findElement(By.className("nav-submit-input")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div[4]/div/div[3]/h3/a")).click();
		String title = driver.findElement(By.id("btAsinTitle")).getText();
		if (title.contains(Constants.TITLE_BOOK1))
		{
			//String pret =driver.findElement(By.id("actualPriceValue")).getText();
			//System.out.println(pret);
			Assert.assertTrue(driver.findElement(By.id("actualPriceValue")).getText().contains(f.getPropertyAsString("price1")));
		}
		else
		{
			System.out.println("First book from list has changed");
		}
	
	}
	
	@Test
	public void TestBook2Price()
	{
		driver.findElement(By.id("nav-signin-text")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/div/ul/li/a")).click();
		driver.findElement(By.id("ap_email")).sendKeys(Constants.EMAIL_ACCOUNT);
		driver.findElement(By.id("ap_password")).sendKeys(Constants.PASS_ACCOUNT);	
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("nav-your-amazon")).click();
		new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Books");
		driver.findElement(By.className("nav-submit-input")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div[4]/div[3]/div[3]/h3/a")).click();
		String title = driver.findElement(By.id("btAsinTitle")).getText();
		if (title.contains(Constants.TITLE_BOOK2))
		{
			//String pret =driver.findElement(By.id("actualPriceValue")).getText();
			//System.out.println(pret);
			Assert.assertTrue(driver.findElement(By.id("actualPriceValue")).getText().contains(f.getPropertyAsString("price2")));
		}
		else
		{
			System.out.println("Second book from list has changed");
		}
	
	}
	
	@Test
	public void TestBook3Price()
	{
		driver.findElement(By.id("nav-signin-text")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/div/ul/li/a")).click();
		driver.findElement(By.id("ap_email")).sendKeys(Constants.EMAIL_ACCOUNT);
		driver.findElement(By.id("ap_password")).sendKeys(Constants.PASS_ACCOUNT);	
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("nav-your-amazon")).click();
		new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Books");
		driver.findElement(By.className("nav-submit-input")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div[4]/div[5]/div[3]/h3/a")).click();
		String title = driver.findElement(By.id("btAsinTitle")).getText();
		if (title.contains(Constants.TITLE_BOOK3))
		{
			//String pret =driver.findElement(By.id("actualPriceValue")).getText();
			//System.out.println(pret);
			Assert.assertTrue(driver.findElement(By.id("actualPriceValue")).getText().contains(f.getPropertyAsString("price3")));
		}
		else
		{
			System.out.println("Thired book from list has changed");
		}
	
	}
	
	@Test
	public void TestBook4Price()
	{
		driver.findElement(By.id("nav-signin-text")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[4]/div[3]/div/div[3]/h3/a")).click();
		driver.findElement(By.id("ap_email")).sendKeys(Constants.EMAIL_ACCOUNT);
		driver.findElement(By.id("ap_password")).sendKeys(Constants.PASS_ACCOUNT);	
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("nav-your-amazon")).click();
		new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Books");
		driver.findElement(By.className("nav-submit-input")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[4]/div[3]/div/div[3]/h3/a	")).click();							
		String title = driver.findElement(By.id("btAsinTitle")).getText();
		if (title.contains(Constants.TITLE_BOOK4))
		{
			//String pret =driver.findElement(By.id("actualPriceValue")).getText();
			//System.out.println(pret);
			Assert.assertTrue(driver.findElement(By.id("actualPriceValue")).getText().contains(f.getPropertyAsString("price4")));
		}
		else
		{
			System.out.println("Fourth book from list has changed");
		}
	
	}
	
	@Test
	public void TestBook5Price()
	{
		driver.findElement(By.id("nav-signin-text")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/div/ul/li/a")).click();
		driver.findElement(By.id("ap_email")).sendKeys(Constants.EMAIL_ACCOUNT);
		driver.findElement(By.id("ap_password")).sendKeys(Constants.PASS_ACCOUNT);	
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("nav-your-amazon")).click();
		new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Books");
		driver.findElement(By.className("nav-submit-input")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[4]/div[3]/div[3]/div[3]/h3/a")).click();
		String title = driver.findElement(By.id("btAsinTitle")).getText();
		if (title.contains(Constants.TITLE_BOOK5))
		{
			//String pret =driver.findElement(By.id("actualPriceValue")).getText();
			//System.out.println(pret);
			Assert.assertTrue(driver.findElement(By.id("actualPriceValue")).getText().contains(f.getPropertyAsString("price5")));
		}
		else
		{
			System.out.println("Fifth book from list has changed");
		}
	
	}
	
	@After
	public void quitDriver()
	{
		driver.quit();
	}
		
}
	

