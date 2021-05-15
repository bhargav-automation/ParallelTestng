package Testng.Paralle1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {

	
	 WebDriver driver;
	 @Test
	 @Parameters("Browser")
	 public void startbrowser(String Browser)
	 {
		 
		 Browser = "chrome";
		 if(Browser.equalsIgnoreCase("chrome") )
		 {
			 System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			 driver = new ChromeDriver();
		 }
		 else if(Browser.equalsIgnoreCase("firefox"))
		 {
			 System.setProperty("webdriver.gecko.driver", "drivers//Geckodriver.exe");
			 driver = new FirefoxDriver();
		 }
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.facebook.com");
	 }
}
