package TestNG_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class CrossBrowserTesting 
{

	
		@Test()
		public void testOnChromeWithBrowserStackUrl()
		{
			
			ChromeDriver driver1=new ChromeDriver();
		
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver1.get("https://www.browserstack.com/");
			
			driver1.manage().window().maximize();
			System.out.println("this is the test related to chrome browserstack homepage"+ " " +Thread.currentThread().getId());

	}

		@Test()
		public void testOnChromeWithBrowserStackSignUp()
		{
			FirefoxDriver driver=new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.browserstack.com/users/sign_up");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("user_full_name")).sendKeys("<name>");
			driver.findElement(By.id("user_email_login")).sendKeys("<login email id>");
			driver.findElement(By.id("user_password")).sendKeys("<password>");
			System.out.println("this is the test related to chrome browserstack login"+ " " +Thread.currentThread().getId());

	}

	@AfterClass
	public void close()
	{
		
			//driver.quit();
		}

	}

