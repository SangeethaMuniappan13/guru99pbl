package selenium_Web_Controls.PageSynchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static String URL = "https://www.speedtest.net/";
	public static WebDriver driver;
	public static Actions act;
//Due to dependencies version issues implicit and explicit wait method cannot be implemented in this program.
	//All code for wait method is written in command lines
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
		
		WebElement GoBtn = driver.findElement(By.xpath("//span[text()='Go']"));
		GoBtn.click();
		//code for explicit wait

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-result-id='true']/a")));

//		
    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
    	WebElement ResultsIDData = driver.findElement(By.xpath("//div[@data-result-id='true']/a "));
		String ResultId = ResultsIDData.getText();
		System.out.println(ResultId);
		


		Thread.sleep(3000);
	}
	@AfterTest
	public void AfterTest() {
		driver.quit();
	}


}
