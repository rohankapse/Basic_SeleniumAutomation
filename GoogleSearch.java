package Basic_SeleniumTask;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String args[]) throws InterruptedException
	
	{
		WebDriver driver =new ChromeDriver();
		//WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.Youtube.com");
		
		//Locate WebElement
		WebElement searchbox=driver.findElement(By.name("q"));
		
		searchbox.sendKeys("Selenium Automation");
		
		//Press Enter button
		searchbox.submit();
		Thread.sleep(10);
		
		
		//1. For Clicking Buttons
		
//		WebElement btn = driver.findElement(By.id("Submit"));
//		
//		//2. For enter into the Textbox
//		
//		WebElement txtbox =driver.findElement(By.xpath("achgcdsgh"));
//		
//		
//		//3. Enter text and clear it
//		
//		WebElement txtbox2 =driver.findElement(By.xpath("achgcdsgh"));
//		
//		txtbox2.clear();
//		
//		// 4. Fetch the text of an element
//		
//		String str=driver.findElements(By.id("")).getText();
		
		
		
		
		
		
		
		
		System.out.println("Page Title:" +driver.getTitle());
		
		driver.quit();
		}
	}


