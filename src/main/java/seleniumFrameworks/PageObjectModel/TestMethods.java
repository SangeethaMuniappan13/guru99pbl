package seleniumFrameworks.PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods {
	public static String URL="https://demo.guru99.com/test/newtours/register.php";
WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
		driver.get(URL);
	}
	
	@Test
	public void registerOperation() {
		
		try {
			
			Guru99RegistrationPage register = new Guru99RegistrationPage(driver);

			register.enterUsername("Sangi@gmail.com");
			register.enterPassword("abc");
			register.enterConfirmPassword("abc");
			register.clickSubmit();
			
		} catch (Exception e) {
			System.out.println();
		}
		
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}

}
