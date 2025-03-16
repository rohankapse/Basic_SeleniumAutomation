package Basic_SeleniumTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redirect_Test 
{
	      WebDriver driver;

	      @BeforeClass
	      public void setUp() {
	          // Set up WebDriverManager to download and set up the appropriate ChromeDriver version automatically
	          WebDriverManager.chromedriver().setup();

	          // Create a new ChromeDriver instance
	          driver = new ChromeDriver();
	      }

	      @Test
	      public void navigateToCricbuzz() {
	          // Navigate to Cricbuzz website
	          driver.get("https://www.cricbuzz.com");

	          // Assert the title to make sure the page is loaded
	          String pageTitle = driver.getTitle();
	          Assert.assertTrue(pageTitle.contains("Cricbuzz"));
	      }

	      @AfterClass
	      public void tearDown() {
	          // Close the browser
	          driver.quit();
	      }
	   
  }

