package Cucumber_BaseActions;

import org.openqa.selenium.WebElement;

import Com_Base.BaseClass;

public class PageActions {
	
	public static void ClickonElement(WebElement ele) {
		ele.click();
	}
	
	
	public static void EnterText(WebElement ele, String text) {
		ele.sendKeys(text);
	}
	
	

}
