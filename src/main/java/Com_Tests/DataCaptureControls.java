package Com_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Com_Base.BaseClass;

public class DataCaptureControls extends BaseClass {
	@Test
	public void TC1() {
		// get text
		// get attribute
		// get css value

		WebElement PageTitle = driver.findElement(By.xpath("//h5"));
		String actualColour = PageTitle.getCssValue("color");
		System.out.println("Expected :#212529  " + "Actual color:" + actualColour);
		// get size
		System.out.println("page title get size: "+PageTitle.getSize());
		//get text

		System.out.println("page title get text: "+PageTitle.getText());
		
		
		// getLocation

		System.out.println("page title get location: "+PageTitle.getLocation());
		
	}

}
