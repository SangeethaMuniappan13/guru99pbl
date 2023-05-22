package Com_Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com_Base.BaseClass;

public class WaitsCode extends BaseClass {

	@Test
	public void TC1() {

		driver.get("https://www.speedtest.net/");
		WebElement GoBtn = driver.findElement(By.xpath("//span[text()='Go']"));
		GoBtn.click();

//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-result-id='true']/a")));

		WebElement ResultsIDData = driver.findElement(By.xpath("//div[@data-result-id='true']/a "));
		String ResultId = ResultsIDData.getText();
		System.out.println(ResultId);
	}

}
