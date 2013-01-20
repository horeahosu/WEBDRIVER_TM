import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Emag {

	WebDriver driver = new FirefoxDriver();
	
	@Test
	public void Test1() throws InterruptedException
	{
		for (int i=1; i<500; i++)
		{
			driver.get("http://www.emag.ro/");
			Thread.sleep(30000);
		}
		driver.quit();
	}
}
