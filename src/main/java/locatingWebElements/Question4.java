package locatingWebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question4 {

	public static String URL1 = "https://demo.opencart.com";

	public static String URL2 = "http://www.facebook.com";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// navigate to opencart
		driver.navigate().to(URL1);
		Thread.sleep(3000);
		// validate title
		String Title = driver.getTitle();
		if (Title.equals("Your Store")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		// navigate to facebook
		driver.navigate().to(URL2);

		Thread.sleep(3000);
		
		//navigate back
		driver.navigate().back();

		Thread.sleep(3000);
		
		//URL of the current page
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(3000);
		
		//navigate forward
		driver.navigate().forward();

		Thread.sleep(3000);
		
		//reload page
		driver.navigate().refresh();
		
		//close the browser
		

		Thread.sleep(3000);
		driver.quit();

	}

}
