package selenium_Web_Controls.HandlingAlerts_TakingScreenshots;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static String URL = "https://demoqa.com/alerts";
	public static WebDriver driver;
	public static Actions act;

	@BeforeTest

	public void Beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		act = new Actions(driver);
		// maximize
		driver.manage().window().maximize();
		// implicit wait
		driver.get(URL);
	}

	@Test
	public void TC1() throws InterruptedException {
		WebElement YesORNoAlert=driver.findElement(By.id("confirmButton"));
		YesORNoAlert.click();

		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
	}
	@AfterTest
	public void AfterTest() {
		driver.quit();
	}

}
