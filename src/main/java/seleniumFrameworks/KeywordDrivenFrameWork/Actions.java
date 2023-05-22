package seleniumFrameworks.KeywordDrivenFrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions {

	public static final String URL = "https://demo.guru99.com/test/newtours/login.php"; 
	public static WebDriver driver; 
	public static final String username = "tutorial"; 
	public static final String password = "tutorial";

	public void openBrowser() 
	{

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(); 
	driver.manage().window().maximize(); 
	} 
	public void navigate() 
	{ 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	driver.get(URL); 
	} 
	public void enterEmail() 
	{ 
	driver.findElement(By.name("userName")).sendKeys(username); 
	} 
	public void enterPassword() 
	{ 
	driver.findElement(By.name("password")).sendKeys(password); 
	} 
	public void clickSignIn() 
	{ 
	driver.findElement(By.name("submit")).click(); 
	}

	public void logout() 
	{ 
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click(); 
	} 
	public void closeBrowser() 
	{ 
	driver.quit(); 
	}

}
