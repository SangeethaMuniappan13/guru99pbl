package TestNG_PBL.Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng_Demo {
	public static String URL = "https://demo.guru99.com/test/newtours/index.php";
	public static WebDriver driver;
	public static Actions act;

	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		act = new Actions(driver);
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='text' and @name='userName']"))
		.sendKeys("tutorial");
		act.sendKeys(Keys.TAB);

		driver.findElement(By.xpath("//input[@type='password' and @name='password']"))
		.sendKeys("tutorial");
		act.sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//input[@type='submit' and @name='submit']")).click();
		
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
