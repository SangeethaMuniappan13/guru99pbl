package locatingWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question6 {
	public static String URL = "https://ebay.com/";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();

		// navigate to opencart
		driver.navigate().to(URL);
		Thread.sleep(3000);

		// search something
		WebElement SearchBox = driver.findElement(By.id("gh-ac"));
		SearchBox.sendKeys("Apple");
		
		// dropdown
		WebElement CategoryDD = driver.findElement(By.id("gh-cat"));
		Select sel = new Select(CategoryDD);
		sel.selectByVisibleText("Music");
		
		//
		WebElement SearchButton = driver.findElement(By.id("gh-btn"));
		SearchButton.click();

		String productNameXpath = "//span[@role='heading']";
		int countOfAllProduct = driver.findElements(By.xpath(productNameXpath)).size();

		// loop over all the elements
		List<WebElement> AllProducts = driver.findElements(By.xpath(productNameXpath));
		
		// print all the products
		for (WebElement ele : AllProducts) {
			System.out.println(ele.getText());
			System.out.println(" ");
		}
		
		// print 10 th product
		System.out.println("***********************************************");
		System.out.println("10th product:" + AllProducts.get(10).getText());

		driver.quit();
	}

}
