package Basic_SeleniumTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_SiteNavigate {

	public static void main(String[] args) throws InterruptedException 
	{
		
		 WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.Google.com");
		Thread.sleep(10);
		
		driver.getTitle();
		
		System.out.println("Site Title is:" +driver.getTitle());
		
		driver.manage().window().maximize();
		
		
		driver.quit();
		
		
	}

}
