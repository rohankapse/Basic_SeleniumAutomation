package Basic_SeleniumTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateSiteTest {

    public static void main(String[] args) {

        // Make sure you are using the correct version of ChromeDriver
     //   WebDriverManager.chromedriver().setup(); // This should now download the correct version automatically

        WebDriverManager.chromedriver().driverVersion("132.0.6834.162").setup(); // Specify the exact version of ChromeDriver

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.Cricbuzz.com");

        driver.quit();
        
    }
}
