package seleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question2 {
	public static String URL = "https://demo.guru99.com/test/newtours/login.php";
	public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// step2
		driver.get(URL);

		Thread.sleep(3000);
		driver.quit();

		
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
		driver.manage().window().maximize();

		// step2
		driver.get(URL);
		
		
		
		
		Thread.sleep(3000);
		driver.quit();


	}

}
