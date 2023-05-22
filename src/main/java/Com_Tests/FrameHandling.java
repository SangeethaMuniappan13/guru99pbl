package Com_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Com_Base.BaseClass;

public class FrameHandling extends BaseClass{
	@Test
	public void FrameHandling() throws InterruptedException {
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame("firstFr");
		WebElement FirstName=driver.findElement(By.name("fname"));
		FirstName.sendKeys("Sangeetha");
		Thread.sleep(3000);
		
		//driver.switchTo().frame(0);
		WebElement LastName=driver.findElement(By.name("lname"));
		LastName.sendKeys("Muniappan");
		Thread.sleep(3000);
		
		WebElement FrameForEmail=driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(FrameForEmail);
		driver.findElement(By.name("email")).sendKeys("san@gmail.com");
		
		//Using parent Frame
		driver.switchTo().parentFrame();
		FirstName.clear();
		FirstName.sendKeys("New data after parent frame switch");
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		String Title=driver.findElement(By.xpath("//h1[contains(@class,'is-title')]")).getText();
		System.out.println(Title);
//		 driver.switchTo().frame(1);
//		 FrameForEmail.clear();
//		 FrameForEmail.sendKeys("sangi@gmail.com");
//		
		
	}

}
