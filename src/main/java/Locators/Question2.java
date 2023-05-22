package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question2 {

	public static String URL = "https://demo.guru99.com/selenium/newtours/";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// launch the app in chrome
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// step2
		driver.get(URL);

		// enter username
		String XpathForUserName = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input";
		driver.findElement(By.xpath(XpathForUserName)).sendKeys("tutorial");

		// enter password
		String XpathForPassword = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input";
		driver.findElement(By.xpath(XpathForPassword)).sendKeys("tutorial");
		
		
		//click signin
		String XpathForSignIN="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input";
		driver.findElement(By.xpath(XpathForSignIN)).click();
		
		//click Flight
		String XpathForFlights="/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a";
		driver.findElement(By.xpath(XpathForFlights)).click();
		
		
		//click signoff
		String XpathForSignOff="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a";
		driver.findElement(By.xpath(XpathForSignOff)).click();
		

		Thread.sleep(3000);
	}

}
