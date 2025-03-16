package TestNG_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest 
{
public static WebDriver driver;

String browser;

@Parameters("browser")
@BeforeTest(enabled=true)
public void setup() throws InterruptedException
{
	if(browser.equalsIgnoreCase("chrome")) 
	{
	
	//Step 1- Chrome Driver Setup
	System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
	
	//Step 2- Driver Initialization
	WebDriver driver=new ChromeDriver();

    //Step 3- Launching URL
    driver.get("https://demoqa.com/login");
    
    //Step 4- Maximize the window  
    driver.manage().window().maximize();
    Thread.sleep(100);	

	
	}	
}

@Parameters("browser")
@Test(enabled=true, priority=2)
  public void logintest() throws InterruptedException
  {
	
	//Step 5- Inspect WebElement on site and send the value  
    WebElement usrname= driver.findElement(By.id("userName"));
    usrname.sendKeys("rkautomation");
    Thread.sleep(100);
    
 
    WebElement pass= driver.findElement(By.id("password"));
    pass.sendKeys("Rkautomation@123");
    Thread.sleep(100);
    	
    //Step 6- Inspect WebElement on site and click on button
    WebElement loginbtn= driver.findElement(By.id("login"));
    loginbtn.click();
    Thread.sleep(1000);

	  
  }

@Parameters("browser")
@AfterTest(enabled=true)
public void Exit()
{
	if(browser.equalsIgnoreCase("chrome"))
	{
	//Step 7-Close the Window
	driver.close();
	
	}
}


}
