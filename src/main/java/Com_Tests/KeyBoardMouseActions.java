package Com_Tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Com_Base.BaseClass;

public class KeyBoardMouseActions extends BaseClass {
	@Test
	@Ignore
	public void DragandDrop() {
		driver.get("https://demoqa.com/droppable");
		WebElement source =driver.findElement(By.id("draggable"));

		WebElement destination =driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, destination).build().perform();
		WebElement DropMgsElement= driver.findElement(By.xpath("(//div[@id='droppable']/p)[1]"));
		String ActualText= DropMgsElement.getText();
		System.out.println(ActualText);
		assertEquals(ActualText, "Dropped!");
	}
	@Test
	@Ignore

	public void ReadToolTip() {

		driver.get("https://demoqa.com/tool-tips");
		WebElement ButtonHoverOnMe=driver.findElement(By.id("toolTipButton"));
		act.moveToElement(ButtonHoverOnMe).pause(Duration.ofMillis(3000)).build().perform();
		
		String ExpectedToolTip="You hovered over the Button";
		String ActualText=driver.findElement(By.className("tooltip-inner")).getText();
		assertEquals(ExpectedToolTip, ActualText);

	}
	@Test
	@Ignore

	public void ScrollingPage() {

	}
	@Test
	@Ignore

	public void RightClick() throws InterruptedException {
		driver.get("https://demoqa.com/tool-tips");
		WebElement ContraryLinks=driver.findElement(By.linkText("Contrary"));
		//right click
		
		act.contextClick(ContraryLinks).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);

	}
	@Test
	

	public void DoubleClick() throws InterruptedException {
		driver.get("https://demoqa.com/buttons");
		WebElement doubleClickbtn=driver.findElement(By.id("doubleClickBtn"));
		//double click
		
		act.doubleClick(doubleClickbtn).build().perform();
		Thread.sleep(3000);
		String ActualText=driver.findElement(By.id("doubleClickMessage")).getText();
		String ExpectedText="You have done a double click";
		assertEquals(ActualText, ExpectedText);

	}
	@Test
	@Ignore

	public void SendingDataInCapsOn() {

	}
	@Test
	@Ignore
	

	public void HoldandRelease() {
		driver.get("https://demoqa.com/droppable");
		WebElement source =driver.findElement(By.id("draggable"));

		WebElement destination =driver.findElement(By.id("droppable"));
		act.clickAndHold(source).release(destination).build().perform();

		WebElement DropMgsElement= driver.findElement(By.xpath("(//div[@id='droppable']/p)[1]"));
		String ActualText= DropMgsElement.getText();
		System.out.println(ActualText);
		assertEquals(ActualText, "Dropped!");


	}

}
