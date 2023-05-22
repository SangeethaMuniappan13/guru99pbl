package locatingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question7 {

	public static String URL = "https://jpetstore.aspectran.com/catalog/";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();

		// navigate petstore
		driver.navigate().to(URL);
		Thread.sleep(3000);
		
		//click on fish
		driver.findElement(By.xpath("//a[text()='Fish']")).click();
		
		//click on 'FI-FW-02'

		driver.findElement(By.xpath("//a[text()='FI-FW-02']")).click();
		
		//click on EST-21
		driver.findElement(By.xpath("//a[text()='EST-21']")).click();
		

		driver.findElement(By.xpath("//a[text()='Add to Cart']")).click();
		Thread.sleep(3000);
		
		//System.out.println(5.29*81.82);
		//fetch price
		WebElement priceElement=driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[7]"));
		String price=priceElement.getText();
		System.out.println(price);
		price=price.substring(1);
		
		double rupee=Double.parseDouble(price);
		double ans=(rupee*(81.82));
		System.out.println(ans);
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		

	}

}
