package Basic_SeleniumTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_URL
{
	public static void main(String args[])
	
	{
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("www.Cricbuzz.com");
		
		System.out.println("Page Title" +driver.getTitle());
		
		//Close Browser
		driver.quit();
		
	
	}
	
}
