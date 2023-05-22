package Com_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Com_Base.BaseClass;

public class VerificationControlMethods extends BaseClass {
	@Test
	public void TC1() throws InterruptedException {
		//displayed
		WebElement PageTitle=driver.findElement(By.xpath("//h5"));
		System.out.println("page title displayed :"+PageTitle.isDisplayed());
		
		//Scroll the page
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		
		//is selected
		Thread.sleep(3000);
		WebElement SportsCheckBox=driver.findElement(By.xpath("//input[@type='checkbox' and @id='hobbies-checkbox-1']"));
		System.out.println("Before Checking:"+SportsCheckBox.isSelected());
		SportsCheckBox.click();
		System.out.println("After Checking :"+SportsCheckBox.isSelected());

	}

}
