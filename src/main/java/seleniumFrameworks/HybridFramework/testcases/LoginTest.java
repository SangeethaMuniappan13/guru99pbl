package seleniumFrameworks.HybridFramework.testcases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import seleniumFrameworks.HybridFramework.pages.HybridBase;
import seleniumFrameworks.HybridFramework.pages.loginPage;

public class LoginTest extends HybridBase{
WebDriver driver;
	
	@Test
   public void loginApp() throws FileNotFoundException {
		
		
		
		loginPage pagelogin = PageFactory.initElements(driver, loginPage.class);
		pagelogin.loginToApp(excel.getStringData(1, 1, 1), excel.getStringData(1, 1, 1));
		

	   
   }

}
