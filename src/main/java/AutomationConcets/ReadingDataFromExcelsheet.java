package AutomationConcets;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingDataFromExcelsheet {
	public static String URL1 = "https://demo.opencart.com";

	public static String URL2 = "http://www.facebook.com";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// navigate to opencart
		driver.navigate().to(URL1);
		Thread.sleep(3000);

		// click My Account

		driver.findElement(By.xpath("//span[text()='My Account']")).click();

		// click on register
		driver.findElement(By.linkText("Login")).click();

		String EmailfromPropFile = getdatafromExcelfile(0, 0);
		String PasswordfromPropFile = getdatafromExcelfile(0, 1);

		// email ans password
		driver.findElement(By.id("input-email")).sendKeys(EmailfromPropFile);

		driver.findElement(By.id("input-password")).sendKeys(PasswordfromPropFile);
		Thread.sleep(3000);
		driver.quit();
	}

	public static String getdatafromExcelfile(int row, int col) throws IOException {
		String locationofFile = "/Users/SA20463801/eclipse-workspace/guru99pbl/utilities/DataSheet.xlsx";

		File filecon = new File(locationofFile);

		FileInputStream fis = new FileInputStream(filecon);

		// reading the data from excel sheet
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		String value = sheet.getRow(row).getCell(col).getStringCellValue();

		return value;

	}

}
