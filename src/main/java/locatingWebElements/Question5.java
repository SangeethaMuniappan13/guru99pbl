package locatingWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question5 {
	public static String URL = "https://www.flipkart.com/";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// navigate to opencart
		driver.navigate().to(URL);
		
		//count of links
		System.out.println("count of url: ");
		System.out.println(driver.findElements(By.tagName("a")).size());
		//collection of links
		String LinksnameXpath="//a";
		List<WebElement> allLinks=driver.findElements(By.xpath(LinksnameXpath));
		//print all products
		for(WebElement links: allLinks) {
			System.out.println(links.getAttribute("href"));
			System.out.println();
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
