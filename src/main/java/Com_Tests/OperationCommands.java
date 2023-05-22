package Com_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Com_Base.BaseClass;

public class OperationCommands extends BaseClass{
	@Test
	public void TC1() {
		//send keys and clear
		WebElement namefield=driver.findElement(By.xpath("//input[@id='lastName']"));
		namefield.sendKeys("Sangeetha");
		namefield.clear();
		namefield.sendKeys("Muniappan");
		
		//click
	//	WebElement MaleRadioButton= driver.findElement(By.id("gender-radio-1"));
		
	//	MaleRadioButton.click();
		//submit
		WebElement SubmitBtn=driver.findElement(By.id("submit"));
		SubmitBtn.submit();

		
	}

}
