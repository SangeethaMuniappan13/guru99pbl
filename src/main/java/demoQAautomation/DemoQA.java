package demoQAautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com_Base.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQA {
	public static String URL = "https://demoqa.com/automation-practice-form";
	public static WebDriver driver;
	public static Actions act;

	@BeforeTest

	public static void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		act=new Actions(driver);
		// maximize
		driver.manage().window().maximize();

		driver.get(URL);

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@Test
	public void TC1() throws IOException, InterruptedException {
	WebElement Firstname=driver.findElement(By.xpath("//input[@id='firstName']"));

	WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));

		Thread.sleep(3000);
		act.sendKeys(Firstname,getdatafrompropfile("FirstName"))
		.sendKeys(Keys.TAB)
		.sendKeys(lastname,getdatafrompropfile("LastName"))
				.sendKeys(Keys.TAB).sendKeys(email,getdatafrompropfile("Email"))
				.sendKeys(Keys.TAB).build().perform();

		Thread.sleep(3000);
		
		if(getdatafrompropfile("Gender").equals("Male")) {
			driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		}
		else if(getdatafrompropfile("Gender").equals("Female")) {
			act.sendKeys(Keys.TAB);
			driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
		}
		else if(getdatafrompropfile("Gender").equals("Other")) {
			act.sendKeys(Keys.TAB);
			driver.findElement(By.xpath("//label[@for='gender-radio-3']")).click();
		}
		

		//act.sendKeys(driver.findElement(By.xpath("//input[@id='userNumber']")),getdatafrompropfile("Mobile"));
		WebElement Mobile=driver.findElement(By.xpath("//input[@id='userNumber']"));
		WebElement DateofBirth=driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		
		act.sendKeys(Mobile,getdatafrompropfile("Mobile"))
		.sendKeys(DateofBirth,getdatafrompropfile("DateofBirth"))
		.build().perform();
		Thread.sleep(3000);
		
		
		
		WebElement CurrentAddress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		act.sendKeys(CurrentAddress,getdatafrompropfile("CurrentAddress"));
		Thread.sleep(3000);
		

		WebElement Subject=driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
		act.sendKeys(Subject,getdatafrompropfile("Subject"));
		Thread.sleep(3000);
		
			Thread.sleep(3000);
			WebElement SubmitBtn = driver.findElement(By.id("submit"));
			SubmitBtn.submit();
			Thread.sleep(3000);
		}

	

	public static String getdatafrompropfile(String key) throws IOException, InterruptedException {
		String locationofFile = "/Users/SA20463801/eclipse-workspace/guru99pbl/utilities/DataProp.properties";

		File filecon = new File(locationofFile);

		FileInputStream fis = new FileInputStream(filecon);

		// reading the data from prop file
		Properties prop = new Properties();

		prop.load(fis);

		String value = prop.getProperty(key);

		return value;

	}

	@AfterTest
	public void end() {
		driver.quit();
	}

}
