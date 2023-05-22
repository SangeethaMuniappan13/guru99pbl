package Com_Tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Com_Base.BaseClass;

public class HandleWindows extends BaseClass{
	@Test
	@Ignore
	public void TC1() throws InterruptedException {
		driver.get("https://demoqa.com/browser-windows");
		
		WebElement NewTab=driver.findElement(By.xpath("//button[@id=\"tabButton\"]"));
		NewTab.click();
		//switch to new
		Set<String> NamesOfAllWindows=driver.getWindowHandles();
		System.out.println("Total window open is: "+NamesOfAllWindows.size());
		//iterator class
		for(String currentWin:NamesOfAllWindows ) {
			driver.switchTo().window(currentWin);
			System.out.println("window handle: "+currentWin);
			Thread.sleep(3000);
			System.out.println("window title:"+driver.getCurrentUrl());
		}
	}
	
	@Test
	public void AlertsTask() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		//4 alert buttons
		WebElement NormalAlert=driver.findElement(By.id("alertButton"));
		WebElement YesORNoAlert=driver.findElement(By.id("confirmButton"));
		WebElement EnterTextlert=driver.findElement(By.id("promtButton"));
		WebElement AfterFiveSelectAlert=driver.findElement(By.id("timerAlertButton"));
		//click on first and accept
		NormalAlert.click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		// 
		//click on 3rd button and dismiss
		YesORNoAlert.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		//fetch the text of an alert
		YesORNoAlert.click();
		Thread.sleep(3000);
		String TextOfAlert=driver.switchTo().alert().getText();
		System.out.println("Text of alert :"+TextOfAlert);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		//send data to alert
		EnterTextlert.click();
		
		driver.switchTo().alert().sendKeys("Data from Alert");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String DataSent=driver.findElement(By.id("promptResult")).getText();
		System.out.println("DataSent : "+DataSent);
		
	}
	

}
