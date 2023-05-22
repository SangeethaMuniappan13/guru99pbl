package AutomationConcets;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShotMethod {
	public static String URL = "https://letcode.in/table";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		//driver typecasting
		
		TakesScreenshot scrshot=((TakesScreenshot)driver);
		//take screenshot
		File srcfile=scrshot.getScreenshotAs(OutputType.FILE);
		//copy file to desired location
		String DestAddress="/Users/SA20463801/eclipse-workspace/guru99pbl/Screenshots/one.png";
		File fileDest=new File(DestAddress);
		FileUtils.copyFile(srcfile, fileDest);
		
		
		driver.quit();
		
		
	}

}
