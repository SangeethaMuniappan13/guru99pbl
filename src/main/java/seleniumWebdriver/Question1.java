package seleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question1 {
	public static String URL = "https://demo.opencart.com";
	public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// step2
		driver.get(URL);
		
		//get title
		String Title=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println("Title is :"+Title);
		System.out.println("URL is :"+url);
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
