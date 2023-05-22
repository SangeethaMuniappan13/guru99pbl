package selenium_Web_Controls.HandlingKEYBoardMouseActions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

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

//seleniumeasy is not working. Instead of that demoqa website is used for this assignment

public class Assignment2 {
	
		public static String URL = "https://demoqa.com/tool-tips";
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
			
			
			WebElement ButtonHoverOnMe=driver.findElement(By.id("toolTipButton"));
			act.moveToElement(ButtonHoverOnMe).pause(Duration.ofMillis(3000)).build().perform();
			
			String ExpectedToolTip="You hovered over the Button";
			String ActualText=driver.findElement(By.className("tooltip-inner")).getText();
			assertEquals(ExpectedToolTip, ActualText);

				Thread.sleep(3000);
		}
		@AfterTest
		public void AfterTest() {
			driver.quit();
		}
}
