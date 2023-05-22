package seleniumFrameworks.HybridFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {
WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(name = "userName") WebElement unam;
	
	@FindBy(name="password") WebElement password;
	
	@FindBy(name="submit") WebElement loginButton;
	
	
	public void loginToApp(String username, String password1) {
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		unam.sendKeys(username);
		password.sendKeys(password1);
		loginButton.click();
	}


}
