package selenium_Web_Controls.HandlingDifferentControls;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
// the website given in pbl is not working. So the same concept I implemented in other website
public class Assignment1 {

	public static String URL = "https://demo.guru99.com/test/newtours/register.php";
	public static WebDriver driver;
	public static Actions act;
	
	@BeforeTest

	public static void Beforetest() {
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
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("CANADA");
		
		String Expected="CANADA";
		String Actual=driver.findElement(By.xpath("//option[@value='CANADA']")).getText();
		assertEquals(Actual, Expected);
		Thread.sleep(3000);
	}

	@AfterTest
	public void AfterTest() {
		driver.quit();
	}

}
