package locatingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question2 {

	public static String URL = "https://demo.opencart.com";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// step2
		driver.get(URL);
		Thread.sleep(3000);

		// click My Account

		driver.findElement(By.xpath("//span[text()='My Account']")).click();

		// click on register
		driver.findElement(By.linkText("Register")).click();
		
		//
		String nameofFristname=driver.findElement(By.name("firstname")).getAttribute("name");
		String nameofLastname=driver.findElement(By.name("lastname")).getAttribute("name");

		String nameofEmail=driver.findElement(By.name("email")).getAttribute("name");
		String nameofPassword=driver.findElement(By.name("password")).getAttribute("name");
		
		System.out.println("name of First name is:"+nameofFristname+"\n"+"name of Password:"+nameofLastname+"name of email is:"+nameofEmail+"\n"+"name of Password:"+nameofPassword);
		

		Thread.sleep(3000);
		driver.quit();
		

	}

}
