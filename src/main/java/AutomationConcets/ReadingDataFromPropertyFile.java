package AutomationConcets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingDataFromPropertyFile {
	public static String URL1 = "https://demo.opencart.com";

	public static String URL2 = "http://www.facebook.com";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// navigate to opencart
		driver.navigate().to(URL1);
		Thread.sleep(3000);

		// click My Account

		driver.findElement(By.xpath("//span[text()='My Account']")).click();

		// click on register
		driver.findElement(By.linkText("Login")).click();
		
		String EmailfromPropFile=getdatafrompropfile("Email");
		String PasswordfromPropFile=getdatafrompropfile("pass");
		
		//email ans password
		driver.findElement(By.id("input-email")).sendKeys(EmailfromPropFile);

		driver.findElement(By.id("input-password")).sendKeys(PasswordfromPropFile);
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	public  static String getdatafrompropfile(String key) throws IOException, InterruptedException {
		String locationofFile="/Users/SA20463801/eclipse-workspace/guru99pbl/utilities/DataProp.properties";
		
		File filecon=new File(locationofFile);
		
		FileInputStream fis=new FileInputStream(filecon);
		
		//reading the data from prop file
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String value=prop.getProperty(key);

		
		
		return value;

	
		
	}

}
