package selenium_Web_Controls.ExceptionHandlingJavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	
	public static String URL = "https://www.amazon.com";
	public static WebDriver driver;

	@Test
	public void scrollDown() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
		// to perform Scroll on application using Selenium
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
    
		driver.findElement(By.xpath("//a[text()='Sign in securely']")).click();
		driver.quit();
	}

}
