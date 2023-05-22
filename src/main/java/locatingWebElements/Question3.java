package locatingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question3 {

	public static String URL = "https://demoqa.com/buttons";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// step2
		driver.get(URL);
		Thread.sleep(3000);

		// double click
		driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		// right click me

		driver.findElement(By.id("rightClickBtn"));

		// click me

		driver.findElement(By.xpath("//button[text()='Click Me']"));

		Thread.sleep(3000);
		driver.quit();

	}

}
