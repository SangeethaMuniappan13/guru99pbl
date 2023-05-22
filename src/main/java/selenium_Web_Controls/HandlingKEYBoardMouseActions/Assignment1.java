package selenium_Web_Controls.HandlingKEYBoardMouseActions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static String URL = "https://the-internet.herokuapp.com/context_menu";
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
		
			WebElement rectangularBox=driver.findElement(By.xpath("//div[@id='hot-spot']"));
			//right click
			
			act.contextClick(rectangularBox)
			.sendKeys(Keys.ENTER).build().perform();
			
			Alert alert = driver.switchTo().alert(); // switch to alert

			String alertMessage= driver.switchTo().alert().getText();
			
			String Expected="You selected a context menu";
			assertEquals(alertMessage, Expected);
			Thread.sleep(3000);	
	}

	@AfterTest
	public void AfterTest() {
		driver.quit();
	}



}
