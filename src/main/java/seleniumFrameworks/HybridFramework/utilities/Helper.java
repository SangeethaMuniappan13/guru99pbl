package seleniumFrameworks.HybridFramework.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	//Screenshot, alerts, frames, windows, Sync issue, javascript Executor
	
		public static void captureScreenshot(WebDriver driver) {
			
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			try {
				FileHandler.copy(srcFile, new File("/Users/SA20463801/eclipse-workspace/guru99pbl/src/main/java/seleniumFrameworks/HybridFramework/Screenshots" + getCurrentDateTime()+".png"));
			} catch (IOException e) {
				System.out.println("Unable to capture Screenshot"+e.getMessage());
			}
		}
		
		public static String getCurrentDateTime() {
			
			DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
			
			Date currentDate = new Date();
			
			return customFormat.format(currentDate);
		}


}
