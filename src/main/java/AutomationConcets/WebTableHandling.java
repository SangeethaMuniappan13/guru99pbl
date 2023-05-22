package AutomationConcets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {
	public static String URL = "https://letcode.in/table";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		//table
		WebElement Table=driver.findElement(By.id("simpletable"));
		
		//Read the number of headers
		int totalHeaders =Table.findElements(By.tagName("th")).size();
		
		System.out.println("Header count :"+totalHeaders);
		
		//Header Names
		List<WebElement> HeaderCollection=Table.findElements(By.tagName("th"));
		
		for(WebElement currentHeader : HeaderCollection) {
			System.out.println(currentHeader.getText());
		}
		
		int totalRowCount =Table.findElements(By.tagName("tr")).size();
		System.out.println("Row count: "+totalRowCount);
		
		List<WebElement> RowsCollection=Table.findElements(By.tagName("tr"));
		for(WebElement currentRow : RowsCollection) {
			List<WebElement> ColumnCollection=currentRow.findElements(By.tagName("td"));
			for(WebElement currentcol: ColumnCollection) {
				String cellData=currentcol.getText();
				if(cellData.equals("Raj")) {
					
					currentRow.findElement(By.tagName("input")).click();
					//driver.findElement(By.xpath("//input")).click();
				}
				System.out.println(cellData);
			}
		}
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}

}
