package Basic_SeleniumTask;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdownHandling {

	public static void main(String[] args) {
	
	
		//Handling Dropdown
		
		WebDriver driver = new ChromeDriver();
		
		WebElement Ele =driver.findElement(By.id("dropdown"));
		
		Select select =new Select("dropdown");
		
		//Select by visible text
		select.deSelectByContainsVisibleText("text");
		
		//Select by Index
		select.selectByIndex(0);

		//Select by value
		select.selectByValue("value");
		
		
		// Handling Pop-Ups
		
		
		//Accept or click on Ok
		driver.switchTo().alert().accept();
		
		//Click on Cancel
		driver.switchTo().alert().dismiss();
		
		//Enter text into alertbox
		driver.switchTo().alert().sendKeys("data");
		
		
		
		// Handling Frames
		
		
		// Switch to Frame
		driver.switchTo().frame(1);
		
		driver.switchTo().frame("frame1");
		

		// Switch back to main page
		
		driver.switchTo().defaultContent();
		
		
		
		
		//##Handling Browser window and Tabs
		
		//Switching between multiple windows
		
		String mainWindow=driver.getWindowHandle();
		
		Set<String> allwindow= driver.getWindowHandles();
		
		for (String window : allwindow)
		{
			if(!window.equals(mainWindow))
			{
				driver.switchTo().window(window);
				
			}
		}
		
		
		
		//#Waits in selenium
		
		
		//Implicit Wait: Wait for elements to be available before throwing an exception
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Explict wait : Wait for specific condition before proceeding
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		WebElement ele=wait.until(ExpectedConditions.visibilityOf(By.id("submit")));
		
		
	}

	
}
