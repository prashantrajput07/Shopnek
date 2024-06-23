package Genericresuable;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flib {
	
	protected static WebDriver driver;
	
	

	public void tearup()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://shopnek.com/");
	}
	
	
	
	public void tearDown()
	{
		driver.quit();
	}
	

}
