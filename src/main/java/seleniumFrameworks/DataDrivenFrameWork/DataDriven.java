package seleniumFrameworks.DataDrivenFrameWork;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDriven {
	public static String URL = "https://demo.guru99.com/test/newtours/register.php";
	public static WebDriver driver;
	@Test(dataProvider = "testdata")
	public void TC1(String username, String password, String ConfirmPassword) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(ConfirmPassword);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		WebElement RegisterSuccessfulElement=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b"));
		
		String RegisterSuccessful=RegisterSuccessfulElement.getText();
		assertEquals(RegisterSuccessful, "Dear  ,");
		driver.quit();
//		
	}
	
	
	@DataProvider(name="testdata")
	public Object[][] testDataExample(){
		ExcelData configuration = new ExcelData("/Users/SA20463801/eclipse-workspace/guru99pbl/src/main/java/seleniumFrameworks/DataDrivenFrameWork/utilities/DataExcel.xlsx");
	int rows = configuration.getRowCount(0);
	Object[][]signin_credentials = new Object[rows][3];

	for(int i=0;i<rows;i++)
	{
	signin_credentials[i][0] = configuration.getData(0, i, 0);
	signin_credentials[i][1] = configuration.getData(0, i, 1);

	signin_credentials[i][2] = configuration.getData(0, i, 2);
	}
	return signin_credentials;
	}
	
	@AfterTest
	public void end() {
		driver.quit();
	}
	

}
