package Com_Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	//public static String ChromedriverPath = "/Users/SA20463801/Downloads/CD Folder/CD";
	public static String URL = "https://demoqa.com/automation-practice-form";
	public static WebDriver driver;
	public static Actions act;

	@BeforeTest
	public static void start() {

		// launch the application in chrome
		//System.setProperty("webdriver.chrome.driver", ChromedriverPath);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		act = new Actions(driver);
		// maximize
		driver.manage().window().maximize();

		// implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// navigate to opencart
		driver.get(URL);

	}
	

@AfterTest
	public static void end() {
		driver.quit();

	}

}
