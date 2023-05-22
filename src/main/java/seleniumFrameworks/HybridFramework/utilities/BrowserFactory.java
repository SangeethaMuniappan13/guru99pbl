package seleniumFrameworks.HybridFramework.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
public static WebDriver startApplication(WebDriver driver, String browserName, String appURL ) {
		
		if(browserName.equals("Chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhargav\\Downloads\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	
		
	}

}
