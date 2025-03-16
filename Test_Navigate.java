package Basic_SeleniumTask;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Test_Navigate 
{


	ChromeDriver driver;
	
	@BeforeMethod
	public void setupChrome()
	{
		
		driver =new ChromeDriver();
		
	}
	
	@Test
	public void testsiteNavigate()
	{
		driver.get("https://www.cricbuzz.com");

	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	
	
	
}
