package selenium_Web_Controls.WindowsHandlingWebTables;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static String URL = "https://letcode.in/advancedtable";
	public static WebDriver driver;
	public static Actions act;

	@BeforeTest

	public void Beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		act = new Actions(driver);
		// maximize
		driver.manage().window().maximize();

		// implicit wait
		driver.get(URL);
	}

	@Test
	public void TC1() throws InterruptedException {
		int cnt=0;
		
		do {
		String ActualValue=driver.findElement(By.xpath("//table/tbody/tr/td[2]")).getText();
		String currentpageNumber=driver.findElement(By.xpath("//a[@class='paginate_button current']")).getText();
		assertEquals(ActualValue, GetData(Integer.parseInt(currentpageNumber)).toString());
		driver.findElement(By.id("advancedtable_next")).click();
		cnt++;
		
		}while(cnt<10);
		
		

		Thread.sleep(3000);
	}
	
	public static String GetData(int pagenumber) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("University of Aberdeen");
		al.add("Anglia Ruskin University");
		al.add("Middlesex University");
		al.add("University of Wales, Newport");
		al.add("Open University");
		al.add("Queen Mary, University of London");
		al.add("University of Reading");
		al.add("Roehampton University of Surrey");
		al.add("Institute of Latin American Studies, University of London");
		al.add("Saint George's Hospital Medical School, University of London");
		
		return al.get(pagenumber-1);
		
	}
	@AfterTest
	public void AfterTest() {
		driver.quit();
	}
	

}
