package seleniumFrameworks.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Guru99RegistrationPage {
WebDriver driver;
	
	public Guru99RegistrationPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	

public void enterUsername(String username) {
	
	driver.findElement(By.name("email")).sendKeys(username);

	
}
public void enterPassword(String password) {
	
	driver.findElement(By.name("password")).sendKeys(password);

	
}
public void enterConfirmPassword(String confirmPassword) {
	
	driver.findElement(By.name("confirmPassword")).sendKeys(confirmPassword);

	
}
public void clickSubmit() {
	
	driver.findElement(By.name("submit")).click();

	
}

}
