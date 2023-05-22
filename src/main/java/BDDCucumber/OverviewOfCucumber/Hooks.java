package BDDCucumber.OverviewOfCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	public static String URL = "https://petstore.octoperf.com";
	public static WebDriver driver;

	@Before
	public static void start() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		//driver.get(URL);
		// System.out.println("Hooks start");

	}

	@After
	public static void end() {
		driver.quit();
		// System.out.println("Hooks end");

	}

}
