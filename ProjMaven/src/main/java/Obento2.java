
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;



public class Obento2 {
	
	FileUtil f;
	
	@Test
	public void Test() throws InterruptedException
	{
		
		f = new FileUtil();
		f.loadProps("resources/test.properties");
		
		FirefoxProfile profile = new FirefoxProfile();
		WebDriver driver = new FirefoxDriver(profile);
		
		driver.get("http://www.obento.ro/");
		System.out.println("Page title:"+driver.getTitle());
		
		
		driver.findElement(By.id("meniu")).click();
		Thread.sleep(1000);
		
		for (int i=0; i<6; i++)
		{
		String menu = driver.findElements(By.className("meniuPreviewTitle")).get(i).getText();
		String pret = driver.findElements(By.className("meniuPret")).get(i).getText();
		
		int j=i+1;
		
		System.out.println("Menu number "+j+" is: "+menu+" and the price is: "+pret);
		
		f.storeProps(menu, pret,"resources/test.properties");
		
		}
	 	driver.quit();
	}	
	
}
