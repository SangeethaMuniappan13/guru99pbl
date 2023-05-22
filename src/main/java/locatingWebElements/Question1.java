package locatingWebElements;

import org.openqa.selenium.By;
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
		Thread.sleep(3000);

		// click My Account

		driver.findElement(By.xpath("//span[text()='My Account']")).click();

		// click on login
		driver.findElement(By.linkText("Login")).click();
		
		//email and password

		driver.findElement(By.id("input-email")).sendKeys("sangi");

		driver.findElement(By.id("input-password")).sendKeys("1234");
		
		//getAtrributues
		String IdofEmail=driver.findElement(By.id("input-email")).getAttribute("id");
		String IdofPassword=driver.findElement(By.id("input-password")).getAttribute("id");
		System.out.println("Id of email is:"+IdofEmail+"\n"+"Id of Password:"+IdofPassword);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
